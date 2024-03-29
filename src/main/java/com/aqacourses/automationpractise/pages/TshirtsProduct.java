package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsProduct extends Tshirts {
    @FindBy (xpath = "//*[@itemprop='name']")
    private WebElement checkTshirtsProductPage;

    @FindBy (xpath = "//*[@id=\"add_to_cart\"]/button/span")
    private WebElement clickToAdd;

    @FindBy (xpath = "//*[@class='icon-ok']")
    private WebElement checkAddProduct;

    public TshirtsProduct(BaseTest testClass){
        super(testClass);
        testClass.waitTillElementIsVisible(checkTshirtsProductPage);
    }
/*
add to cart
 */
    public AddTshirtsProduct addProductToCart (){
        clickToAdd.click();
        return new AddTshirtsProduct(testClass);
    }
}
