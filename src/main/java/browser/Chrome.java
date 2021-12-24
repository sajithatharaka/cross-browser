package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.HashMap;

class Chrome implements IBrowser {
    HashMap<String,Object> chromePrefs=new HashMap<>();

    public WebDriver createInstance() {
        WebDriverManager.chromedriver().setup();
        chromePrefs.put("download.default_directory", Paths.get("").toAbsolutePath().toString());

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",chromePrefs);

        return new ChromeDriver(options);
    }
}
