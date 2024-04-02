package org.Automation5x.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium30_Find_SVG {
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

        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        //driver.manage().window().maximize();

        ////*[name()='svg']//*[name()='g'][7]//*[name()='g']//*[name()='g']//*[name()='path']
        //Click on the punjab

        String findMap = "//*[name()='svg']//*[name()='g'][7]//*[name()='g']//*[name()='g']//*[name()='path']";
        List<WebElement> StateList = driver.findElements(By.xpath(findMap));

        for (WebElement States:StateList) {
            System.out.println(States.getAttribute("aria-label"));
            if (States.getAttribute("aria-label").contains("Punjab")){
                States.click();
                break;
            }
            Thread.sleep(1000);

        }



















    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
