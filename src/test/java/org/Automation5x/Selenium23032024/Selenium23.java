package org.Automation5x.Selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium23 {
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

        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Global wait to all the elements which we don't use

        driver.findElement(By.id("login-username")).sendKeys("contact+atb5x@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("ATBx@1234");
        driver.findElement(By.id("js-login-btn")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        WebElement loggedin_username = wait.until(driver -> driver.findElement(By.cssSelector("[data-qa='lufexuloga']")));

        System.out.println("Logged in User details -> " +loggedin_username.getText());


       // wait.until(ExpectedConditions.textToBePresentInElement(error_msg,"Your email, password, IP address or location did not match"));
       // Thread.sleep(3000);


    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
