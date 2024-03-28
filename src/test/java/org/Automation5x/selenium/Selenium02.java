package org.Automation5x.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void testMethod(){
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        WebDriver driver2 = new EdgeDriver();


        // Opera - Selenium 4- Removed!


//        SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
//        SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S


        // Selenium - Arch - API
        // Create Session, Commands or Functions -> API Request to Browser Driver (
        // Pass the commands as API

        // SearchContext driver = new ChromeDriver(); // Dynamic Dispatch - GF, F, can Ref to Child Object -- OOPs
        //WebDriver driver = new ChromeDriver();
        // RemoteWebDriver driver1 = new ChromeDriver();

        //EdgeDriver driver = new EdgeDriver();  // Case 1
    }
}
