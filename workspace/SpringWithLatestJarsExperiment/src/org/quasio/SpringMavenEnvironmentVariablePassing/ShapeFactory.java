package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Autowired;

public class ShapeFactory {
	@Autowired
	public Circle circle;
	@Autowired
	public Square square;
	
	public Shape getShape(String shape) {
		switch (shape) {
		case "circle":
			return circle;
		case "square":
			return square;
		default:
			return null;
		}
	}
}
