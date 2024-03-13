package org.Automation5x.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium08 {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/watch?v=EzGH3hZuJVk");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

              driver.close(); // Close the Current Browser Window - not the full browser
//        // Closed the window, Session id != null, Error - Invalid session Id
//

//        driver.quit();
//        // Close all the /sessions/windows and stop the browser
////        driver.quit(); // Closed All the window and Session = null, Error - Session ID is null



    }
}
