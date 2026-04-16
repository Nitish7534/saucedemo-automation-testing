package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait for elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        try {
            Thread.sleep(3000); // Keep browser open for 3 seconds after test
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}