package com.example.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHold {

	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		        driver.get("E:\\Html\\placehold.html");
		  
		        // Locate input field for username using only XPath (no id/name/class)
		        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		       usernameField.sendKeys("admin");
		       Thread.sleep(3000);
		        // Locate input field for password using only XPath
		        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		       passwordField.sendKeys("admin123");
		  
		        // Locate submit button using only XPath
		        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		       loginButton.click();
		       Thread.sleep(1000);		 
		       driver.quit();
		    }
}
