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
    private static final ValaTokenId[] tokens = new ValaTokenId[] {
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.AND], "operator", ValaLexer.AND),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.AND_ASSIGN], "operator", ValaLexer.AND_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.ASSIGNMENT], "operator", ValaLexer.ASSIGNMENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.BITWISE_NOT], "operator", ValaLexer.BITWISE_NOT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.BOOL_AND], "operator", ValaLexer.BOOL_AND),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.BOOL_OR], "operator", ValaLexer.BOOL_OR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.CHAR], "character", ValaLexer.CHAR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.COALESCE], "operator", ValaLexer.COALESCE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.COLON], "separator", ValaLexer.COLON),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.COMMA], "separator", ValaLexer.COMMA),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.COMMENT], "comment", ValaLexer.COMMENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.COMMENT_JAVADOC], "javadoc", ValaLexer.COMMENT_JAVADOC),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DECR_ASSIGN], "operator", ValaLexer.DECR_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DECREMENT], "operator", ValaLexer.DECREMENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DIGITS], "number", ValaLexer.DIGITS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DIV], "operator", ValaLexer.DIV),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DIV_ASSIGN], "operator", ValaLexer.DIV_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.DOT], "separator", ValaLexer.DOT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.ELIPSIS], "operator", ValaLexer.ELIPSIS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.EQUAL], "operator", ValaLexer.EQUAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.ESCAPE], "string", ValaLexer.ESCAPE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.EXPONENT], "number", ValaLexer.EXPONENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.GLOBAL_NS], "identifier", ValaLexer.GLOBAL_NS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.GT], "operator", ValaLexer.GT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.GTEQ], "operator", ValaLexer.GTEQ),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.HEX], "number", ValaLexer.HEX),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.HEXDIGIT], "number", ValaLexer.HEXDIGIT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.IDENTIFIER], "identifier", ValaLexer.IDENTIFIER),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.INCR_ASSIGN], "operator", ValaLexer.INCR_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.INCREMENT], "operator", ValaLexer.INCREMENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.INTEGER], "number", ValaLexer.INTEGER),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ABSTRACT], "keyword", ValaLexer.KW_ABSTRACT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_AS], "keyword", ValaLexer.KW_AS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ASYNC], "keyword", ValaLexer.KW_ASYNC),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_BASE], "keyword", ValaLexer.KW_BASE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_BREAK], "keyword", ValaLexer.KW_BREAK),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CASE], "keyword", ValaLexer.KW_CASE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CATCH], "keyword", ValaLexer.KW_CATCH),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CLASS], "keyword", ValaLexer.KW_CLASS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CONST], "keyword", ValaLexer.KW_CONST),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CONSTRUCT], "keyword", ValaLexer.KW_CONSTRUCT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_CONTINUE], "keyword", ValaLexer.KW_CONTINUE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_DEFAULT], "keyword", ValaLexer.KW_DEFAULT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_DELEGATE], "keyword", ValaLexer.KW_DELEGATE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_DELETE], "keyword", ValaLexer.KW_DELETE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_DO], "keyword", ValaLexer.KW_DO),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_DYNAMIC], "keyword", ValaLexer.KW_DYNAMIC),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ELSE], "keyword", ValaLexer.KW_ELSE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ENSURES], "keyword", ValaLexer.KW_ENSURES),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ENUM], "keyword", ValaLexer.KW_ENUM),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_ERRORDOMAIN], "keyword", ValaLexer.KW_ERRORDOMAIN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_EXTERN], "keyword", ValaLexer.KW_EXTERN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_FALSE], "keyword", ValaLexer.KW_FALSE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_FINALLY], "keyword", ValaLexer.KW_FINALLY),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_FOR], "keyword", ValaLexer.KW_FOR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_FOREACH], "keyword", ValaLexer.KW_FOREACH),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_GET], "keyword", ValaLexer.KW_GET),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_IF], "keyword", ValaLexer.KW_IF),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_IN], "keyword", ValaLexer.KW_IN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_INLINE], "keyword", ValaLexer.KW_INLINE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_INTERFACE], "keyword", ValaLexer.KW_INTERFACE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_INTERNAL], "keyword", ValaLexer.KW_INTERNAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_IS], "keyword", ValaLexer.KW_IS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_LOCK], "keyword", ValaLexer.KW_LOCK),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_NAMESPACE], "keyword", ValaLexer.KW_NAMESPACE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_NEW], "keyword", ValaLexer.KW_NEW),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_NULL], "keyword", ValaLexer.KW_NULL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_OUT], "keyword", ValaLexer.KW_OUT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_OVERRIDE], "keyword", ValaLexer.KW_OVERRIDE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_OWNED], "keyword", ValaLexer.KW_OWNED),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_PARAMS], "keyword", ValaLexer.KW_PARAMS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_PRIVATE], "keyword", ValaLexer.KW_PRIVATE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_PROTECTED], "keyword", ValaLexer.KW_PROTECTED),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_PUBLIC], "keyword", ValaLexer.KW_PUBLIC),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_REF], "keyword", ValaLexer.KW_REF),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_REQUIRES], "keyword", ValaLexer.KW_REQUIRES),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_RETURN], "keyword", ValaLexer.KW_RETURN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_SET], "keyword", ValaLexer.KW_SET),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_SIGNAL], "keyword", ValaLexer.KW_SIGNAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_SIZEOF], "keyword", ValaLexer.KW_SIZEOF),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_STATIC], "keyword", ValaLexer.KW_STATIC),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_STRUCT], "keyword", ValaLexer.KW_STRUCT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_SWITCH], "keyword", ValaLexer.KW_SWITCH),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_THIS], "keyword", ValaLexer.KW_THIS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_THROW], "keyword", ValaLexer.KW_THROW),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_THROWS], "keyword", ValaLexer.KW_THROWS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_TRUE], "keyword", ValaLexer.KW_TRUE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_TRY], "keyword", ValaLexer.KW_TRY),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_TYPEOF], "keyword", ValaLexer.KW_TYPEOF),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_UNOWNED], "keyword", ValaLexer.KW_UNOWNED),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_USING], "keyword", ValaLexer.KW_USING),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_VAR], "keyword", ValaLexer.KW_VAR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_VIRTUAL], "keyword", ValaLexer.KW_VIRTUAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_VOID], "keyword", ValaLexer.KW_VOID),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_WEAK], "keyword", ValaLexer.KW_WEAK),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_WHILE], "keyword", ValaLexer.KW_WHILE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.KW_YIELD], "keyword", ValaLexer.KW_YIELD),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LAMBDA], "operator", ValaLexer.LAMBDA),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LBRACKET], "separator", ValaLexer.LBRACKET),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LCURL], "separator", ValaLexer.LCURL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LINE_COMMAND], "command", ValaLexer.LINE_COMMAND),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LINE_COMMENT], "comment", ValaLexer.LINE_COMMENT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LPAREN], "separator", ValaLexer.LPAREN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LT], "operator", ValaLexer.LT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.LTEQ], "operator", ValaLexer.LTEQ),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.MINUS], "operator", ValaLexer.MINUS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.MOD], "operator", ValaLexer.MOD),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.MOD_ASSIGN], "operator", ValaLexer.MOD_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.MUL_ASSIGN], "operator", ValaLexer.MUL_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.MULTIPLY], "operator", ValaLexer.MULTIPLY),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.NOT], "operator", ValaLexer.NOT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.NOT_EQUAL], "operator", ValaLexer.NOT_EQUAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.OCTAL], "number", ValaLexer.OCTAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.OR], "operator", ValaLexer.OR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.OR_ASSIGN], "operator", ValaLexer.OR_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.PLUS], "operator", ValaLexer.PLUS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.POINTER_ACCESS], "operator", ValaLexer.POINTER_ACCESS),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.QUESTION], "operator", ValaLexer.QUESTION),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.QUOT], "character", ValaLexer.QUOT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.RANGE], "operator", ValaLexer.RANGE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.RBRACKET], "separator", ValaLexer.RBRACKET),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.RCURL], "separator", ValaLexer.RCURL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.REAL], "number", ValaLexer.REAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.REGEX_LITERAL], "regex", ValaLexer.REGEX_LITERAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.RPAREN], "separator", ValaLexer.RPAREN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.SEMICOLON], "separator", ValaLexer.SEMICOLON),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.SHIFT_LEFT], "operator", ValaLexer.SHIFT_LEFT),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.SHL_ASSIGN], "operator", ValaLexer.SHL_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.SHR_ASSIGN], "operator", ValaLexer.SHR_ASSIGN),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.STRING], "string", ValaLexer.STRING),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.TEMPLATE_START], "string", ValaLexer.TEMPLATE_START),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.UNICODE], "character", ValaLexer.UNICODE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.VERBATIM_LITERAL], "string", ValaLexer.VERBATIM_LITERAL),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.WHITESPACE], "separator", ValaLexer.WHITESPACE),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.XOR], "operator", ValaLexer.XOR),
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.XOR_ASSIGN], "operator", ValaLexer.XOR_ASSIGN),

		// imaginary nodes
		new ValaTokenId (ValaParser.tokenNames[ValaLexer.UNKNOWN_CHAIN], "error", ValaLexer.UNKNOWN_CHAIN),
	};

	static {
        for (ValaTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }
}
