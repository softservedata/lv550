package com.softserve;

import com.softserve.edu.Point;

public class ChangeUtils {

	public void change(Point p0, Point p1) {
		double x = p0.getX();
		double y = p0.getY();
		p0.setX(p1.getX());
		p0.setY(p1.getY());
		p1.setX(x);
		p1.setY(y);
	}
	
}
