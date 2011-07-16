/*
 *	CarbonFX ValaProject is a plugin for Netbeans IDE for Vala.
 *
 *	Copyright (c) 2011 Carbon Foundation X. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *      * Redistributions of source code must retain the above copyright
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
package org.carbonfx.valaproject.parser;

import javax.swing.event.ChangeListener;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

public class ValaParser extends Parser {

	private Snapshot snapshot;
	private org.carbonfx.valaproject.antlr.ValaParser parser;

	@Override
	public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {

		this.snapshot = snpsht;
		ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
		org.antlr.runtime.Lexer lexer = new org.carbonfx.valaproject.antlr.ValaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		this.parser = new org.carbonfx.valaproject.antlr.ValaParser(tokens);
		try {
			this.parser.compilation_unit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Result getResult(Task task) throws ParseException {
		return new ValaParserResult(this.snapshot, this.parser);
	}

	@Override
	public void cancel() {
	}

	@Override
	public void addChangeListener(ChangeListener cl) {
	}

	@Override
	public void removeChangeListener(ChangeListener cl) {
	}

	public static class ValaParserResult extends Result {

		private org.carbonfx.valaproject.antlr.ValaParser parser;
		private boolean valid = true;

		ValaParserResult(Snapshot snapshot, org.carbonfx.valaproject.antlr.ValaParser parser) {
			super(snapshot);
			this.parser = parser;
		}

		public org.carbonfx.valaproject.antlr.ValaParser getParser()
				throws ParseException {
			if (!valid) {
				throw new ParseException();
			}
			return parser;
		}

		@Override
		protected void invalidate() {
			valid = false;
		}
	}
}
