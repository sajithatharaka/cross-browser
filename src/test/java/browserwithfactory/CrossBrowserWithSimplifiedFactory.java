package browserwithfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CrossBrowserWithSimplifiedFactory {
    @Test
    public void chromeBrowserTest(){
        WebDriver driver=new BrowserFactoryImpl().createDriver("chrome");
        driver.get("https://google.com");
    }

    @Test
    public void firefoxBrowserTest(){
        WebDriver driver=new BrowserFactoryImpl().createDriver("firefox");
        driver.get("https://google.com");
    }

    @Test
    public void edgeBrowserTest(){
        WebDriver driver=new BrowserFactoryImpl().createDriver("edge");
        driver.get("https://google.com");
    }
}
