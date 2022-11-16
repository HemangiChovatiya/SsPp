package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{
    public void toVerifyRegisterButtonPresent()
    {
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","Register should be present");
    }

    // Click on Register on homepage
    public void toVerifyRegisterClickableOnHomePage()
    {
        clickOnElement(By.className("ico-register"));

    }
}
