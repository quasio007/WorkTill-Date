package org.quasio.SpringMavenEnvironmentVariablePassing;

import javax.annotation.Resource;

public class ShapeFactory {
	@Resource(name="getCircle")
	private Shape circle;
	@Resource(name="getSquare")
	public Shape square;
	
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
