package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    //Global tests data excel file
    public static final String testDataExcelFileName = "src/test/excel/TestCase.xlsx";


    public WebDriver getDriver() {
        return driver;
    }


    @BeforeClass(description = "Class Level Setup!")
    public void setup() {
        String browser = System.getProperty("BROWSER");
        if (browser == null) {
            browser = System.getenv("BROWSER");
            if (browser == null) {
                browser = "firefox";
            }
        }

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }

        System.out.println("Opening Browser...." + browser);
        driver.manage().deleteAllCookies();
    }


    @AfterClass(description = "Class Level Teardown!")
    public void teardown() {
        driver.quit();
    }

}

