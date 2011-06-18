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

package org.carbonfx.valaproject.lexer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.carbonfx.valaproject.libvalaproxy.LibvalaFactory;
import org.carbonfx.valaproject.libvalaproxy.LibvalaParser;
import org.carbonfx.valaproject.libvalaproxy.ParseResult;
import org.carbonfx.valaproject.libvalaproxy.ValaToken;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ValaLexer implements Lexer<ValaTokenId> {

	private LexerRestartInfo<ValaTokenId> info;
	private static final Logger logger = Logger.getLogger(ValaLexer.class.getName());
	private static final LibvalaFactory libvalaFactory = new LibvalaFactory(); //@todo refactor this, could throw exception
	private LibvalaParser valaParser = null;
	
	public ValaLexer(LexerRestartInfo<ValaTokenId> info) {
        this.info = info;
		this.valaParser = libvalaFactory.createParser();
    }

	private static class State {
		public LinkedList<Token<ValaTokenId>> tokens;
	}
	
	State state;
 
	@Override
	public Token<ValaTokenId> nextToken() {

		if (state != null) {
			if (state.tokens.isEmpty()) {
				state = null;
			}
			else {
				return state.tokens.removeFirst();
			}
		}
		
		ArrayList<String> strings = new ArrayList<String>();
	
		StringBuilder sb = new StringBuilder();
		StringBuilder sbLine = new StringBuilder();
		for (;;) {
			int c = info.input().read();
			if (c != LexerInput.EOF) {
				sb.append((char)c);
				if (c == '\n') {
					strings.add(sbLine.toString());
					sbLine.setLength(0);
				}
				else {
					sbLine.append((char)c);
				}
			}
			else {
				strings.add(sbLine.toString());
				break;
			}
		}
		
		String s = sb.toString();
		
		logger.log(Level.WARNING, "vala nn: " + Integer.toString(info.input().readLength()));
		logger.log(Level.WARNING, "vala cs: " + s);
		if (s.length() == 0) {
			return null;
		}

		try {
			
			ParseResult result = valaParser.parse(s, "");
			state = new State();
			state.tokens = new LinkedList<Token<ValaTokenId>>();
			
			for(ValaToken t : result.tokens) {
				ValaTokenId tokenId = ValaLanguageHierarchy.getToken(t.getTokenType());
				int tokenLength = getTokenLength(t, strings);
				Token<ValaTokenId> token = info.tokenFactory().createToken(tokenId, tokenLength);
			}
			
			return state.tokens.removeFirst();
		}
		catch (Throwable t)
		{
			logger.log(Level.SEVERE, "Error", t);
			return null;
		}

		/*
		org.antlr.runtime.Token token = lexer.nextToken();
		Token<ValaTokenId> resultToken = null;

        if (token.getType() != org.carbonfx.valaproject.antlr.ValaLexer.EOF) {
            ValaTokenId tokenId = ValaLanguageHierarchy.getToken(token.getType());
            resultToken = info.tokenFactory().createToken(tokenId);
        }
		else
		if (info.input().readLength() > 0) // incomplete token, return as a comment
		{
			ValaTokenId tokenId = ValaLanguageHierarchy.getToken(org.carbonfx.valaproject.antlr.ValaLexer.COMMENT);
			
		}*/
		
	}

	@Override
	public Object state() {
		return state;
	}

	@Override
	public void release() {
		state = null;
	}

	private int getTokenLength(ValaToken t, ArrayList<String> strings) {
		int l = 0;
		
		if (t.getFirstLine() == t.getLastLine()) {
			return t.getLastColumn() - t.getFirstColumn() + 1;
		}
		else {
			
			
			l = strings.get(t.getFirstLine()-1).length()-t.getFirstColumn() + 1;
			
			for (int line = t.getFirstLine()+1; line < t.getLastLine(); ++line) {
				l += strings.get(line-1).length()+1;
			}
			
			l += t.getLastColumn();
			
			return l;
		}
	}
}
