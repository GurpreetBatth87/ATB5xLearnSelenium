package org.Automation5x.Selemium31032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Selenium39_windows {
    WebDriver driver;
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    @BeforeTest
    public void openZBrowser(){
        //Create sesion via API and session

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }





    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testPostive() throws InterruptedException {

        driver.get("https://app.vwo.com/#/analyze/osa/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        String mainWindowHandel = driver.getWindowHandle();
        System.out.println("before Handel " + mainWindowHandel);
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.cssSelector("[data-qa=\"yedexafobi\"]"))).click().build().perform();

        Thread.sleep(5000);

        Set<String> windowHandels = driver.getWindowHandles();
        System.out.println(windowHandels);

        Iterator<String> iterator = windowHandels.iterator();
        while (iterator.hasNext()){
            String childwindow = iterator.next();
            if(!mainWindowHandel.equalsIgnoreCase(childwindow)){
                driver.switchTo().window(childwindow);
                System.out.println(driver.getTitle());
            }
        }

        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
