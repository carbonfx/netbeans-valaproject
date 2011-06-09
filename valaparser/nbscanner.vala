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

Where TokenType is integer value of token, specified by Vala.TokenType enum in libvala.vapi

*/


const string CMD_END = "]\"\"\"end";
const string CMD_BEGIN = "]\"\"\"begin";
const string CMD_QUIT = "]\"\"\"quit";

const string TOKENS_BEGIN = "]tokens";
const string TOKENS_END = "]end";

int main(string[] args) {

	while (!stdin.eof()) {
		string? line = stdin.read_line ();
		if (line == CMD_QUIT || line == null) {
			break;
		}

		if (line == CMD_BEGIN) {
			string file_name = stdin.read_line();
			var sb = new StringBuilder();
			while (!stdin.eof()) {
				string? file_line = stdin.read_line ();
		        if (file_line == CMD_END || file_line == null) {
		            break;
		        }
				
				sb.append(file_line);
				sb.append("\n");
			}
			parse_file(file_name, sb.str);
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
	public int token_type { get; set; }
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

void parse_file(string file_name, string content) {
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
		t.token_type = (int)token;
		tokens.add(t);
	}

	println(TOKENS_BEGIN);
	foreach(Token t in tokens) {
		println("%x%x,%x:%x,%x", t.begin_line, t.begin_column, t.end_line, t.end_column, t.token_type);
	}
	println(TOKENS_END);
		
//	foreach (var c in src.get_comments()) {
//		stdout.printf("\nComment: %s\n ref: %s\n", c.content, c.source_reference.to_string());
//	}
}
