package org.Automation5x.MSP;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class msp {
    WebDriver driver;
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    @BeforeTest
    public void openZBrowser(){
        //Create sesion via API and session

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }





    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testPostive() throws InterruptedException {

        driver.get("https://msp.serviceo.me/app/workforce-checkin-checkout");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("gurpreets@serviceglobal.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Gurpreet@1234");



        WebElement searchbutton = driver.findElement(By.cssSelector("button[value=default]"));
        searchbutton.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.alertIsPresent());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.startBtn > span")));

        WebElement startbutton = driver.findElement(By.cssSelector("button.startBtn > span"));
        startbutton.click();
        System.out.println(startbutton);





        

    }





    @AfterTest
    public void closeBrowser(){
        //driver.quit();
    }
}
