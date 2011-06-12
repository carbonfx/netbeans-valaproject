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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.IOUtils;


/**
 *
 * @author Magomed Abdurakhmanov
 */
public class LibvalaFactory {

	private String homeDirectory;
	private String valac;
	private String valaVersion;
	private String charSetName;
	private String parser;
	private String parserSource;
	private final int EXEC_TIMEOUT = 60;

	public LibvalaFactory() {

		this.valac = "valac";
		this.homeDirectory = appendSubDir(System.getProperty("user.home"), ".netbeans-vala-plugin");

		String defaultCharSetName = "utf8";
		if (isWindows()) {
			defaultCharSetName = "cp866";
		}

		this.charSetName = System.getProperty("console.encoding", defaultCharSetName);

		try {
			detectValaVersion();
			compileValaParser();
		} catch (LibvalaProxyException le) {
			throw le;
		} catch (Throwable t) {
			throw new LibvalaProxyException("Couldn't initialize LibvalaProxy", t);
		}
	}
	
	public void cleanup() {
		File sourceFile = new File(this.parserSource);
		if (sourceFile.exists()) {
			sourceFile.delete();
		}
		
		File parserFile = new File(this.parser);
		if (parserFile.exists()) {
			parserFile.delete();
		}
	}

	private String appendSubDir(String path, String subdir) {
		String fileSeparator = System.getProperty("file.separator");

		if (path.endsWith(fileSeparator)) {
			return path + subdir;
		} else {
			return path + fileSeparator + subdir;
		}
	}

	private void detectValaVersion() throws IOException, InterruptedException {
		String result = execute("valac --version", null, EXEC_TIMEOUT);
		if (result.toLowerCase().startsWith("vala ")) {
			this.valaVersion = result.toLowerCase().substring("vala ".length()).trim();
		} else {
			throw new LibvalaProxyException("Couldn't get vala version, got result: " + result);
		}
	}

	private void compileValaParser() throws FileNotFoundException, IOException, InterruptedException {
		String baseName = this.appendSubDir(this.homeDirectory, "vala-parser-" + this.valaVersion);
		this.parser = isWindows() ? baseName + ".exe" : baseName;
		this.parserSource = baseName + ".vala";

		File f = new File(this.parser);
		if (f.exists() && f.canExecute() && f.getTotalSpace() > 0) {
			return;
		}
		
		synchronized (this) {
			File homeDir = new File(this.homeDirectory);
			if (!homeDir.exists()) {
				homeDir.mkdir();
			}
			
			InputStream in = getClass().getResourceAsStream("/valaparser/vala-parser.vala");
            OutputStream out = new FileOutputStream(this.parserSource);
			IOUtils.copy(in, out);
			
			String command = this.valac + " --pkg=libvala-0.12 --pkg=gee-1.0 vala-parser-" + this.valaVersion + ".vala";
			String result = execute(command, homeDirectory, EXEC_TIMEOUT);
			if (f.exists() && f.canExecute() && f.getTotalSpace() > 0) {
				return;
			}
			
			throw new LibvalaProxyException("Compilation of " + baseName + ".vala" + " is failed with result: " + result);
		}
	}

	private String execute(String command, String directory, int timeoutInSeconds) throws IOException, InterruptedException {
		CommandLine cl = CommandLine.parse(command);
		Executor exec = new DefaultExecutor();
		
		if (directory != null && !directory.isEmpty()) {
			exec.setWorkingDirectory(new File(directory));
		}
		
		if (timeoutInSeconds > 0) {
			ExecuteWatchdog watchdog = new ExecuteWatchdog(timeoutInSeconds * 1000);
			exec.setWatchdog(watchdog);
		}

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PumpStreamHandler psh = new PumpStreamHandler(baos);
		exec.setStreamHandler(psh);
		exec.execute(cl);

		return baos.toString(this.charSetName);
	}

	private boolean isWindows() {
		return System.getProperty("os.name").compareToIgnoreCase("windows") == 0;
	}
	
	public LibvalaParser createParser() {
		try {
			return new LibvalaParser(this.parser);
		} catch (LibvalaProxyException le) {
			throw le;
		} catch (Throwable t) {
			throw new LibvalaProxyException("Couldn't execute parser", t);
		}
	}
}
