package org.Automation5x.Selenium24032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium28 {
    WebDriver driver;
    // Atomic Test Cases
    // TC who don't have any dep.
    // They serve single purpose 0

    @BeforeTest
    public void openZBrowser(){
        //Create sesion via API and session

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }





    @Test(groups = "QA")
    @Description("Verify the current URL , title of the VWO App")
    public void testPostive() throws InterruptedException {

        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        ////table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td

        //
        // table[@id="customers"]/tbody/tr[5]/td[2] - Halen bennet
        // /following-sibling::td - Country


        // Print all the data in the table and if name Halen = country she belongs too


        // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]

        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]
        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td")).size();

        for (int i = 2 ; i <=row;i++){
            for (int j = 1 ;j<=column;j++){
                String dynamic=first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic)).getText();
                System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String country_path = dynamic+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("_______-------___---->>>>");
                    System.out.println( "Helen Bennett is belong to ----" + country_text);
                }

            }
        }





        Thread.sleep(1500);



    }





    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
