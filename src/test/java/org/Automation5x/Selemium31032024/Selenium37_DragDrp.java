package org.Automation5x.Selemium31032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium37_DragDrp {
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

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        Actions actions = new Actions(driver);
       // actions.dragAndDrop(from,to).perform();
actions.clickAndHold(from).moveToElement(to).build().perform();

        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement chosefile= driver.findElement(By.id("fileToUpload"));
        String user =System.getProperty("user.dir");
        System.out.println(user);
        chosefile.sendKeys(user+"\\src\\test\\java\\org\\Automation5x\\Selemium31032024\\gurru.text");

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();






        Thread.sleep(13000);

    }

























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
