package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) {
		 
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
 
        try {
             // 1. Open target website
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            System.out.println();
 
            // 2. Extract all links
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            System.out.println("Links:");
            for (WebElement link : allLinks) {
                System.out.println(link.getText() + " -> " + link.getAttribute("href"));
            }
            System.out.println();
            
            // 3. Extract all input fields
            List<WebElement> allInputs = driver.findElements(By.tagName("input"));
            System.out.println("Input Fields:");
            for (WebElement input : allInputs) {
                System.out.println("Type: " + input.getAttribute("type") + " | Placeholder: " + input.getAttribute("placeholder"));
            }
            System.out.println();
            
            // 4. Extract all buttons
            List<WebElement> allButtons = driver.findElements(By.tagName("button"));
            System.out.println("Buttons:");
            for (WebElement button : allButtons) {
                System.out.println("Text: " + button.getText());
            }
            System.out.println();
            
            // 5. Extract all headings (h1–h6)
            System.out.println("Headings:");
            for (int i = 1; i <= 6; i++) {
                List<WebElement> headings = driver.findElements(By.tagName("h" + i));
                for (WebElement heading : headings) {
                    System.out.println("H" + i + ": " + heading.getText());
                }
            }
            
            System.out.println();
            // 6. Extract all paragraphs
            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
            System.out.println("Paragraphs:");
            for (WebElement para : allParagraphs) {
                System.out.println(para.getText());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Close browser
//            driver.quit();
        }
    }

}
