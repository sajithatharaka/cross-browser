package browserwithfactory;

import org.openqa.selenium.WebDriver;

public interface BrowserFactory {
    WebDriver createDriver(String browser);
}
