package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			// Launch Chrome browser
			driver = new ChromeDriver();
			
			// Go to Google
			driver.get("https://instagram.com");
			
			// Find the search box and type a query
			WebElement searchBox = driver.findElement(By.cssSelector("submit"));
			
			searchBox.sendKeys("rtdddo89");
			// Submit the search form
			searchBox.submit();
//			WebElement searchButton = driver.findElement(By.id("nav-search-submit-button")); 
//			searchButton.click();
//			
			// Wait a bit (basic pause, not best practice)
//			Thread.sleep(2000); // Wait 2 seconds for results to load
			
		} catch (Exception e) {
			// e.printStackTrace();
		}
		// Print the title of the results page
		System.out.println("Search Results Page Title: " + driver.getTitle());
		// Close the browser
//		driver.quit();
	}

}
