package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("e://html//sample.html");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
        searchBox.sendKeys("hello world");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//button[text()='Search']"));
        button.click();
        driver.quit();
    }
}
