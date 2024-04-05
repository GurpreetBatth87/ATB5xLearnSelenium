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

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium40_right {
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

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement spamelement =driver.findElement(By.xpath("//span[text()='Years of Experience']"));
driver.findElement(with(By.id("exp-1")).toRightOf(spamelement)).click();


        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
