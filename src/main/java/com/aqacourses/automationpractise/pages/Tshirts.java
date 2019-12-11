package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tshirts extends AbstractPage {
    @FindBy (xpath = "//*[@class='page-heading product-listing']")
    private WebElement checkTshirtsPage;

    @FindBy (xpath = "//*[@itemprop='image']")
    private WebElement choseTshirtsProduct;

    /**
     * constructor
     *
     * @param testClass
     */
    public Tshirts(BaseTest testClass) {
        super(testClass);
    }

    public TshirtsProduct choseTshirtsProduct(){
        choseTshirtsProduct.click();
        return new TshirtsProduct(testClass);
    }
}
