package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
    WebDriver driver;

    @Test
    public void chrome() throws Exception {
        driver = BrowserFactory.getBrowser("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    @Test
    public void firefox() throws Exception {
        driver = BrowserFactory.getBrowser("firefox");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void safari() throws Exception {
        driver = BrowserFactory.getBrowser("safari");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
}
