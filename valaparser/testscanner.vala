
int main(string[] args) {

	stdout.printf("Argument length: %i\n", args.length);
	stdout.printf("Arg1: %s\n", args[1]);

	var ctx = new Vala.CodeContext();
    Vala.CodeContext.push(ctx);
    ctx.basedir = ".";
    // ff ctx.add_define("TEST");
	// привет
	

	string s = "пока\"ппппккк";
	string s2 = """
class
""";
	string s3 = @"hello";
	var s4 = /.*/;
	string file_name = args[1];
	
	/* test */

    var src = new Vala.SourceFile(ctx, Vala.SourceFileType.SOURCE, file_name);
    ctx.add_source_file(src);

	var scanner = new Vala.Scanner(src);
	
	Vala.SourceLocation token_begin, token_end;

	while (true) {
//		scanner.parse_file_comments();
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

		var comment = scanner.pop_comment();
		if (comment != null) stdout.printf("found comment!\n");
	}
	

	foreach (var c in src.get_comments()) {
		stdout.printf("\nComment: %s\n ref: %s\n", c.content, c.source_reference.to_string());
	}
	stdout.printf("C: %i\n", src.get_comments().size);
	

/*hello!
 *
*/
	return 0;
}
