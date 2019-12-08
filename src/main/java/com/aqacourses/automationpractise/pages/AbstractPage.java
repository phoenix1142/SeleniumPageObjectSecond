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

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement clickDresses;

    @FindBy (xpath = "//*[@title='Summer Dresses']")
    private WebElement selectSummerDresses;


    /**
     * Constructor
     */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this); // Initialize WebElements
        //wait.until(ExpectedConditions.visibilityOf(pageDiv));
    }

    /**
     * Click on SignIn and get Login Page
     *
     * @return
     */
    public SignInPage clickSignInLink() {
        testClass.waitTillElementIsVisible(signIn);
        signIn.click();
        return new SignInPage(testClass);
    }
/*
select menu dresses
 */
    public DressesPage clickToDressesMenu() {
        clickDresses.click();
        return new DressesPage(testClass);
    }
/*
select in Dress menu Summer Dresses
 */
    public SummerDresses selectInDressesMenuSummer(){
        selectSummerDresses.click();
        return new SummerDresses(testClass);
    }
}
