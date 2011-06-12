/*

Performs lexical scan of Vala program and outputs in easy for use format (for NB Java plugin).

After begin command from stdin, expected one line of file name them content with file. At the end of file content use 'end command' to stop parsing'.
Commands defined bellow as constants.

Output format is per each line (doesn't includes divider lines):

===========================
Tokens
[TokenLine1]
...
[TokenLineN]
===========================

Format of TokenLineX is:
StartLine:Column,EndLine:Column,TokenType

Lines are sorted by token position (ascending).

Where TokenType is a name of token see an enum in libvala.vapi plus additional values for comments

*/


const string CMD_END = "]\"\"\"end";
const string CMD_BEGIN = "begin";
const string CMD_QUIT = "quit";
const string CMD_DEBUG = "debug";

const string TOKENS_BEGIN = "]tokens";
const string TOKENS_END = "]end";

bool debug_mode = false;
FileOutputStream? debug_log = null;

int main(string[] args) {

	while (!stdin.eof()) {
		string? line = stdin_read_line ();
		if (line == CMD_QUIT || line == null) {
			break;
		}

		if (line == CMD_DEBUG) {
			debug_mode = true;
			var f = File.new_for_path("/tmp/vala-parser.log");
			try {
				debug_log = f.create(FileCreateFlags.REPLACE_DESTINATION, null);
			}
			catch(GLib.Error io) {
				
			}
		}

		if (line == CMD_BEGIN) {
			string file_name = stdin_read_line();
			var sb = new StringBuilder();
			var str_array = new Gee.ArrayList<string>();	
			while (!stdin.eof()) {
				string? file_line = stdin_read_line(false);
		        if (file_line == CMD_END || file_line == null) {
		            break;
		        }
				
				sb.append(file_line);
				sb.append("\n");
				str_array.add(file_line);
			}
			parse_file(file_name, sb.str, str_array);
		}
		else {
			stdout.printf("Please enter one of the commands: %s, %s\n", CMD_BEGIN, CMD_QUIT);
		}
	}
	
	return 0;
}

public class Token : Object {
	public int begin_line { get; set; }
	public int end_line { get; set; }
	public int begin_column { get; set; }
	public int end_column { get; set; }
	public string token_type { get; set; }
}

public int token_compare(Token a, Token b) {
	int64 a64 = ((int64)a.begin_line) << 32 | (int64)a.begin_column;
	int64 b64 = ((int64)b.begin_line) << 32 | (int64)b.begin_column;
	if (a64 > b64)
		return 1;
	else
	if (a64 < b64)
		return -1;
	else
		return 0;
}

void println(string format, ...) {
	var v = va_list();
	stdout.vprintf(format, v);
	stdout.putc('\n');
}

void parse_file(string file_name, string content, Gee.ArrayList<string> str_array) {
	var ctx = new Vala.CodeContext();
    Vala.CodeContext.push(ctx);
    ctx.basedir = ".";

    var src = new Vala.SourceFile(ctx, Vala.SourceFileType.SOURCE, file_name, content);
    ctx.add_source_file(src);

	var scanner = new Vala.Scanner(src);
	Vala.SourceLocation token_begin, token_end;

	var tokens = new Gee.TreeSet<Token>((CompareFunc)token_compare);

	while (true) {
		scanner.parse_file_comments();
		var token = scanner.read_token(out token_begin, out token_end);
		if (token == Vala.TokenType.EOF) {
			break;
		}

		Token t = new Token();
		t.begin_line = token_begin.line;
		t.begin_column = token_begin.column;
		t.end_line = token_end.line;
		t.end_column = token_end.column;

		string full_token_name = ((EnumClass)typeof (Vala.TokenType).class_ref()).get_value(token).value_name;
		string prefix = "VALA_TOKEN_TYPE_";
		string token_name = full_token_name;

		if (full_token_name.index_of(prefix) == 0) {
			token_name = full_token_name.substring(prefix.char_count());
		}
		t.token_type = token_name;

		tokens.add(t);
	}

	foreach (var c in src.get_comments()) {
		
		Token t = new Token();
        t.begin_line = c.source_reference.first_line;
        t.begin_column = c.source_reference.first_column;

		string s = str_array.get(t.begin_line-1);
		s = s.substring(t.begin_column-1);

		s = s.next_char();
		unichar c2 = s.get_char();
		
		if (c2 == '/') {
			t.token_type = "LINE_COMMENT";
			t.end_line = t.begin_line;
			t.end_column = c.content.char_count();
		}
		else {
			t.token_type = "COMMENT";
			s = c.content;
			int line = t.begin_line;
			int column = t.begin_column;
			for (;;) {
				c2 = s.get_char();
				if (c2 == 0) break;
				s = s.next_char();
				if (c2 == '\n') {
					++line;
					column = 1;
				}
				else {
					++column;
				}
			}
			t.end_line = line;
			t.end_column = column+1;
		}

		tokens.add(t);
	}

	println(TOKENS_BEGIN);
	foreach(Token t in tokens) {
		println("%x:%x,%x:%x,%s", t.begin_line, t.begin_column, t.end_line, t.end_column, t.token_type);
	}
	println(TOKENS_END);
}

public string? stdin_read_line(bool divide = true) {
	string? result = stdin.read_line();

	if (debug_mode) {
		try {
			if (divide) debug_log.write("----->>\n".data);
			debug_log.write(result.data);
			if (divide) debug_log.write("-----\n".data);
		}
		catch(GLib.IOError io) {
			
		}
	}

	return result;
}