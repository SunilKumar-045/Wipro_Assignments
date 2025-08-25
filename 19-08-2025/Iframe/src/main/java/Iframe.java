import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Load local main.html
        File file = new File("e:\\html\\main.html");
        String url = "file:///" + file.getAbsolutePath();
        driver.get(url);
        Thread.sleep(2000);
        // Switch to iframe by id
        driver.switchTo().frame("myFrame");

        // Now we're inside the iframe, so we can locate the input field by its id
        WebElement messageInput = driver.findElement(By.id("message"));
        messageInput.sendKeys("Hello Learners!!!!");
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.switchTo().frame("myFrame2");
        WebElement messageInput2 = driver.findElement(By.id("message"));

        messageInput2.sendKeys("Hello Frame2");
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.switchTo().frame("myFrame3");
        WebElement messageInput3 = driver.findElement(By.id("message"));

        messageInput3.sendKeys("Hello Frame 3");
        Thread.sleep(2000);
        // Switch back to main page
        driver.switchTo().defaultContent();

//        driver.quit();
    }
}
