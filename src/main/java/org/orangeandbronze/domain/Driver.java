package org.orangeandbronze.domain;

public class Driver {
	public static void main(String[] args) {
		Square s1 = new Square(4);
		Square s2 = new Square(3);
		Circle c1 = new Circle(9);
		Shape[] shapes = new Shape[3];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = c1;
		
		ShapeEditor.drawAllShapes(shapes);
		
		
	}
}
