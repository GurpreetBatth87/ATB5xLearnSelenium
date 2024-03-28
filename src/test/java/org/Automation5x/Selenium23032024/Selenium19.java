package org.Automation5x.Selenium23032024;

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

public class Selenium19 {
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

        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchbutton = driver.findElement(By.cssSelector("input[value=\"Search\"]"));
        searchbutton.click();

        Thread.sleep(300);

        List<WebElement> searchtitle = driver.findElements(By.xpath("//*[@class = 's-item__title']/span"));
        int i =0;
        for (WebElement title:searchtitle) {
            System.out.println(i + "--->"+title.getText());
            if (i==10){
                title.click();
                i++;
            }

        }
        

    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
