package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    DriverManager driverManager = new DriverManager();

    // Method calling from drivermanager class for open website
    @BeforeMethod
    public void setUp()
    {
        driverManager.openBrowser();
    }

    // Method calling from drivermanager class for close website
    @AfterMethod
    public void tearDown()
    {
        driverManager.closeBrowser();
    }

}
