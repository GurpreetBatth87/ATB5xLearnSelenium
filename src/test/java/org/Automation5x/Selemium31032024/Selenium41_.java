package org.Automation5x.Selemium31032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium41_ {
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

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        Thread.sleep(5000);


        WebElement citysearch =driver.findElement(By.xpath("//input[@id='search_city']"));
        citysearch.sendKeys("India"+ Keys.ENTER);
//driver.findElement(with(By.id("exp-1")).toRightOf(spamelement)).click();
        ////table[@id='example']/tbody/tr/td[2]

        List<WebElement> list_of_States = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));

        for (WebElement l :list_of_States) {
            String s1 = driver.findElement(with(By.tagName("P")).toRightOf(l)).getText();
            String s2 = driver.findElement(with(By.tagName("P")).toRightOf(l)).getText();
            System.out.println(l.getText() + " == > "+ s1 + " ===> "+s2);
        }


        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
