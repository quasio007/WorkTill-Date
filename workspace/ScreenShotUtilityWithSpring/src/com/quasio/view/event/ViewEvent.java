package com.quasio.view.event;

import java.util.EventObject;

public class ViewEvent extends EventObject {
	/**
		 * 
		 */
	private static final long serialVersionUID = -9214924766612868817L;
	private String bfsId;
	private String env;
	private String functionality;

	public ViewEvent(Object source, String bfsId, String env, String functionality) {
		super(source);
		this.bfsId =bfsId;
		this.env = env;
		this.functionality =functionality;

	}

	public String getBfsId() {
		return bfsId;
	}

	public String getEnv() {
		return env;
	}

	public String getFunctionality() {
		return functionality;
	}

}
