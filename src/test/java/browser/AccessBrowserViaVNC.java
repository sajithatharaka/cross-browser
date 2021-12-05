package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AccessBrowserViaVNC {
    @Test
    public void chrome() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.chromedriver().browserInDocker().enableVnc();
        WebDriver driver=webDriverManager.create();
        System.out.println(webDriverManager.getDockerNoVncUrl());
        Thread.sleep(5000);

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(4000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(4000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(4000);
    }

    @Test
    public void safari() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.safaridriver().browserInDocker().enableVnc();
        WebDriver driver=webDriverManager.create();
        System.out.println(webDriverManager.getDockerNoVncUrl());
        Thread.sleep(5000);

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(6000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(6000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(4000);
    }

    @Test
    public void firefox() throws Exception{
        WebDriverManager webDriverManager=WebDriverManager.firefoxdriver().browserInDocker().enableVnc();
        WebDriver driver=webDriverManager.create();
        System.out.println(webDriverManager.getDockerNoVncUrl());
        Thread.sleep(5000);

        driver.get("https://sajithatharaka.github.io/testers_helpers/");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(6000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(6000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(4000);
    }
}
