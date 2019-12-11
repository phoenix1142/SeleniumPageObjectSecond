package com.aqacourses.automationpractise.tests;

import com.aqacourses.automationpractise.base.BaseTest;
import com.aqacourses.automationpractise.pages.*;
import org.junit.Test;

public class CompareProducts extends BaseTest {
//    @Test
//    public void testCompareProducts() {
//        HomePage homePage = openSite();
//        SignInPage signInPage = homePage.clickSignInLink();
//        AccountPage accountPage = signInPage.login("vanyaloboda.89@gmail.com", "12345");
//        DressesPage dressesPage = accountPage.clickToDressesMenu();
//        SummerDresses summerDresses = dressesPage.selectCategoriesSummerDresses();
//        summerDresses.compareCountOfDressesOnThePage();
//        closeSite();
//    }

    @Test
    public void checkCountOfOrders() throws InterruptedException {
        HomePage homePage = openSite();
        log("Open our site");
        SignInPage signInPage = homePage.clickSignInLink();
        log("Click to SignIn");
        AccountPage accountPage = signInPage.login("vanyaloboda.89@gmail.com", "12345");
        log("Login");
        Tshirts tshirts = homePage.clickToTshirtsCategory();
        log("Chose T-shirts category");
        TshirtsProduct tshirtsProduct = tshirts.choseTshirtsProduct();
        log("Go to T-shirts product page");
        AddTshirtsProduct addTshirtsProduct = tshirtsProduct.addProductToCart();
        log("Add product");
        ShoppingCartSummary shoppingCartSummary = addTshirtsProduct.clickToProceedToCheckOut();
        log("Go to ShoppingCartSummary");
        shoppingCartSummary.clickAndPlusOneProduct();
        log("Add product and check price");

        closeSite();

    }
}
