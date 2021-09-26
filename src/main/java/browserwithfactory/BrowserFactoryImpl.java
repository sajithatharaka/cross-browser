package browserwithfactory;

import com.google.common.base.Supplier;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactoryImpl implements BrowserFactory {
    private Supplier<WebDriver> chromeDriver = () -> {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        return driver;
    };

    private Supplier<WebDriver> firefoxDriver = () -> {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        return driver;
    };

    private Supplier<WebDriver> edgeDriver = () -> {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        return driver;
    };

    private Supplier<WebDriver> safariDriver = () -> {
        WebDriver driver=WebDriverManager.safaridriver().browserInDocker().create();
        return driver;
    };


    private Map<String, Supplier<WebDriver>> driverMap = new HashMap<>();

    public BrowserFactoryImpl() {
        driverMap.put("chrome", chromeDriver);
        driverMap.put("firefox", firefoxDriver);
        driverMap.put("edge", edgeDriver);
        driverMap.put("safari", safariDriver);

    }

    public WebDriver createDriver(String browser) {
        return driverMap.getOrDefault(browser.toLowerCase(), chromeDriver).get();
    }
}
