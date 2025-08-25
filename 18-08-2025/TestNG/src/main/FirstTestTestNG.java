package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestTestNG {
	WebDriver driver;
	 
	@BeforeClass
	public void testSetup()
	{
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	 
	}
	 
	@BeforeMethod
	public void openBrowser()
	{
	driver.get("E:\\Html\\index.html");
	driver.findElement(By.id("signupModalButton")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}
	 
	@Test(description="This method validates the sign up functionality")
	public void signUp()
	{
	driver.findElement(By.xpath("//input[@id='empId']")).sendKeys("45");
	driver.findElement(By.xpath("//input[@id='empName']")).sendKeys("Sunil");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("csunil@gmail.com");
	driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("07-06-2002");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("hyd");
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9966228877");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	 
	}
	 
	 
	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}
	 

}
