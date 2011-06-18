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
package org.carbonfx.valaproject.libvalaproxy;

import java.util.ArrayList;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magomed Abdurakhmanov
 */
public class LibvalaProxyTest {
	
	static LibvalaFactory proxy;
	
	public LibvalaProxyTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		proxy = new LibvalaFactory();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		if (proxy != null) {
			proxy.cleanup();
			proxy = null;
		}
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}

	@Test
	public void testParser() throws IOException, InterruptedException {
		
		LibvalaParser parser = proxy.createParser();
		assertNotNull(parser);
		
		ParseResult result = parser.parse("int {// aaa\n return xxgggxx 0", "test.vala");
		assertNotNull(parser);

		ArrayList<ValaToken> tokens = result.getTokens();
		
		assertTrue(tokens.size() == 6);
		
		assertTrue(tokens.get(0).getTokenType() == ValaTokenType.IDENTIFIER);
		assertTrue(tokens.get(0).firstLine == 1);
		assertTrue(tokens.get(0).firstColumn == 1);
		assertTrue(tokens.get(0).lastLine == 1);
		assertTrue(tokens.get(0).lastColumn == 3);

		assertTrue(tokens.get(1).getTokenType() == ValaTokenType.OPEN_BRACE);
		assertTrue(tokens.get(1).firstLine == 1);
		assertTrue(tokens.get(1).firstColumn == 5);
		assertTrue(tokens.get(1).lastLine == 1);
		assertTrue(tokens.get(1).lastColumn == 5);
		
		assertTrue(tokens.get(2).getTokenType() == ValaTokenType.LINE_COMMENT);
		assertTrue(tokens.get(2).firstLine == 1);
		assertTrue(tokens.get(2).firstColumn == 6);
		assertTrue(tokens.get(2).lastLine == 1);
		assertTrue(tokens.get(2).lastColumn == 11);
		
		assertTrue(tokens.get(3).getTokenType() == ValaTokenType.RETURN);
		assertTrue(tokens.get(3).firstLine == 2);
		assertTrue(tokens.get(3).firstColumn == 2);
		assertTrue(tokens.get(3).lastLine == 2);
		assertTrue(tokens.get(3).lastColumn == 7);
		
		assertTrue(tokens.get(4).getTokenType() == ValaTokenType.COMMENT);
		assertTrue(tokens.get(4).firstLine == 2);
		assertTrue(tokens.get(4).firstColumn == 9);
		assertTrue(tokens.get(4).lastLine == 2);
		assertTrue(tokens.get(4).lastColumn == 15);
		
		assertTrue(tokens.get(5).getTokenType() == ValaTokenType.INTEGER_LITERAL);
		assertTrue(tokens.get(5).firstLine == 2);
		assertTrue(tokens.get(5).firstColumn == 17);
		assertTrue(tokens.get(5).lastLine == 2);
		assertTrue(tokens.get(5).lastColumn == 17);
		
		parser = null;
	}
}
