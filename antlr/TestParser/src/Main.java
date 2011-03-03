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

import org.antlr.runtime.*;
import org.carbonfx.valaproject.antlr.ValaLexer;
import org.carbonfx.valaproject.antlr.ValaParser;


public class Main {

    public static void main(String args[]) throws Exception {

		String s = args[0];

        ValaLexer lex = new ValaLexer(new ANTLRFileStream(s, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ValaParser g = new ValaParser(tokens);
		int errorCode = 0;
        try {
            g.compilation_unit();
        } catch (RecognitionException e) {
            //e.printStackTrace();
			errorCode = 100;
        }
		catch (Throwable t)
		{
			//t.printStackTrace();
			errorCode = 200;
		}

		if (g.getNumberOfSyntaxErrors() > 0)
		{
			errorCode = 300;
		}

		if (errorCode != 0)
		{
			System.out.println("Failed to parse: " + s);
		}

		System.exit(errorCode);
    }
}