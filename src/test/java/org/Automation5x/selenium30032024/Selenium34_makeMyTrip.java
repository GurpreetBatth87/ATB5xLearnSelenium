package org.Automation5x.selenium30032024;

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

import java.util.List;

public class Selenium34_makeMyTrip {
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

        driver.get("https://www.makemytrip.com");
       // driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement fromcity = driver.findElement(By.id("fromCity"));
      Actions action =new Actions(driver);
      action.moveToElement(fromcity).click().sendKeys("New Delhi").build().perform();

        List<WebElement> auto_sugges = driver.findElements(By.xpath("//ul[@class = 'react-autosuggest__suggestions-list']/li"));

        for (WebElement e:auto_sugges) {
           if (e.getText().contains("New Delhi")) {
               e.click();
               break;
           }
        }

        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
