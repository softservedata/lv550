package com.softserve.edu;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void change(Point p0, Point p1) {
		double x = p0.getX();
		double y = p0.getY();
		p0.setX(p1.getX());
		p0.setY(p1.getY());
		p1.setX(x);
		p1.setY(y);
	}
	
	public static void main(String[] args) {
		Point p0 = new Point(1, 2);
		Point p1 = new Point(3, 4);
		//
		System.out.println("p0 = " + p0);
		System.out.println("p1 = " + p1);
		System.out.println("Updated Points");
//		ChangeUtils cUtil = new ChangeUtils();
//		cUtil.change(p0, p1);
		change(p0, p1);
		System.out.println("p0 = " + p0);
		System.out.println("p1 = " + p1);
	}
}
