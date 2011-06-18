/*

Performs lexical scan of Vala program and outputs in easy for use format (for NB Java plugin).

After begin command from stdin, expected one line of file name them content with file. At the end of file content use 'end command' to stop parsing'.
Commands defined bellow as constants.

Output format is per each line (doesn't includes divider lines):

===========================
]tokens
[TokenLine1]
...
[TokenLineN]
]end
===========================

Format of TokenLineX is:
FirstLine,FirstColumn,LastLine,LastColumn,TokenType

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

	logd("Started");

	while (!stdin.eof()) {
		string? line = stdin_read_line ();
		if (line == CMD_QUIT || line == null) {
			logd("got quit command - exiting");
			break;
		}
		if (line == null) {
			logd("stdin is closed - exiting");
			break;
		}

		if (line == CMD_DEBUG) {
			enable_debug_mode();
			logd("enabled debug mode");
		}
		else
		if (line == CMD_BEGIN) {
			logd("beginning to parse file");
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
	public int first_line { get; set; }
	public int last_line { get; set; }
	public int first_column { get; set; }
	public int last_column { get; set; }
	public string token_type { get; set; }
}

public int token_compare(Token a, Token b) {
	int64 a64 = ((int64)a.first_line) << 32 | (int64)a.first_column;
	int64 b64 = ((int64)b.first_line) << 32 | (int64)b.first_column;
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
	var s = new StringBuilder();
	s.vprintf(format, v);
	
	stdout.write(s.str.data);
	stdout.putc('\n');
	stdout.flush();

	if (debug_mode) {
		logd("- " + s.str);
	}
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
		t.first_line = token_begin.line;
		t.first_column = token_begin.column;
		t.last_line = token_end.line;
		t.last_column = token_end.column;

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
		t.first_line = c.source_reference.first_line;
		t.first_column = c.source_reference.first_column;

		string s = str_array.get(t.first_line-1);
		s = s.substring(t.first_column-1);

		s = s.next_char();
		unichar c2 = s.get_char();
		
		if (c2 == '/') {
			t.token_type = "LINE_COMMENT";
			t.last_line = t.first_line;
			t.last_column = c.content.char_count() + t.first_column + 1;
		}
		else {
			t.token_type = "COMMENT";
			s = c.content;
			int line = t.first_line;
			int column = t.first_column;
			for (;;) {
				c2 = s.get_char();
				if (c2 == 0) break;
				s = s.next_char();
				if (c2 == '\n') {
					++line;
					column = 0;
				}
				else {
					++column;
				}
			}
			t.last_line = line;
			t.last_column = column + 2;
		}

		tokens.add(t);
	}

	println(TOKENS_BEGIN);
	foreach(Token t in tokens) {
		println("%x,%x,%x,%x,%s", t.first_line, t.first_column, t.last_line, t.last_column, t.token_type);
	}
	println(TOKENS_END);
}

public void logd(string msg, bool divide = false) {
	if (debug_mode) {
		try {
			if (divide) debug_log.write("----->>\n".data);
			debug_log.write(msg.data);
			debug_log.write("\n".data);
			if (divide) debug_log.write("-----\n".data);
		}
		catch(GLib.IOError io) {
			
		}
	}
}

public string? stdin_read_line(bool divide = true) {
	string? result = stdin.read_line();
	logd(result, divide);
	return result;
}

public void enable_debug_mode() {
	debug_mode = true;
	var f = File.new_for_path("vala-parser.log");
	try {
		if(f.query_exists(null)) {
			f.delete(null);
		}

		debug_log = f.create(FileCreateFlags.REPLACE_DESTINATION, null);
	}
	catch(GLib.Error error) {
		stdout.printf("Failed to create log file: %s\nDebug mode is disabled.\n", error.message);
		debug_mode = false;
	}
}
