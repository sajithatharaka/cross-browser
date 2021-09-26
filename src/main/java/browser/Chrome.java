package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Chrome implements IBrowser {
    public WebDriver createInstance() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
