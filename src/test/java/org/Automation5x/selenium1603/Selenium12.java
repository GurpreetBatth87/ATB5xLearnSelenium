package org.Automation5x.selenium1603;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    // LinkText & Partial Text Text
    // Css Selctors
    // Xpath
    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testVWOLogin12() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

       // WebElement anchor_tag = driver.findElement(By.linkText("Start a free trial"));
        WebElement anchor_tag = driver.findElement(By.partialLinkText("Start a f"));
        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();

        driver.close();

    }
}