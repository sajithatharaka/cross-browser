package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    private static WebDriver driver;
    public static WebDriver getBrowser(String browser){
        browser=browser.trim();
      try {
          if("chrome".equals(browser.trim())){
              driver=new Chrome().createInstance();
          }else if("edge".equals(browser.trim())){
              driver=new Edge().createInstance();
          }else if("firefox".equals(browser.trim())){
              driver=new Firefox().createInstance();
          }else if("safari".equals(browser.trim())){
              driver=new Safari().createInstance();
          }else {
              throw new BrowserException(browser+" is not supported");
          }
      }catch (BrowserException ex){
          ex.printStackTrace();
      }
        return driver;
    }
}
