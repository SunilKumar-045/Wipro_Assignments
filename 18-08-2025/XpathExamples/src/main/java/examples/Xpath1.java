package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class Xpath1 {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        File file = new File("e:\\html\\table.html");
        String url = "file:///"+file.getAbsoluteFile();
        driver.get(url);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
        for(WebElement row:rows){
            List<WebElement> cells = row.findElements(By.tagName("td"));

            for(WebElement cell:cells){
                System.out.print(cell.getText()+"   ");
            }
            System.out.println();
        }
        driver.quit();



    }
}
