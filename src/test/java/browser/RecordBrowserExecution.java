package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;

public class RecordBrowserExecution {
    @Test
    public void chrome() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.chromedriver().browserInDocker().enableRecording();
        WebDriver driver=webDriverManager.create();

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();

        driver.quit();

        System.out.println(webDriverManager.getDockerRecordingPath());
        Files.delete(webDriverManager.getDockerRecordingPath());
    }

    @Test
    public void safari() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.safaridriver().browserInDocker().enableRecording();
        WebDriver driver=webDriverManager.create();

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();

        driver.quit();
    }

    @Test
    public void firefox() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.firefoxdriver().browserInDocker().enableRecording();
        WebDriver driver=webDriverManager.create();

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}
