package com.aqacourses.automationpractise.base;

import com.aqacourses.automationpractise.pages.HomePage;
import com.aqacourses.automationpractise.utils.YamlParser;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;


    // Logger
    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    // Rule
    @Rule public RunTestRules runTestRules = new RunTestRules(this);


    /**
     * constructor with common settings
     */
    public BaseTest(){
        // If you want to disable infobars please use this code
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption(
                "excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        // Initialize path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Initialize instance of ChromeDriver and add options
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);
    }
    /**
     * Open site and get instance of HomePage
     *
     * @return
     */
    public HomePage openSite() {
        try {
            driver.get(YamlParser.getYamlData().getUrl());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HomePage(this);
    }

    /** Close site and make driver quit */
    public void closeSite() {
        driver.quit();
    }

    /**
     * Get instance of driver
     *
     * @return driver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Wait till element is visible
     *
     * @param element
     */
    public void waitTillElementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Write down info message
     *
     * @param message
     */
    public void log(String message) {
        logger.info(message);
    }

    /**
     * Write down error message
     *
     * @param error
     */
    public void error(String error) {
        logger.error(error);
    }

    /**
     * Get date and time
     *
     * @return
     */
    public String getDateTime() {
        return new SimpleDateFormat("YYYY-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
    }
}
