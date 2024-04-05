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

import java.util.Set;

public class Selenium38 {
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

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String mainWindowHandel = driver.getWindowHandle();
        System.out.println("before Handel " + mainWindowHandel);
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windowHandel = driver.getWindowHandles();
        // All the windows Tab have a unique name

        for (String handles : windowHandel) {
            driver.switchTo().window(handles);
            System.out.println(handles);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test case is Okay BOS");
            }

        }
driver.switchTo().window(mainWindowHandel);
        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
