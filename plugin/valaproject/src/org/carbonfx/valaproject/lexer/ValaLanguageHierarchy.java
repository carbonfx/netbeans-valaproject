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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ValaLanguageHierarchy extends LanguageHierarchy<ValaTokenId> {

	@Override
	protected Collection<ValaTokenId> createTokenIds() {
		return Arrays.asList(tokens);
	}

	@Override
	protected Lexer<ValaTokenId> createLexer(LexerRestartInfo<ValaTokenId> lri) {
		return new org.carbonfx.valaproject.lexer.ValaLexer(lri);
	}

	@Override
	protected String mimeType() {
		return "text/x-vala";
	}

	static synchronized ValaTokenId getToken(int id) {
        return idToToken.get(id);
    }

    private static final Map<Integer, ValaTokenId> idToToken = new HashMap<Integer, ValaTokenId>();
    private static final ValaTokenId[] tokens = new ValaTokenId[] {
		token("AND", "operator"),
		token("AND_ASSIGN", "operator"),
	};
	private static int tokenId = 0;

	static {
        for (ValaTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

	private static ValaTokenId token(String token, String category) {
		tokenId++;
		return new ValaTokenId (token, category, tokenId);
	}
}
