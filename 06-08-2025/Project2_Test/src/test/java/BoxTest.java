package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.Box;
public class BoxTest {
	
	Box box = new Box();
	
	public void testcircle() {
		assertEquals(50.27, box.circleArea(4));
	}
	public void testtriangle() {
		assertEquals(10.0, box.triangleArea(4, 5));
	}
	public void testsquare() {
		assertEquals(16, box.squareArea(4));
	}
	public void testrectangle() {
		assertEquals(20, box.rectangleArea(4, 5));
	}
	
	public void testSI() {
		assertEquals(166.67, box.simpleInterest(10000, 2, 10));
	}
	
	public void testamount() {
		assertEquals(12100166.67 , box.amount(10000, 2, 10));
	}

}
