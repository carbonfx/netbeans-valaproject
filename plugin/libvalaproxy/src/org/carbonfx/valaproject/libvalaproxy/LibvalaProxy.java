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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;

/**
 *
 * @author Magomed Abdurakhmanov
 */
public class LibvalaProxy {

	private String homeDirectory;
	private String valac;
	private String valaVersion;

	public LibvalaProxy() {

		this.valac = "valac";
		this.homeDirectory = appendSubDir(System.getProperty("user.home"), ".netbeans-vala-plugin");

		detectValaVersion();
		compileProxy();
	}

	private String appendSubDir(String path, String subdir) {
		String fileSeparator = System.getProperty("file.separator");
		if (path.endsWith(fileSeparator)) {
			return path + subdir;
		} else {
			return path + fileSeparator + subdir;
		}
	}

	private void detectValaVersion() {
	}

	private void compileProxy() {
	}

	private String execute(String command, int timeoutInSeconds) throws IOException, InterruptedException {
		CommandLine cl = CommandLine.parse("/bin/ls");
		cl.addArgument("/opt");

		Executor exec = new DefaultExecutor();
		ExecuteWatchdog watchdog = new ExecuteWatchdog(timeoutInSeconds * 1000);
		exec.setWatchdog(watchdog);

		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		PumpStreamHandler psh = new PumpStreamHandler(pipedOutputStream);
		exec.setStreamHandler(psh);

		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		exec.execute(cl, handler);

		int x;
		PipedInputStream pis = new PipedInputStream(pipedOutputStream);
		BufferedReader br = new BufferedReader(new InputStreamReader(pis));
		
		String line = null;
		StringBuilder result = new StringBuilder();
		while ( (line = br.readLine()) != null) {
			result.append(line);
			result.append("\n");
		}
		br.close();
		pis.close();
		handler.waitFor(timeoutInSeconds * 1000);
		return result.toString();
	}
}
