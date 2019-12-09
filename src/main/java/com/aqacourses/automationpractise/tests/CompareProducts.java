package com.aqacourses.automationpractise.tests;

import com.aqacourses.automationpractise.base.BaseTest;
import com.aqacourses.automationpractise.pages.*;
import org.junit.Test;

public class CompareProducts extends BaseTest {
    @Test
    public void testCompareProducts() {
        HomePage homePage = openSite();
        SignInPage signInPage = homePage.clickSignInLink();
        AccountPage accountPage = signInPage.login("vanyaloboda.89@gmail.com", "12345");
        DressesPage dressesPage = accountPage.clickToDressesMenu();
        SummerDresses summerDresses = dressesPage.selectCategoriesSummerDresses();
        summerDresses.compareCountOfDressesOnThePage();
        closeSite();
    }
}
