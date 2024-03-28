package org.Automation5x.Selenium1703;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium15 {
    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testVWOLogin14() throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //<a
        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">

        // Make Appointment
        // </a>

        WebElement btnElement_ID=driver.findElement(By.id("btn-make-appointment"));
        btnElement_ID.click();
        Thread.sleep(3000);
//        WebElement btnElement_class=driver.findElement(By.className("btn btn-dark btn-lg"));
//        WebElement btnElement_pterxt=driver.findElement(By.partialLinkText("Make Appointment"));
//        WebElement btnElement_terxt=driver.findElement(By.partialLinkText("Make"));
//        WebElement btnElement_xpath=driver.findElement(By.xpath("//a[@href='/profile.php#login']"));

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

//        WebElement user_ID=driver.findElement(By.id("txt-username"));
//        user_ID.sendKeys("John Doe");
        List<WebElement> user_ID=driver.findElements(By.xpath("//input[@placeholder='Password']"));
        user_ID.get(1).sendKeys("John Doe");

        WebElement user_pass=driver.findElement(By.xpath("//input[@id='txt-password']"));
        user_pass.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();






    }
}
