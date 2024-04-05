package org.Automation5x.Selemium31032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium43_exceptio {
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

        try {
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement ele = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
            driver.navigate().refresh();
         //   WebElement ele2 = driver.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
            ele.sendKeys("The Testing Academy");
            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS

            //  b1 - found driver
            // b1 remove
            // b1.click -> ? No such element

//        driver.switchTo().frame(1);
            //driver.switchTo().alert().accept();
        } catch (StaleElementReferenceException | NoSuchElementException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
