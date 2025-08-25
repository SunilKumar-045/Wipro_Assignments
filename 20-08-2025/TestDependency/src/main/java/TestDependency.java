import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDependency {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void launchWebsite() {
        driver.get("e://html//index.html");
        String expectedTitle = "Employee Form";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Launching Website");
    }

    @Test(dependsOnMethods = {"launchWebsite"})
    public void performLogin() {
        // Simulate login functionality
        System.out.println("Login test running...");
        // e.g., driver.findElement(By.id("login")).click();
    }

    @Test(dependsOnMethods = {"performLogin"})
    public void verifyDashboard() {
        // Simulate dashboard verification
        System.out.println("Dashboard verification test running...");
        // e.g., Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
