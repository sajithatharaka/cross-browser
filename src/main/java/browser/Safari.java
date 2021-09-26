package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Safari implements IBrowser{
    @Override
    public WebDriver createInstance() {
       WebDriver driver= WebDriverManager.safaridriver().browserInDocker().create();
       return driver;
    }
}
