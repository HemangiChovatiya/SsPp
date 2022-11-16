package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils
{
    public void openBrowser()
    {
        // To do Auto-generated method sub
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // For keep fullscreen
        driver.manage().window().maximize();
        // Enter URL
        driver.get("https://demo.nopcommerce.com/");
    }
    // Method for close website
    public void closeBrowser()
    {
        driver.quit();
    }
}
