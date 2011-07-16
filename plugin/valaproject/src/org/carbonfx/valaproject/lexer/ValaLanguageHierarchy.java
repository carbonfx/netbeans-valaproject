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
import org.carbonfx.valaproject.antlr.ValaLexer;
import org.carbonfx.valaproject.antlr.ValaParser;
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
	private static final ValaTokenId[] tokens = new ValaTokenId[]{
		token(ValaLexer.AND, "operator"),
		token(ValaLexer.AND_ASSIGN, "operator"),
		token(ValaLexer.ASSIGNMENT, "operator"),
		token(ValaLexer.BITWISE_NOT, "operator"),
		token(ValaLexer.BOOL_AND, "operator"),
		token(ValaLexer.BOOL_OR, "operator"),
		token(ValaLexer.CHAR, "character"),
		token(ValaLexer.COALESCE, "operator"),
		token(ValaLexer.COLON, "separator"),
		token(ValaLexer.COMMA, "separator"),
		token(ValaLexer.COMMENT, "comment"),
		token(ValaLexer.COMMENT_JAVADOC, "javadoc"),
		token(ValaLexer.DECR_ASSIGN, "operator"),
		token(ValaLexer.DECREMENT, "operator"),
		token(ValaLexer.DIGITS, "number"),
		token(ValaLexer.DIV, "operator"),
		token(ValaLexer.DIV_ASSIGN, "operator"),
		token(ValaLexer.DOT, "separator"),
		token(ValaLexer.ELIPSIS, "operator"),
		token(ValaLexer.EQUAL, "operator"),
		token(ValaLexer.ESCAPE, "string"),
		token(ValaLexer.EXPONENT, "number"),
		token(ValaLexer.GLOBAL_NS, "identifier"),
		token(ValaLexer.GT, "operator"),
		token(ValaLexer.GTEQ, "operator"),
		token(ValaLexer.HEX, "number"),
		token(ValaLexer.HEXDIGIT, "number"),
		token(ValaLexer.IDENTIFIER, "identifier"),
		token(ValaLexer.INCR_ASSIGN, "operator"),
		token(ValaLexer.INCREMENT, "operator"),
		token(ValaLexer.INTEGER, "number"),
		token(ValaLexer.KW_ABSTRACT, "keyword"),
		token(ValaLexer.KW_AS, "keyword"),
		token(ValaLexer.KW_ASYNC, "keyword"),
		token(ValaLexer.KW_BASE, "keyword"),
		token(ValaLexer.KW_BREAK, "keyword"),
		token(ValaLexer.KW_CASE, "keyword"),
		token(ValaLexer.KW_CATCH, "keyword"),
		token(ValaLexer.KW_CLASS, "keyword"),
		token(ValaLexer.KW_CONST, "keyword"),
		token(ValaLexer.KW_CONSTRUCT, "keyword"),
		token(ValaLexer.KW_CONTINUE, "keyword"),
		token(ValaLexer.KW_DEFAULT, "keyword"),
		token(ValaLexer.KW_DELEGATE, "keyword"),
		token(ValaLexer.KW_DELETE, "keyword"),
		token(ValaLexer.KW_DO, "keyword"),
		token(ValaLexer.KW_DYNAMIC, "keyword"),
		token(ValaLexer.KW_ELSE, "keyword"),
		token(ValaLexer.KW_ENSURES, "keyword"),
		token(ValaLexer.KW_ENUM, "keyword"),
		token(ValaLexer.KW_ERRORDOMAIN, "keyword"),
		token(ValaLexer.KW_EXTERN, "keyword"),
		token(ValaLexer.KW_FALSE, "keyword"),
		token(ValaLexer.KW_FINALLY, "keyword"),
		token(ValaLexer.KW_FOR, "keyword"),
		token(ValaLexer.KW_FOREACH, "keyword"),
		token(ValaLexer.KW_GET, "keyword"),
		token(ValaLexer.KW_IF, "keyword"),
		token(ValaLexer.KW_IN, "keyword"),
		token(ValaLexer.KW_INLINE, "keyword"),
		token(ValaLexer.KW_INTERFACE, "keyword"),
		token(ValaLexer.KW_INTERNAL, "keyword"),
		token(ValaLexer.KW_IS, "keyword"),
		token(ValaLexer.KW_LOCK, "keyword"),
		token(ValaLexer.KW_NAMESPACE, "keyword"),
		token(ValaLexer.KW_NEW, "keyword"),
		token(ValaLexer.KW_NULL, "keyword"),
		token(ValaLexer.KW_OUT, "keyword"),
		token(ValaLexer.KW_OVERRIDE, "keyword"),
		token(ValaLexer.KW_OWNED, "keyword"),
		token(ValaLexer.KW_PARAMS, "keyword"),
		token(ValaLexer.KW_PRIVATE, "keyword"),
		token(ValaLexer.KW_PROTECTED, "keyword"),
		token(ValaLexer.KW_PUBLIC, "keyword"),
		token(ValaLexer.KW_REF, "keyword"),
		token(ValaLexer.KW_REQUIRES, "keyword"),
		token(ValaLexer.KW_RETURN, "keyword"),
		token(ValaLexer.KW_SET, "keyword"),
		token(ValaLexer.KW_SIGNAL, "keyword"),
		token(ValaLexer.KW_SIZEOF, "keyword"),
		token(ValaLexer.KW_STATIC, "keyword"),
		token(ValaLexer.KW_STRUCT, "keyword"),
		token(ValaLexer.KW_SWITCH, "keyword"),
		token(ValaLexer.KW_THIS, "keyword"),
		token(ValaLexer.KW_THROW, "keyword"),
		token(ValaLexer.KW_THROWS, "keyword"),
		token(ValaLexer.KW_TRUE, "keyword"),
		token(ValaLexer.KW_TRY, "keyword"),
		token(ValaLexer.KW_TYPEOF, "keyword"),
		token(ValaLexer.KW_UNOWNED, "keyword"),
		token(ValaLexer.KW_USING, "keyword"),
		token(ValaLexer.KW_VAR, "keyword"),
		token(ValaLexer.KW_VIRTUAL, "keyword"),
		token(ValaLexer.KW_VOID, "keyword"),
		token(ValaLexer.KW_WEAK, "keyword"),
		token(ValaLexer.KW_WHILE, "keyword"),
		token(ValaLexer.KW_YIELD, "keyword"),
		token(ValaLexer.LAMBDA, "operator"),
		token(ValaLexer.LBRACKET, "separator"),
		token(ValaLexer.LCURL, "separator"),
		token(ValaLexer.LINE_COMMAND, "command"),
		token(ValaLexer.LINE_COMMENT, "comment"),
		token(ValaLexer.LPAREN, "separator"),
		token(ValaLexer.LT, "operator"),
		token(ValaLexer.LTEQ, "operator"),
		token(ValaLexer.MINUS, "operator"),
		token(ValaLexer.MOD, "operator"),
		token(ValaLexer.MOD_ASSIGN, "operator"),
		token(ValaLexer.MUL_ASSIGN, "operator"),
		token(ValaLexer.MULTIPLY, "operator"),
		token(ValaLexer.NOT, "operator"),
		token(ValaLexer.NOT_EQUAL, "operator"),
		token(ValaLexer.OCTAL, "number"),
		token(ValaLexer.OR, "operator"),
		token(ValaLexer.OR_ASSIGN, "operator"),
		token(ValaLexer.PLUS, "operator"),
		token(ValaLexer.POINTER_ACCESS, "operator"),
		token(ValaLexer.QUESTION, "operator"),
		token(ValaLexer.QUOT, "character"),
		token(ValaLexer.RANGE, "operator"),
		token(ValaLexer.RBRACKET, "separator"),
		token(ValaLexer.RCURL, "separator"),
		token(ValaLexer.REAL, "number"),
		token(ValaLexer.REGEX_LITERAL, "regex"),
		token(ValaLexer.RPAREN, "separator"),
		token(ValaLexer.SEMICOLON, "separator"),
		token(ValaLexer.SHIFT_LEFT, "operator"),
		token(ValaLexer.SHL_ASSIGN, "operator"),
		token(ValaLexer.SHR_ASSIGN, "operator"),
		token(ValaLexer.STRING, "string"),
		token(ValaLexer.TEMPLATE_START, "string"),
		token(ValaLexer.UNICODE, "character"),
		token(ValaLexer.VERBATIM_LITERAL, "string"),
		token(ValaLexer.WHITESPACE, "separator"),
		token(ValaLexer.XOR, "operator"),
		token(ValaLexer.XOR_ASSIGN, "operator"),
		token(ValaLexer.BACKSLASH, "operator"),
		token(ValaLexer.UNICODE_CHAR, "error"),
		token(ValaLexer.OTHER_CHAR, "error"),
		token(ValaLexer.UNKNOWN_CHAIN, "error"),};

	static {
		for (ValaTokenId token : tokens) {
			idToToken.put(token.ordinal(), token);
		}
	}

	private static ValaTokenId token(int antlrToken, String category) {
		return new ValaTokenId(ValaParser.tokenNames[antlrToken], category, antlrToken);
	}
}
