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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.carbonfx.valaproject.libvalaproxy.ValaTokenType;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class ValaLanguageHierarchy extends LanguageHierarchy<ValaTokenId> {

	@Override
	protected Collection<ValaTokenId> createTokenIds() {
		return tokens;
	}

	@Override
	protected Lexer<ValaTokenId> createLexer(LexerRestartInfo<ValaTokenId> lri) {
		return new org.carbonfx.valaproject.lexer.ValaLexer(lri);
	}

	@Override
	protected String mimeType() {
		return "text/x-vala";
	}

	static synchronized ValaTokenId getToken(ValaTokenType id) {
        return idToToken.get(id);
    }

    private static final Map<ValaTokenType, ValaTokenId> idToToken = new HashMap<ValaTokenType, ValaTokenId>();
    private static final ArrayList<ValaTokenId> tokens = new ArrayList<ValaTokenId>();
	private static String currentCategory;

	static {

		category("keyword");
		token(ValaTokenType.ABSTRACT);
		token(ValaTokenType.AS);
		token(ValaTokenType.ASYNC);
		token(ValaTokenType.BASE);
		token(ValaTokenType.BREAK);
		token(ValaTokenType.CASE);
		token(ValaTokenType.CATCH);
		token(ValaTokenType.CLASS);
		token(ValaTokenType.CONST);
		token(ValaTokenType.CONSTRUCT);
		token(ValaTokenType.CONTINUE);
		token(ValaTokenType.DEFAULT);
		token(ValaTokenType.DELEGATE);
		token(ValaTokenType.DELETE);
		token(ValaTokenType.DO);
		token(ValaTokenType.DYNAMIC);
		token(ValaTokenType.ELSE);
		token(ValaTokenType.ENUM);
		token(ValaTokenType.ENSURES);
		token(ValaTokenType.ERRORDOMAIN);
		token(ValaTokenType.EXTERN);
		token(ValaTokenType.FALSE);
		token(ValaTokenType.FINALLY);
		token(ValaTokenType.FOR);
		token(ValaTokenType.FOREACH);
		token(ValaTokenType.GET);
		token(ValaTokenType.HASH);
		token(ValaTokenType.IF);
		token(ValaTokenType.IN);
		token(ValaTokenType.INLINE);
		token(ValaTokenType.INTERFACE);
		token(ValaTokenType.INTERNAL);
		token(ValaTokenType.IS);
		token(ValaTokenType.LOCK);
		token(ValaTokenType.NAMESPACE);
		token(ValaTokenType.NEW);
		token(ValaTokenType.NULL);
		token(ValaTokenType.OUT);
		token(ValaTokenType.OVERRIDE);
		token(ValaTokenType.OWNED);
		token(ValaTokenType.PARAMS);
		token(ValaTokenType.PRIVATE);
		token(ValaTokenType.PROTECTED);
		token(ValaTokenType.PUBLIC);
		token(ValaTokenType.REF);
		token(ValaTokenType.REQUIRES);
		token(ValaTokenType.RETURN);
		token(ValaTokenType.SEALED);
		token(ValaTokenType.SET);
		token(ValaTokenType.SIGNAL);
		token(ValaTokenType.SIZEOF);
		token(ValaTokenType.STATIC);
		token(ValaTokenType.STRUCT);
		token(ValaTokenType.SWITCH);
		token(ValaTokenType.THIS);
		token(ValaTokenType.THROW);
		token(ValaTokenType.THROWS);
		token(ValaTokenType.TRUE);
		token(ValaTokenType.TRY);
		token(ValaTokenType.TYPEOF);
		token(ValaTokenType.UNOWNED);
		token(ValaTokenType.USING);
		token(ValaTokenType.VAR);
		token(ValaTokenType.VIRTUAL);
		token(ValaTokenType.VOID);
		token(ValaTokenType.VOLATILE);
		token(ValaTokenType.WEAK);
		token(ValaTokenType.WHILE);
		token(ValaTokenType.YIELD);

		category("operator");
		token(ValaTokenType.ASSIGN);
		token(ValaTokenType.ASSIGN_ADD);
		token(ValaTokenType.ASSIGN_BITWISE_AND);
		token(ValaTokenType.ASSIGN_BITWISE_OR);
		token(ValaTokenType.ASSIGN_BITWISE_XOR);
		token(ValaTokenType.ASSIGN_DIV);
		token(ValaTokenType.ASSIGN_MUL);
		token(ValaTokenType.ASSIGN_PERCENT);
		token(ValaTokenType.ASSIGN_SHIFT_LEFT);
		token(ValaTokenType.ASSIGN_SUB);
		token(ValaTokenType.BITWISE_AND);
		token(ValaTokenType.BITWISE_OR);
		token(ValaTokenType.CARRET);
		token(ValaTokenType.CLOSE_BRACE);
		token(ValaTokenType.CLOSE_BRACKET);
		token(ValaTokenType.CLOSE_PARENS);
		token(ValaTokenType.CLOSE_REGEX_LITERAL);
		token(ValaTokenType.CLOSE_TEMPLATE);
		token(ValaTokenType.COLON);
		token(ValaTokenType.COMMA);
		token(ValaTokenType.DIV);
		token(ValaTokenType.DOUBLE_COLON);
		token(ValaTokenType.DOT);
		token(ValaTokenType.ELLIPSIS);
		token(ValaTokenType.INTERR);
		token(ValaTokenType.LAMBDA);
		token(ValaTokenType.MINUS);
		token(ValaTokenType.OP_AND);
		token(ValaTokenType.OP_COALESCING);
		token(ValaTokenType.OP_DEC);
		token(ValaTokenType.OP_EQ);
		token(ValaTokenType.OP_GE);
		token(ValaTokenType.OP_GT);
		token(ValaTokenType.OP_INC);
		token(ValaTokenType.OP_LE);
		token(ValaTokenType.OP_LT);
		token(ValaTokenType.OP_NE);
		token(ValaTokenType.OP_NEG);
		token(ValaTokenType.OP_OR);
		token(ValaTokenType.OP_PTR);
		token(ValaTokenType.OP_SHIFT_LEFT);
		token(ValaTokenType.OPEN_BRACE);
		token(ValaTokenType.OPEN_BRACKET);
		token(ValaTokenType.OPEN_PARENS);
		token(ValaTokenType.PERCENT);
		token(ValaTokenType.PLUS);
		token(ValaTokenType.SEMICOLON);
		token(ValaTokenType.STAR);
		token(ValaTokenType.TILDE);
		
		category("character");
		token(ValaTokenType.CHARACTER_LITERAL);
		
		category("error");
		token(ValaTokenType.UNKNOWN);
		
		category("identifier");
		token(ValaTokenType.IDENTIFIER);

		category("comment");
		token(ValaTokenType.COMMENT);
		token(ValaTokenType.LINE_COMMENT);
		
		category("number");
		token(ValaTokenType.INTEGER_LITERAL);
		token(ValaTokenType.REAL_LITERAL);
		
		category("string");
		token(ValaTokenType.STRING_LITERAL);
		
		token(ValaTokenType.OPEN_TEMPLATE);
		token(ValaTokenType.TEMPLATE_STRING_LITERAL);
		token(ValaTokenType.VERBATIM_STRING_LITERAL);
		
		category("separator");
		category("whitespace");
		token(ValaTokenType.NONE);
		token(ValaTokenType.EOF);
		
		//category("method");
		//category("javadoc");

		category("regex");
		token(ValaTokenType.OPEN_REGEX_LITERAL);
		token(ValaTokenType.REGEX_LITERAL);
		
		// category("command");
		
        for (ValaTokenId token : tokens) {
            idToToken.put(token.tokenType(), token);
        }
    }

	private static void token(ValaTokenType tokenType) {
		ValaTokenId t = new ValaTokenId (tokenType, currentCategory);
		tokens.add(t);
	}
	
	private static void category(String category) {
		currentCategory = category;
	}
}
