package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Firefox implements IBrowser {
    public WebDriver createInstance() {
        WebDriverManager.firefoxdriver().setup();;
        return new FirefoxDriver();
    }
}
