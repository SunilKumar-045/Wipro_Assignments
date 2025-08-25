import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
    public static void main(String[] args) {

//Load the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Load the local HTML file
            driver.get("file:///e://html//form.html");
            Thread.sleep(1000);
            // Select radio button (e.g., Male)
            WebElement maleRadio = driver.findElement(By.id("male"));
            if (!maleRadio.isSelected()) {
                maleRadio.click();
            }
Thread.sleep(1000);
            // Select checkbox
            WebElement agreeCheckbox = driver.findElement(By.id("agree"));
            if (!agreeCheckbox.isSelected()) {
                agreeCheckbox.click();
            }
            Thread.sleep(1000);
            // Select dropdown value (India)
            WebElement countryDropdownElement = driver.findElement(By.id("country"));
            Select countryDropdown = new Select(countryDropdownElement);
            countryDropdown.selectByVisibleText("India");

            // Print selected country
            WebElement selected = countryDropdown.getFirstSelectedOption();
            System.out.println("Selected Country: " + selected.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
