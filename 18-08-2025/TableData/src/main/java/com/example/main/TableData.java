package com.example.main;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
	public static void main(String[] args) {
		 
        //Load the WebDriver
WebDriver driver = new ChromeDriver();

 // Load local file
 File htmlFile = new File("E:\\Html\\table.html");
 String url = "file:///" + htmlFile.getAbsolutePath();
driver.get(url);

 // locate all rows inside tbody
List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));

 // iterate each row
 //Enhanced for loop
for (WebElement row : rows) {
     // get all cells (td) in current row
    List<WebElement> cells = row.findElements(By.tagName("td"));

     // print each cell value
     for (WebElement cell : cells) {
        System.out.print(cell.getText() + "    ");
     }
    System.out.println();
 }

 driver.quit();
}

}
