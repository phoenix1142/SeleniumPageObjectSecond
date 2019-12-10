package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='categories_block_left']//*[@class='last']/a")
    private WebElement selectSummerDresses;

    /**
     * constructor
     *
     * @param testClass
     */
    public DressesPage(BaseTest testClass) {
        super(testClass);
    }
/*
move and click ti summer dresses categories
 */
    public SummerDresses selectCategoriesSummerDresses() {
        selectSummerDresses.click();
        return new SummerDresses(testClass);
    }
}
