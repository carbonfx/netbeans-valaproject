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

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.commons.exec.ExecuteException;

/**
 *
 * @author Magomed Abdurakhmanov
 */
public final class LibvalaParser {
	
	public static final String CMD_QUIT = "quit";
	final String CMD_DEBUG = "debug";
	final String CMD_BEGIN = "begin";
	final String CMD_END = "]\"\"\"end";
	final String TOKENS_BEGIN = "]tokens";
	final String TOKENS_END = "]end";

	String parserCommandName;
	String homeDirectory;
	String consoleCharSetName;
	boolean debugMode;
	static LibvalaParserProcess parserProcess;
	static Object lock = new Object();
	
	private static final Logger logger = Logger.getLogger(LibvalaParser.class.getName());
	
	public LibvalaParser(String parserCommandName, String homeDirectory, String consoleCharSetName, boolean debugMode) throws ExecuteException, IOException, InterruptedException {
		
		this.parserCommandName = parserCommandName;
		this.homeDirectory = homeDirectory;
		this.consoleCharSetName = consoleCharSetName;
		this.debugMode = debugMode;
		
		open();
	}
	
	public ParseResult parse(String source, String fileName) throws IOException, InterruptedException {
		
		synchronized(lock) {
			if (open()) {
				logger.log(Level.WARNING, "sending " + source.length() +  " chars to parser process " + System.currentTimeMillis());
				sendln(CMD_BEGIN);
				sendln(fileName);
				sendln(source);
				sendln(CMD_END);

				logger.log(Level.WARNING, "waiting for answer " + System.currentTimeMillis());
				String s = parserProcess.readLine();
				if (!TOKENS_BEGIN.equals(s)) {
					throw new LibvalaProxyException("Unexpected result from parser process, got: " + s + " while expecting: " + TOKENS_BEGIN);
				}

				logger.log(Level.WARNING, "reading tokens " + System.currentTimeMillis());
				ParseResult result = new ParseResult();
				result.setTokens(new ArrayList<ValaToken>());

				logger.log(Level.WARNING, "parsing tokens " + System.currentTimeMillis());

				Pattern p = Pattern.compile(",");

				while (true) {
					s = parserProcess.readLine();
					if (s == null || TOKENS_END.equals(s))
						break;

					String[] sa = p.split(s);
					if (sa == null || sa.length != 7) {
						throw new LibvalaProxyException("Unexpected token line from parser process, got: " + s);
					}

					ValaToken t = new ValaToken();
					t.firstLine = Integer.parseInt(sa[0], 16);
					t.firstColumn = Integer.parseInt(sa[1], 16);
					t.lastLine = Integer.parseInt(sa[2], 16);
					t.lastColumn = Integer.parseInt(sa[3], 16);
					t.offset = Integer.parseInt(sa[4], 16);
					t.length = Integer.parseInt(sa[5], 16);
					t.tokenType = ValaTokenType.valueOf(sa[6]);
					result.getTokens().add(t);
				}

				logger.log(Level.WARNING, "returning tokens " + System.currentTimeMillis());
				return result;
			}
			else {
				throw new LibvalaProxyException("Couldn't execute: " + parserCommandName);
			}
		}
	}

	private boolean open() throws IOException, InterruptedException {
		if (parserProcess != null) {
			return true;
		}
		
		logger.log(Level.WARNING, "launching parser process " + System.currentTimeMillis());
		parserProcess = new LibvalaParserProcess(homeDirectory, parserCommandName, consoleCharSetName);
		if (!parserProcess.isActive()) {
			parserProcess = null;
			return false;
		}
		
		if (debugMode) {
			sendln(CMD_DEBUG);
		}
		logger.log(Level.WARNING, "launched parser process " + System.currentTimeMillis());
		return true;
	}
	
	private void send(String command) throws IOException {
		if (parserProcess == null) { 
			throw new LibvalaProxyException("Parser process is not launched");
		}
		parserProcess.send(command);
	}
	
	private void sendln(String command) throws IOException {
		if (parserProcess == null) { 
			throw new LibvalaProxyException("Parser process is not launched");
		}
		parserProcess.sendln(command);
	}
}
