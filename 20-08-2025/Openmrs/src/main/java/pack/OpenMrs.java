package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMrs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://o3.openmrs.org/openmrs/spa/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        WebElement cont = driver.findElement(By.xpath("//button[text()='Continue']"));
        cont.click();
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Admin123");
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

    }
}
