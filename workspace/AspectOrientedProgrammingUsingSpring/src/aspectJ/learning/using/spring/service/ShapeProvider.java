package aspectJ.learning.using.spring.service;

import aspectJ.learning.using.spring.model.Circle;
import aspectJ.learning.using.spring.model.Triangle;

public class ShapeProvider {
private Circle circle;
private Triangle triangle;
public Circle getCircle() {
	return circle;
}
public void setCircle(Circle circle) {
	this.circle = circle;
}
public Triangle getTriangle() {
	return triangle;
}
public void setTriangle(Triangle triangle) {
	this.triangle = triangle;
}

}
