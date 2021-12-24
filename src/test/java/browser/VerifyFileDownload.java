package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestData;

public class VerifyFileDownload {
    @Test
    public void fileDownload() throws Exception{
        WebDriver driver=BrowserFactory.getBrowser("chrome");
        driver.manage().window().maximize();
        driver.get("https://sample-videos.com/download-sample-csv.php");
        Thread.sleep(6000);
        driver.findElement(By.partialLinkText("Click")).click();
        Thread.sleep(10000);
        driver.quit();
        boolean isDownloaded=TestData.isFileDownloaded("Sample-Spreadsheet-10-rows.csv",10);
        Assert.assertEquals(isDownloaded,true);
    }
}
