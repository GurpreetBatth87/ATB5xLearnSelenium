package org.Automation5x.Selenium23032024;

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

public class Selenium22 {
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

       // WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-qa='lufexuloga']")));
        WebElement loggedin_username= driver.findElement(By.cssSelector("[data-qa='lufexuloga']"));

        System.out.println("Logged in User details -> " +loggedin_username.getText());


       // wait.until(ExpectedConditions.textToBePresentInElement(error_msg,"Your email, password, IP address or location did not match"));
       // Thread.sleep(3000);


    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
