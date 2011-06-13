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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;
import java.io.IOException;
import org.apache.commons.exec.StreamPumper;
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
		
		//parser.sendln("debug");
		//parser.sendln("quit");
		
		parser.close();
	}
	
	@Test
	public void test1() throws IOException, InterruptedException{
		
		/*ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
		
		PipedOutputStream o = new PipedOutputStream();
		PipedInputStream i = new PipedInputStream(o);
		
		StreamPumper sp = new StreamPumper(i, baos1);
		Thread t = new Thread(sp);
		t.start();
		Thread.sleep(1000);
		
		
		o.write(1);
		o.flush();
		//o.close();
		byte[] a = baos1.toByteArray();
		assertTrue(a.length > 0);
		//t.interrupt();*/
	}
}
