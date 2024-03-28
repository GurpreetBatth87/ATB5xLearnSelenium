package org.Automation5x.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium05 {
    @Test
    public void testmethod03(){
        //Extension to the edge browser
        //youtube video - ad blocker extension
        //selenium

        EdgeOptions edgeOptions = new EdgeOptions();
        /*
         * 1. headless
         * 2. start max
         * 3. window
         * 4. add exnetions
         * 5. 100 of another options - you can use with it
         *
         * */
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addExtensions(new File("C:/Users/gurpr/Downloads/AdBloc.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=EzGH3hZuJVk");
    }
}
