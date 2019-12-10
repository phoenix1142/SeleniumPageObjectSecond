package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsProduct extends Tshirts {
    @FindBy (xpath = "//*[@itemprop='name']")
    private WebElement checkTshirtsProductPage;

    public TshirtsProduct(BaseTest testClass){
        super(testClass);
        testClass.waitTillElementIsVisible(checkTshirtsProductPage);
    }
}
