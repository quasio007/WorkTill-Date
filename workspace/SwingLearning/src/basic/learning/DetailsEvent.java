package basic.learning;

import java.util.EventObject;

public class DetailsEvent extends EventObject {
	/**
		 * 
		 */
	private static final long serialVersionUID = -9214924766612868817L;
	private String text;
	private String command;

	public DetailsEvent(Object source, String text ,String command) {
		super(source);
		this.text = text;
		this.command =command;

	}
	public String getText(){
		return this.text;
	}
	public String getCommand(){
		return this.command;
	}
}
