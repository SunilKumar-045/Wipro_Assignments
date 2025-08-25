package pack;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://abc.com");
            WebElement element = driver.findElement(By.id("empid"));
            element.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("Element not interactable: " + e.getMessage());
        } catch (WebDriverException e) {
            System.out.println("WebDriver error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
