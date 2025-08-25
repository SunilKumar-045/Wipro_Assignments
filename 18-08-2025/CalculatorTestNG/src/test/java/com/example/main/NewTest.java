package com.example.main;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	private Calculator calculator;
	 
	   @BeforeClass()
	   public void setUp() {
	       calculator = new Calculator();
	   }
	 
	   @Test(priority = 4)
	   public void testAdd() {
	       int result = calculator.add(2, 3);
	      Assert.assertEquals(result, 5);
	   }
	 
	   @Test(priority = 3)
	   public void testSubtract() {
	       int result = calculator.subtract(5, 2);
	      Assert.assertEquals(result, 3);
	   }
	   
	   @Test(priority = 2)
	   public void testmul() {
		   int result= calculator.mul(5, 3);
		   Assert.assertEquals(15, result);
	   }
	   @Test(priority = 1)
	   public void testdiv() {
		   int result = calculator.div(4, 2);
		   assertEquals(2, result);
	   }
}
