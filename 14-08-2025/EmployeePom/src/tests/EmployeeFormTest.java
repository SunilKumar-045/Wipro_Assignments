package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EmployeeFormPage;

public class EmployeeFormTest {
	public static void main(String[] args) {
	       //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	       WebDriver driver = new ChromeDriver();
	 
	      
	try {
	          driver.get("E:\\\\Html\\\\index.html");
	 
	           // Step 1: Initialize the Page Object
	           EmployeeFormPage formPage = new EmployeeFormPage(driver);
	 
	           // Step 2: Use page methods
	           formPage.enterEmpId("101");
	           Thread.sleep(1000);
	          formPage.enterEmpName("Harry");
	          Thread.sleep(1000);
	          formPage.enterEmail("harry@example.com");
	          Thread.sleep(1000);
	          formPage.enterDOB("07-06-2005");
	          Thread.sleep(1000);
	          formPage.enterAddress("123 ABC");
	          Thread.sleep(1000);
	          formPage.enterContactNo("7777777777");
	          Thread.sleep(1000);
	          formPage.clickSubmit();
	          Thread.sleep(2000);
	          formPage.alertmsg();
	 
	           // Wait and validate
	           
	           String message = formPage.getConfirmationMessage();
	           if (message != null) {
	              System.out.println("Success: " + message);
	           } else {
	              System.out.println("Submission failed or message not shown.");
	           }
	           Thread.sleep(10000);
	 
	       } catch (Exception e) {
//	          e.printStackTrace();
	       } finally {
	          driver.quit();
	       }
	   }
}
