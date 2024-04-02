package org.Automation5x.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium31_JavascriptExecutor {
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

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
//document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("input#pizza");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement divScrollTo = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",divScrollTo);

        Thread.sleep(3000);



        WebElement e = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");

        e.sendKeys("PizzaHut");

        Thread.sleep(10000);

        }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
