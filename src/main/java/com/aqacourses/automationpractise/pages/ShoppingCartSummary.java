package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummary extends AbstractPage {
    @FindBy (xpath = "//*[@id='cart_title']")
    private WebElement checkShoppingCartSummury;

    @FindBy (xpath = "//*[@title='Add']")
    private WebElement clickAndPlusOneProduct;

    @FindBy (xpath = "//*[@class='cart_total']/span")
    private WebElement checkSum;

    @FindBy (xpath = "//*[@id='summary_products_quantity']")
    private WebElement checkMessageAfterPlusOneProducts;

    /**
     * constructor
     * @param testClass
     */
    public ShoppingCartSummary(BaseTest testClass){
        super(testClass);
        testClass.waitTillElementIsVisible(checkShoppingCartSummury);
    }

    public void clickAndPlusOneProduct() {
        String beforeAdd = checkSum.getAttribute("textContent").replace("$","");
        double dbeforeAdd = Double.parseDouble(beforeAdd);
        clickAndPlusOneProduct.click();

        String afterAdd = checkSum.getAttribute("textContent").replace("$","");
        double dafterAdd = Double.parseDouble(afterAdd);
        if (dbeforeAdd+dbeforeAdd==dafterAdd){
            System.out.println("Add plus one product done");
        }
        else{
            System.err.println("Wrong Price");
        }

    }
}
