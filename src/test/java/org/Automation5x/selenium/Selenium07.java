package org.Automation5x.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium07 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        //WebDriver driver = new ChromeDriver(edgeOptions);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=EzGH3hZuJVk");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
