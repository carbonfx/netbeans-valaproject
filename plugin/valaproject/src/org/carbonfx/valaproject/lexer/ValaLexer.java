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

import org.netbeans.api.lexer.PartType;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ValaLexer implements Lexer<ValaTokenId> {

	private LexerRestartInfo<ValaTokenId> info;
	private org.carbonfx.valaproject.antlr.ValaLexer lexer;

	public ValaLexer(LexerRestartInfo<ValaTokenId> info) {

		this.info = info;
		AntlrCharStream charStream = new AntlrCharStream(info.input(), "Vala");
		this.lexer = new org.carbonfx.valaproject.antlr.ValaLexer(charStream);
	}

	@Override
	public Token<ValaTokenId> nextToken() {

		org.antlr.runtime.Token token = lexer.nextToken();
		Token<ValaTokenId> resultToken = null;

		if (token.getType() != org.carbonfx.valaproject.antlr.ValaLexer.EOF) {
			ValaTokenId tokenId = ValaLanguageHierarchy.getToken(token.getType());
			resultToken = info.tokenFactory().createToken(tokenId);
		} else if (info.input().readLength() > 0) // incomplete token, return as a comment
		{
			ValaTokenId tokenId = ValaLanguageHierarchy.getToken(org.carbonfx.valaproject.antlr.ValaLexer.COMMENT);
			resultToken = info.tokenFactory().createToken(tokenId, info.input().readLength(), PartType.MIDDLE);
		}

		return resultToken;
	}

	@Override
	public Object state() {
		return null;
	}

	@Override
	public void release() {
	}
}
