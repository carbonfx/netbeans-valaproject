
const string CMD_END = "]\"\"\"end";
const string CMD_BEGIN = "]\"\"\"begin";
const string CMD_QUIT = "]\"\"\"quit";

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

void parse_file(string file_name, string content) {
	var ctx = new Vala.CodeContext();
    Vala.CodeContext.push(ctx);
    ctx.basedir = ".";

    var src = new Vala.SourceFile(ctx, Vala.SourceFileType.SOURCE, file_name, content);
    ctx.add_source_file(src);

	var scanner = new Vala.Scanner(src);
	Vala.SourceLocation token_begin, token_end;

	while (true) {
		scanner.parse_file_comments();
		var token = scanner.read_token(out token_begin, out token_end);
		if (token == Vala.TokenType.EOF) {
			break;
		}

		string text = null;
		if (token_begin.pos != null && token_end.pos > token_begin.pos) {
			size_t len = token_end.pos - token_begin.pos;
			uint8[] str = new uint8[len+1];
			uint8* ptr = token_begin.pos;
			for (var i = 0; i < len; ++i, ptr) {
				str[i] = ptr[i];
			}
			str[len]=0;

			text = (string)str;
		}

		stdout.printf("%s: %s\n", token.to_string(), text);
	}
	
	foreach (var c in src.get_comments()) {
		stdout.printf("\nComment: %s\n ref: %s\n", c.content, c.source_reference.to_string());
	}
}
