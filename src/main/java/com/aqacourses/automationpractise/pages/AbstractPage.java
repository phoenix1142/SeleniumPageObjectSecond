package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected BaseTest testClass;

    /*
    Web elements with @FindBy annotation
     */
    @FindBy(xpath = "//*[@class='login']")
    private WebElement signIn;

    @FindBy(xpath = "//*[@id='homeslider']")
    WebElement pageDiv;


    /** Constructor */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(),this); // Initialize WebElements
        //wait.until(ExpectedConditions.visibilityOf(pageDiv));
    }

    /**
     * Click on SignIn and get Login Page
     * @return
     */
    public SignInPage clickSignInLink() {
        testClass.waitTillElementIsVisible(signIn);
        signIn.click();
        return new SignInPage(testClass);
    }
}
