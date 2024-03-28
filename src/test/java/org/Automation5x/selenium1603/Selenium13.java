package org.Automation5x.selenium1603;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium13 {
    // LinkText & Partial Text Text
    // Css Selctors
    // Xpath
    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testVWOLogin13() {
        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com");

        //Question print all the anchor tags on this VWO .com
        //a tags and print the gettest

        List <WebElement> all_tags = driver.findElements(By.tagName("a"));
        //all_tags.get(8).click();  //clisk on the first element
       // all_tags.get(1).click(); // click on the second element
        all_tags.size();

        for (WebElement elementsal :all_tags){
            System.out.println(elementsal.getText());
        }





    }
}