package org.orangeandbronze.domain;

public class Square extends Shape {
	private int length;

	public Square(int n) {
		length = n;
		myType = ShapeType.SQUARE;
	}
	public int getLength() {
		return length;
	}
	

}
