package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage = new HomePage();
    @Test
    public void toVerifyUserShouldAbleToRegisterSuccessfully()
    {
        homePage.toVerifyRegisterButtonPresent();
        // Click on 'Register' on home page
        homePage.toVerifyRegisterClickableOnHomePage();
    }
}
