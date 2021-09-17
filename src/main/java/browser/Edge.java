package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Edge implements IBrowser {

    public WebDriver createInstance() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
