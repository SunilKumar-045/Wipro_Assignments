package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveDetails {

	public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try{
            // open target website
            driver.get("E:\\Html\\index.html");
            driver.manage().window().maximize();
            Thread.sleep(30000);
            // display employee id
            WebElement empIDElement = driver.findElement(By.name("empId"));
            String eId_value = empIDElement.getAttribute("value");
            System.out.println("Employee Id: " + eId_value);

            // display employee name
            WebElement empNameElement = driver.findElement(By.name("empName"));
            String ename_value = empNameElement.getAttribute("value");
            System.out.println("Employee Name: " + ename_value);

            // display employee email
            WebElement empMailElement = driver.findElement(By.name("email"));
            String email_value = empMailElement.getAttribute("value");
            System.out.println("Employee Email: " + email_value);

            // display employee phone number
            WebElement empPhoneElement = driver.findElement(By.name("mobile"));
            String ephone_value = empPhoneElement.getAttribute("value");
            System.out.println("Employee Phone: " + ephone_value);

        }catch( Exception e){
            e.getMessage();

        }finally {
            driver.quit();
        }

    }

}
