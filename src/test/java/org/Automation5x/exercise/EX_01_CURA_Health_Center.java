package org.Automation5x.exercise;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;
import java.time.Duration;

public class EX_01_CURA_Health_Center {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Verify to Book the Appointment on CURA Healthcare Service Portal ")
    public void testVWOLogin14() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement btnElement_ID = driver.findElement(By.id("btn-make-appointment"));
        btnElement_ID.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt-password']")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement user_ID = driver.findElement(By.id("txt-username"));
        user_ID.sendKeys("John Doe");


        WebElement user_pass = driver.findElement(By.xpath("//input[@id='txt-password']"));
        user_pass.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        WebElement element_select = driver.findElement(By.id("combo_facility"));
        Select select = new Select(element_select);
        select.selectByIndex(2);

        WebElement Checkbox = driver.findElement(By.cssSelector("input#radio_program_none"));
        Checkbox.click();
        WebElement VisitDate = driver.findElement(By.cssSelector("input#txt_visit_date"));
        VisitDate.sendKeys("01/01/2024");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='comment']")));

        WebElement Comment = driver.findElement(By.xpath("//textarea[@name='comment']"));
        Comment.click();
        Comment.sendKeys("Test Automation ");
        WebElement BookAppointment = driver.findElement(By.cssSelector("button#btn-book-appointment"));
        BookAppointment.click();


        WebElement comment_message = driver.findElement(By.xpath("//p[@id='comment']"));
        wait.until(ExpectedConditions.textToBePresentInElement(comment_message,"Test Automation"));
        System.out.println("--->"+comment_message.getText());


        WebElement valid_message = driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']"));


    }

        @AfterTest
        public void closeBrowser(){
            //driver.quit();
        }




    }

