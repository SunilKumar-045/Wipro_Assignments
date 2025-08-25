package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeFormPage {

	WebDriver driver;
	 
	   // Constructor
	   public EmployeeFormPage(WebDriver driver) {
	       this.driver = driver;
	   }
	 
	   // Locators
	   By empIdField = By.id("empId");
	   By empNameField = By.id("empName");
	   By dobField = By.id("dob");
	   By addressField = By.id("address");
	   By contactNoField = By.id("mobile");
	   By emailField = By.id("email");
	   By submitButton = By.cssSelector("input[type='submit']");
	   By messageText = By.id("message");
	 
	   // Actions
	   public void enterEmpId(String empId) {
	      driver.findElement(empIdField).sendKeys(empId);
	   }
	 
	   public void enterEmpName(String empName) {
	      driver.findElement(empNameField).sendKeys(empName);
	   }
	 
	   public void enterDOB(String dob) {
	      driver.findElement(dobField).sendKeys(dob);
	   }
	 
	   public void enterAddress(String address) {
	      driver.findElement(addressField).sendKeys(address);
	   }
	 
	   public void enterContactNo(String contactNo) {
	      driver.findElement(contactNoField).sendKeys(contactNo);
	   }
	 
	   public void enterEmail(String email) {
	      driver.findElement(emailField).sendKeys(email);
	   }
	 
	   public void clickSubmit() {
	      driver.findElement(submitButton).click();
	   }
	 
	   public String getConfirmationMessage() {
	       WebElement message = driver.findElement(messageText);
	       return message.isDisplayed() ? message.getText() : null;
	   }
	   
	   public void alertmsg() {
		 //Alert
		     // Trigger the alert
//		        driver.findElement(By.id("triggerAlert")).click();
		 
		        // Switch to alert
		        Alert alert = driver.switchTo().alert();
		 
		        // Read alert text
		        String alertMessage = alert.getText();
		        System.out.println("Alert message: " + alertMessage);
		 
		        // Accept the alert
		        alert.accept();
	   }
	   
	   
	 
	
}
