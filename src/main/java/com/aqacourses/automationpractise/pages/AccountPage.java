package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {
    @FindBy(xpath = "//*[@class='page-heading' ]")
    private WebElement checkAccountPage;

    @FindBy(xpath = "//*[@class='account']")
    private WebElement checkFIO;

    @FindBy(xpath = "//*[@class='logout']")
    private WebElement signOutButton;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AccountPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(checkAccountPage);
    }

    /*
    Check correct account FIO
     */
    public AccountPage checkFioOnAccountPage() {
        Assert.assertEquals("Values Are Different", "Vanya Loboda", checkFIO.getAttribute("textContent"));
        return this;
    }

    /*
    click to button SignOut
     */
    public void clickToSignOut() {
        signOutButton.click();
    }


}
