package com.cts;
public class FacadePatternDemo {
	public static void main(String args[]) {
		ShapeMaker shapeMaker=new ShapeMaker();
		System.out.println("*********CIRCLE********");
		shapeMaker.drawCircle();
		System.out.println("*********RECTANGLE********");
		shapeMaker.drawRectangle();
		System.out.println("*********SQUARE********");
		shapeMaker.drawSquare();
	}
}
