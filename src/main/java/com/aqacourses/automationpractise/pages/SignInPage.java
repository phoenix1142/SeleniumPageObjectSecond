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
    public WebElement checkLoginPage;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='passwd']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement buttonSignIn;

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
    click and enter some information to input field email
     */
    public SignInPage emailInput(String email) {
        this.email.sendKeys(email);
        return this;
    }

    /*
    click and enter some information to input field password
     */
    public SignInPage passwordInput(String password) {
        this.password.sendKeys(password);
        return this;
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
    public AccountPage register(String email, String password) {
        emailInput(email);
        passwordInput(password);
        clickSignInButton();
        return new AccountPage(testClass);
    }
    /*
    checkSignInPage method
     */
    public SignInPage checkSignInPage() {
        testClass.waitTillElementIsVisible(checkLoginPage);
        return this;
    }
}
