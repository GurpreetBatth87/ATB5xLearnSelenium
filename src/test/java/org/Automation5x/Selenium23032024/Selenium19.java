package org.Automation5x.Selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium18 {
    WebDriver driver;
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    @BeforeTest
    public void openZBrowser(){
        //Create sesion via API and session
        driver = new EdgeDriver();
    }





    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testPostive() throws InterruptedException {

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        // CSS Selectors - tagName id -> #, class -> . , custom [@attribute=value]
        // CSS selectors are used to select elements in an HTML or XML document. (tag based lang.)
        // tag -> <pramod> value</pramod>
        // ID, className, name, customAttribute

        // LinkText, Partial Lik - Anchor Tag finder by Selenium


        // Xpath -> //input[@id='login-username'] -> input#login-username
        // //input[@data-qa='hocewoqisi'] -> input[data-qa='hocewoqisi']
        //  input[data-qa$='si'] -> $ ends with, ^ starts with * contains


    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}