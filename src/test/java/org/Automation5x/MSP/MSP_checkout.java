package org.Automation5x.MSP;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MSP_checkout {
    WebDriver driver;
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
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
Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.checkBtn > span")));

        WebElement startbutton = driver.findElement(By.cssSelector("button.checkBtn > span"));
        startbutton.click();

        Thread.sleep(10000);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control dropdown ng-pristine ng-invalid ng-touched']")));

        WebElement element_select = driver.findElement(By.xpath("//*[@id=\"earlyLateCheckOut\"]/select[1]"));
        Actions actions =new Actions(driver);
        actions.moveToElement(element_select).click().build().perform();
        System.out.println("perform the click ***************");
        Select select = new Select(element_select);
        select.selectByIndex(4);






        

    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
