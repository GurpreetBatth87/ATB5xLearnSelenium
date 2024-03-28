package org.Automation5x.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium09 {
    public static void main(String[] args) throws MalformedURLException {


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/watch?v=EzGH3hZuJVk"); // no back,forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://app.google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
