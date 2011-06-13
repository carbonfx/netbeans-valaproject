/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carbonfx.valaproject.libvalaproxy;

import java.io.OutputStream;
import org.apache.commons.exec.PumpStreamHandler;

/**
 *
 * @author maqdev
 */
public class PumpStreamHandlerPlainInput extends PumpStreamHandler {

	OutputStream os;
	
	public PumpStreamHandlerPlainInput(OutputStream out) {
		super(out,out,null);
	}
	
	public OutputStream getProcessOutputStream() {
		return os;
	}
	
	@Override
	public void setProcessInputStream(OutputStream os) {
		this.os = os;
	}
}
