package org.Automation5x.Selenium1703;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testVWOLogin14() {
        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com");

        //Question print all the anchor tags on this VWO .com
        //a tags and print the gettest
}
}
