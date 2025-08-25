//package tests;
//
//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.common.collect.Table.Cell;
//
//public class KeywordDrivenTest {
//
//	static WebDriver driver;
//	 
//	   public static void main(String[] args) {
//	       try {
//	          FileInputStream file = new FileInputStream(new File("TestSteps.xlsx"));
//	           Workbook workbook = new XSSFWorkbook(file);
//	           Sheet sheet = workbook.getSheetAt(0);
//	 
//	          
//	 
//	for (Row row : sheet) {
//	               if (row.getRowNum() == 0) continue; // skip header
//	 
//	               String keyword = row.getCell(1).getStringCellValue();
//	               String locatorType = getCellValue(row.getCell(2));
//	               String locatorValue = getCellValue(row.getCell(3));
//	               String data = getCellValue(row.getCell(4));
//	 
//	              executeStep(keyword, locatorType, locatorValue, data);
//	           }
//	 
//	          workbook.close();
//	       } catch (Exception e) {
//	          e.printStackTrace();
//	       }
//	   }
//	 
//	   public static String getCellValue(Cell cell) {
//	       if (cell == null) return "";
//	       return switch (cell.getCellType()) {
//	           case STRING -> cell.getStringCellValue();
//	           case NUMERIC -> String.valueOf((int) cell.getNumericCellValue());
//	           default -> "";
//	       };
//	   }
//	 
//	   public static void executeStep(String keyword, String locatorType, String locatorValue, String data) {
//	       switch (keyword.toLowerCase()) {
//	           case "openbrowser" -> {
//	               //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//	               driver = new ChromeDriver();
//	           }
//	           case "openurl" -> driver.get(data);
//	           case "inputtext" -> getElement(locatorType, locatorValue).sendKeys(data);
//	           case "click" -> getElement(locatorType, locatorValue).click();
//	           case "closebrowser" -> driver.quit();
//	           default -> System.out.println("Unknown keyword: " + keyword);
//	       }
//	   }
//	 
//	   public static WebElement getElement(String type, String value) {
//	       return switch (type.toLowerCase()) {
//	           case "id" -> driver.findElement(By.id(value));
//	           case "name" -> driver.findElement(By.name(value));
//	           case "cssselector" -> driver.findElement(By.cssSelector(value));
//	           case "xpath" -> driver.findElement(By.xpath(value));
//	           default -> throw new IllegalArgumentException("Invalid locator type: " + type);
//	       };
//	   }
//}
