package org.Automation5x.Selenium24032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium25 {
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

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
//WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        //element.click();
        //elementConfirm.click();
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Gurpreet");
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result,"You successfully clicked an alert");
        //Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: PRAMOD");


        Thread.sleep(1500);



    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
