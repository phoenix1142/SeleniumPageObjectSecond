package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDresses extends AbstractPage {
    @FindBy(xpath = "//*[@class='heading-counter']")
    private WebElement initCountOfDresses;

    @FindBy (xpath = "//*[@id='pagination']/following-sibling::div")
    private WebElement allProductsOnTheSummerDressesPage;

    /**
     * Constructor
     * @param testClass
     */
    public SummerDresses(BaseTest testClass){super(testClass);}


    /*
    compare count of products on page Summer Dresses
     */
    public SummerDresses compareCountOfDressesOnThePage(){
        String messageCount = initCountOfDresses.getAttribute("textContent");
        String str = messageCount.replace("There are ","");
        String str1 = str.replace(" products.","");
        int count = Integer.parseInt(str1);

        String allProducts = allProductsOnTheSummerDressesPage.getAttribute("textContain");
        System.out.println(allProducts);  // почему тут значение null ?
        String str2 = allProducts.replace("Showing 1 - 3 of ","");
        String str3 = str2.replace(" items","");
        int countOfAllProducts = Integer.parseInt(str3);
        System.out.println(countOfAllProducts);
        return this;




    }

}
