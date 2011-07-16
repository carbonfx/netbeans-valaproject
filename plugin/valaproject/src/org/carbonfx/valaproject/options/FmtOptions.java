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
package org.carbonfx.valaproject.options;

import java.util.HashMap;
import java.util.Map;
import org.netbeans.api.editor.settings.SimpleValueNames;

public class FmtOptions {

	public static final String expandTabToSpaces = SimpleValueNames.EXPAND_TABS;
	public static final String tabSize = SimpleValueNames.TAB_SIZE;
	public static final String indentSize = SimpleValueNames.INDENT_SHIFT_WIDTH;
	//public static final String spacesPerTab = SimpleValueNames.SPACES_PER_TAB;
	public static final String rightMargin = SimpleValueNames.TEXT_LIMIT_WIDTH;

	private FmtOptions() {
	}

	public static int getDefaultAsInt(String key) {
		return Integer.parseInt(defaults.get(key));
	}

	public static boolean getDefaultAsBoolean(String key) {
		return Boolean.parseBoolean(defaults.get(key));
	}

	public static String getDefaultAsString(String key) {
		return defaults.get(key);
	}
	// Private section ---------------------------------------------------------
	private static final String TRUE = "true";      // NOI18N
	private static final String FALSE = "false";    // NOI18N
	private static Map<String, String> defaults;

	static {
		createDefaults();
	}

	private static void createDefaults() {
		String defaultValues[][] = {
			{expandTabToSpaces, TRUE}, //NOI18N
			{tabSize, "4"}, //NOI18N
			{indentSize, "4"}, //NOI18N
			{rightMargin, "80"}, //NOI18N
		};

		defaults = new HashMap<String, String>();

		for (java.lang.String[] strings : defaultValues) {
			defaults.put(strings[0], strings[1]);
		}
	}
}
