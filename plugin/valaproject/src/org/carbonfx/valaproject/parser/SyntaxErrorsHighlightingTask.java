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
package org.carbonfx.valaproject.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import org.carbonfx.valaproject.antlr.ValaParser.SyntaxError;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;

public class SyntaxErrorsHighlightingTask extends ParserResultTask {

	public SyntaxErrorsHighlightingTask() {
	}

	//org.carbonfx.valaproject.antlr.ValaParser
	@Override
	public void run(Result result, SchedulerEvent se) {
		try {
			ValaParser.ValaParserResult r = (ValaParser.ValaParserResult) result;
			List<SyntaxError> syntaxErrors = r.getParser().syntaxErrors;
			Document document = result.getSnapshot().getSource().getDocument(false);

			List<ErrorDescription> errors = new ArrayList<ErrorDescription>();

			for (SyntaxError syntaxError : syntaxErrors) {
				org.antlr.runtime.RecognitionException exception = syntaxError.exception;
				String message = syntaxError.message;

				int line = exception.line;
				if (line <= 0) {
					continue;
				}
				ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
						Severity.ERROR,
						message,
						document,
						line);
				errors.add(errorDescription);
			}

			HintsController.setErrors(document, "vala", errors);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public int getPriority() {
		return 100;
	}

	@Override
	public Class<? extends Scheduler> getSchedulerClass() {
		return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
	}

	@Override
	public void cancel() {
	}
}
