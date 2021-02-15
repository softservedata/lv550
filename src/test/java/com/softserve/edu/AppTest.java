package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() {
		Point p = new Point(1, 2);
		System.out.println("p = " + p);
		System.out.println("***testApp() done");
		Assert.assertTrue(true);
	}
}
