package com.example.main;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
	private Calculator calculator;
	 
	   @BeforeClass
	   public void setUp() {
	       calculator = new Calculator();
	   }
	 
	   @Test
	   public void testAdd() {
	       int result = calculator.add(2, 3);
	      Assert.assertEquals(result, 5);
	   }
	 
	   @Test
	   public void testSubtract() {
	       int result = calculator.subtract(5, 2);
	      Assert.assertEquals(result, 3);
	   }
	   
	   @Test
	   public void testmul() {
		   int result= calculator.mul(5, 3);
		   Assert.assertEquals(15, result);
	   }
	   @Test
	   public void testdiv() {
		   int result = calculator.div(4, 2);
		   assertEquals(2, result);
	   }

}
