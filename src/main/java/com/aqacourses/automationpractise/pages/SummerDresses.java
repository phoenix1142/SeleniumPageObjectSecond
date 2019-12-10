package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDresses extends AbstractPage {
    @FindBy(xpath = "//*[@class='heading-counter']")
    private WebElement initCountOfDresses;

    @FindBy(xpath = "//*[@id='pagination']/following-sibling::div")
    private WebElement allProductsOnTheSummerDressesPage;

    /**
     * Constructor
     *
     * @param testClass
     */
    public SummerDresses(BaseTest testClass) {
        super(testClass);
    }


    /*
    compare count of products on page Summer Dresses
     */
    public void compareCountOfDressesOnThePage() {
        String messageCount = initCountOfDresses.getAttribute("textContent");
        String str = messageCount.replace("There are ", "");
        String str1 = str.replace(" products.", "");
        int count = Integer.parseInt(str1);
        String allProducts = allProductsOnTheSummerDressesPage.getAttribute("textContent").trim();
        String str2 = allProducts.replace("Showing 1 - 3 of ", "");
        String str3 = str2.replace(" items", "");
        int countOfAllProducts = Integer.parseInt(str3);
        Assert.assertEquals("The number of position is not equal!", count, countOfAllProducts);
    }

}
