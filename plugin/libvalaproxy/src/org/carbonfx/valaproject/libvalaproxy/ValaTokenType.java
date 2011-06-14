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
package org.carbonfx.valaproject.libvalaproxy;

/**
 *
 * @author Magomed Abdurakhmanov
 */
public enum ValaTokenType {
	NONE,
	ABSTRACT,
	AS,
	ASSIGN,
	ASSIGN_ADD,
	ASSIGN_BITWISE_AND,
	ASSIGN_BITWISE_OR,
	ASSIGN_BITWISE_XOR,
	ASSIGN_DIV,
	ASSIGN_MUL,
	ASSIGN_PERCENT,
	ASSIGN_SHIFT_LEFT,
	ASSIGN_SUB,
	ASYNC,
	BASE,
	BITWISE_AND,
	BITWISE_OR,
	BREAK,
	CARRET,
	CASE,
	CATCH,
	CHARACTER_LITERAL,
	CLASS,
	CLOSE_BRACE,
	CLOSE_BRACKET,
	CLOSE_PARENS,
	CLOSE_REGEX_LITERAL,
	CLOSE_TEMPLATE,
	COLON,
	COMMA,
	CONST,
	CONSTRUCT,
	CONTINUE,
	DEFAULT,
	DELEGATE,
	DELETE,
	DIV,
	DO,
	DOUBLE_COLON,
	DOT,
	DYNAMIC,
	ELLIPSIS,
	ELSE,
	ENUM,
	ENSURES,
	ERRORDOMAIN,
	EOF,
	EXTERN,
	FALSE,
	FINALLY,
	FOR,
	FOREACH,
	GET,
	HASH,
	IDENTIFIER,
	IF,
	IN,
	INLINE,
	INTEGER_LITERAL,
	INTERFACE,
	INTERNAL,
	INTERR,
	IS,
	LAMBDA,
	LOCK,
	MINUS,
	NAMESPACE,
	NEW,
	NULL,
	OUT,
	OP_AND,
	OP_COALESCING,
	OP_DEC,
	OP_EQ,
	OP_GE,
	OP_GT,
	OP_INC,
	OP_LE,
	OP_LT,
	OP_NE,
	OP_NEG,
	OP_OR,
	OP_PTR,
	OP_SHIFT_LEFT,
	OPEN_BRACE,
	OPEN_BRACKET,
	OPEN_PARENS,
	OPEN_REGEX_LITERAL,
	OPEN_TEMPLATE,
	OVERRIDE,
	OWNED,
	PARAMS,
	PERCENT,
	PLUS,
	PRIVATE,
	PROTECTED,
	PUBLIC,
	REAL_LITERAL,
	REF,
	REGEX_LITERAL,
	REQUIRES,
	RETURN,
	SEALED,
	SEMICOLON,
	SET,
	SIGNAL,
	SIZEOF,
	STAR,
	STATIC,
	STRING_LITERAL,
	STRUCT,
	SWITCH,
	TEMPLATE_STRING_LITERAL,
	THIS,
	THROW,
	THROWS,
	TILDE,
	TRUE,
	TRY,
	TYPEOF,
	UNOWNED,
	USING,
	VAR,
	VERBATIM_STRING_LITERAL,
	VIRTUAL,
	VOID,
	VOLATILE,
	WEAK,
	WHILE,
	YIELD,

	// these are additional token types doesn't existing in Vala.TokenType
	UNKNOWN,
	COMMENT,
	LINE_COMMENT
	;
}
