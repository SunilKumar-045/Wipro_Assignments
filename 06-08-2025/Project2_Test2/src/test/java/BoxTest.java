package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import main.java.Box;

public class BoxTest {

Box box = new Box();
	@Test
	public void testcircle() {
		double delta = 0.001;
		assertEquals(50.24, box.circleArea(4),delta);
	}
	@Test
	public void testtriangle() {
		assertEquals(10.0, box.triangleArea(4, 5));
	}
	@Test
	public void testsquare() {
		assertEquals(16, box.squareArea(4));
	}
	@Test
	public void testrectangle() {
		assertEquals(20, box.rectangleArea(4, 5));
	}
	@Test
	public void testSI() {
		double delta = 0.001;
		assertEquals(2000, box.simpleInterest(10000, 2, 10),delta);
	}
	@Test
	public void testamount() {
		double delta = 0.0001;
		assertEquals(14100 , box.amount(10000, 2, 10),delta);
	}
}
