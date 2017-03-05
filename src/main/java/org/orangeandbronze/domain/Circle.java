package org.orangeandbronze.domain;


public class Circle extends Shape {
	private int radius;
	
	
	public Circle(int r) {
		radius = r;
		myType = ShapeType.CIRCLE;
	}


	public int getRadius() {
		return radius;
	}
 
	
	
	
}