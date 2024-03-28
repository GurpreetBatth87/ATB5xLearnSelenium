package org.Automation5x.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {
    @Test
    public void testmethod03(){
        //Extension to the edge browser
        //youtube video - ad blocker extension
        //selenium

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--headless");
        edgeOptions.addExtensions(new File("C:/Users/gurpr/Downloads/AdBloc.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=EzGH3hZuJVk");
    }
}
