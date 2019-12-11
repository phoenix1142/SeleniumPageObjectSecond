package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTshirtsProduct extends AbstractPage {
    @FindBy(xpath = "//*[@class='icon-ok']")
    private WebElement checkAddProduct;

    public AddTshirtsProduct(BaseTest testClass){
        super(testClass);
        testClass.waitTillElementIsVisible(checkAddProduct);
    }
}
