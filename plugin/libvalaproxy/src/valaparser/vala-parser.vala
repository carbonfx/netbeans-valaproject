/*
 *	CarbonFX ValaProject is a plugin for Netbeans IDE for Vala.
 *
 *	Copyright (c) 2011 Carbon Foundation X. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Carbon Foundation X nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Carbon Foundation X BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *
 */

/*

Author: "Magomed Abdurakhmanov" <maqdev@gmail.com>

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
		var lc = scanner.pop_comment();
		
		if (lc != null) {
			var tc = create_comment_token(lc, str_array);
			tokens.add(tc);
		}

		if (token == Vala.TokenType.EOF) {
			break;
		}

		var t = new Token();
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

	fetch_file_comments(src, tokens, str_array);
	fix_bug_652899(tokens);

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

// fixes wrong columns because of bug in Vala.Scanner, see https://bugzilla.gnome.org/show_bug.cgi?id=652899
// sadly this is so fucking wrong fix
void fix_bug_652899(Gee.TreeSet<Token> tokens) {

	int c = 0;
	Token? prev = null;
	bool shift = false;

	foreach (var t in tokens) {
		if (prev != null && prev.first_line == t.first_line)
		{
			if (prev.first_line == prev.last_line && prev.token_type == "COMMENT") {
				shift = true;
				c += 2;
			}
		}
		else {
			shift = false;
			c = 0;
		}
		
		if (shift){
			t.first_column += c;
			if (t.last_line == t.first_line) {
				t.last_column += c;
			}
		}

		prev = t;
	}
}

void fetch_file_comments(Vala.SourceFile src, Gee.TreeSet<Token> tokens, Gee.ArrayList<string> str_array) {

	// A hack way to get comments from the scanner
	foreach (var c in src.get_comments()) {

		Token t = create_comment_token(c, str_array);

		if (tokens.contains(t)) {
			continue;
		}

		tokens.add(t);
	}
}

Token create_comment_token(Vala.Comment c, Gee.ArrayList<string> str_array) {

	var t = new Token();
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
		int column = t.first_column + 1;
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

	return t;
}
