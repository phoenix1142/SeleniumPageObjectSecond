package com.aqacourses.automationpractise.tests;

import com.aqacourses.automationpractise.base.BaseTest;
import com.aqacourses.automationpractise.pages.AccountPage;
import com.aqacourses.automationpractise.pages.HomePage;
import com.aqacourses.automationpractise.pages.SignInPage;
import org.junit.Test;

public class CompareProducts extends BaseTest {
    @Test
    public void testCompareProducts(){
        HomePage homePage = openSite();
        SignInPage signInPage = homePage.clickSignInLink();
        AccountPage accountPage = signInPage.register("vanyaloboda.89@gmail.com","12345");

        closeSite();
    }
}
