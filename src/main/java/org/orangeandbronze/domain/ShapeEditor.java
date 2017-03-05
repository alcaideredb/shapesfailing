package org.orangeandbronze.domain;

public class ShapeEditor {
	public static void drawAllShapes(Shape[] shapes) {
		for (Shape shape : shapes) {
			switch (shape.myType) {
			case CIRCLE:
				drawCircle((Circle)shape);
				break;
			case SQUARE:
				drawSquare((Square)shape);
				break;
			}
			
			System.out.println();
		}
	}
	/*
	 * This was taken from princeton's intro to cs class 
	 * http://introcs.cs.princeton.edu/java/13flow/Circle.java.html
	 */
	public static void drawCircle(Circle circle) {
		int radius = circle.getRadius();
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i*i + j*j <= radius*radius) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
        }
	}
	
	public static void drawSquare(Square square) {
		int n = square.getLength();
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
        	   System.out.print("*");
           }
           System.out.println();
        }
	}
}
