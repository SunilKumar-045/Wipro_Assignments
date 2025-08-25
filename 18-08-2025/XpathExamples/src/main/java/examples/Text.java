package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("e://html//text.html");

        WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder,'username')]"));
        username.sendKeys("sunil");
        WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'password')]"));
        password.sendKeys("123456");
        Thread.sleep(2000);
        WebElement forgotlink = driver.findElement(By.xpath("//A[text()='Forgot Password?']"));
        forgotlink.click();

        driver.quit();
    }
}
