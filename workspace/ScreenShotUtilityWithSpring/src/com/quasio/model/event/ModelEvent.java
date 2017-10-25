package com.quasio.model.event;

import java.util.EventObject;

public class ModelEvent extends EventObject {
	/**
		 * 
		 */
	private static final long serialVersionUID = -9214924766612868818L;
	private String message;

	public ModelEvent(Object source, String message) {
		super(source);
		this.message =message;

	}

	public String getMessage() {
		return message;
	}

}
