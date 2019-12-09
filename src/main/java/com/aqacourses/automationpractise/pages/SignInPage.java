package com.aqacourses.automationpractise.pages;

import com.aqacourses.automationpractise.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends AbstractPage {
    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement checkLoginPage;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@name='passwd']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    private WebElement buttonSignIn;

    /**
     * constructor
     *
     * @param testClass
     */
    public SignInPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(checkLoginPage);
    }

    /*
    click on SignIn button
     */
    public AccountPage clickSignInButton() {
        this.buttonSignIn.click();
        return new AccountPage(testClass);
    }

    /**
     * authorization method on SignInPage
     *
     * @param email
     * @param password
     * @return
     */
    public AccountPage login(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        clickSignInButton();
        return new AccountPage(testClass);
    }

}
