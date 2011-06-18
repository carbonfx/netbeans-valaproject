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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.Executor;

/**
 *
 * @author Magomed Abdurakhmanov
 */
public class LibvalaParserProcess {
	
	BufferedReader reader;
	PumpStreamHandlerPlainInput psh;
	DefaultExecuteResultHandler execResult;
	String consoleCharSetName;
	
	String parser;
	Executor exec;
	
	public LibvalaParserProcess(String homeDirectory, String parserCommandName, String consoleCharSetName ) throws IOException, InterruptedException {
		
		this.parser = parserCommandName;
		this.consoleCharSetName = consoleCharSetName;
		
		CommandLine cl = new CommandLine(parser);
		this.exec = new DefaultExecutor();
		this.exec.setWorkingDirectory(new File(homeDirectory));
		PipedOutputStream output = new PipedOutputStream();
		reader = new BufferedReader(new InputStreamReader(new PipedInputStream(output)));
		
		psh = new PumpStreamHandlerPlainInput(output);
		exec.setStreamHandler(psh);
		execResult = new DefaultExecuteResultHandler();
		exec.setExitValue(0);
		
		psh.start();
		exec.execute(cl, execResult);
		
		boolean launched = false;
		
		for (int i = 0; i < 20; ++i) {
			if (psh.waitForProcessOutputStream(1000)) 
			{
				launched = true;
				break;
			}
		}
		
		if (!launched) {
			close();
		}
	}
	
	public boolean isActive() {
		return this.exec != null;
	}
	
	public final void close() throws IOException, InterruptedException {
		if (isActive()) {
			ExecuteWatchdog watchdog = new ExecuteWatchdog(10000);
			exec.setWatchdog(watchdog);
			sendln(LibvalaParser.CMD_QUIT);
			
			while (reader.ready()) {
				reader.read();
			}
			this.execResult.waitFor(10000);
			int value = this.execResult.getExitValue();
			exec = null;
		}
	}
	
	public String readLine() throws IOException {
		return this.reader.readLine();
	}
	
	public void send(String command) throws IOException {
		OutputStream writer = psh.getProcessOutputStream();
		
		if (writer != null) {
			byte[] bytes = command.getBytes(this.consoleCharSetName);
			writer.write(bytes);
			writer.flush();
		}
	}
	
	public void sendln(String command) throws IOException {
		OutputStream writer = psh.getProcessOutputStream();
		
		if (writer != null) {
			byte[] bytes = command.getBytes(this.consoleCharSetName);
			writer.write(bytes);
			bytes = "\n".getBytes(this.consoleCharSetName);
			writer.write(bytes);
			writer.flush();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		try {
			close();
		}
		catch (Throwable t) {
		}
		super.finalize();
	}
}
