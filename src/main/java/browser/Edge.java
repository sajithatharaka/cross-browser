package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;

import java.nio.file.Paths;
import java.util.HashMap;

class Edge implements IBrowser {
    HashMap<String,Object> edgePrefs=new HashMap<>();
    public Edge(){
        edgePrefs.put("download.default_directory", Paths.get("").toAbsolutePath().toString());
    }

    public WebDriver createInstance() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options=new EdgeOptions();
        options.setExperimentalOption("prefs",edgePrefs);
        return new EdgeDriver(options);
    }
}
