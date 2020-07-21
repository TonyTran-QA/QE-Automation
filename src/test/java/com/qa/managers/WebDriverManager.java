package com.qa.managers;

import com.qa.enums.DriverType;
import com.qa.enums.EnvirenmentType;
import com.servicecorp.core.common.Constants;
import com.servicecorp.core.utils.ReadProperties;
import gherkin.lexer.Fi;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private WebDriver driver;
    private static DriverType driverType;
    private static EnvirenmentType environmentType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
    private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";
    private static final String SAFARI_DRIVER_PROPERTY = "webdriver.safari.driver";
    public WebDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigReader().getEnvirenmentType();
    }

    public WebDriver getDriver() {
        if (driver == null) driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        switch (environmentType) {
            case LOCAL:
                driver = createLocalDriver();
                break;
            case REMOTE:
                driver = createRemoteDriver();
                break;
        }
        return driver;
    }

    private WebDriver createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    private WebDriver createLocalDriver() {
        switch (driverType) {
            case FIREFOX:
                driver = setupFirefoxBrowser();
                break;
            case CHROME:
                driver = setupChromeBrowser();
                break;
            case EDGE:
                driver = setupEDGEBrowser();
                break;
            case SAFARI:
                driver = setupSARAFIBrowser();
                break;
            default:
                throw new RuntimeException("Unexpected value: " + driverType);
        }

        if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()){
            driver.manage().window().maximize();
        }else{

            String size = ReadProperties.getConfig("browser-size").trim();
            int height = Integer.parseInt(size.split(":")[0]);
            int width = Integer.parseInt(size.split(":")[1]);
            Dimension d = new Dimension(width, height);
            driver.manage().window().setSize(d);
        }
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }

    public void closeDriver() {
        driver.quit();
    }

    public WebDriver setupEDGEBrowser() {
        System.setProperty(EDGE_DRIVER_PROPERTY, Constants.ROOT_PATH_EXECUTE + "msedgedriver.exe");
        return driver = new EdgeDriver();
    }

    public WebDriver setupFirefoxBrowser() {
        System.setProperty(FIREFOX_DRIVER_PROPERTY, Constants.ROOT_PATH_EXECUTE + "geckodriver1.exe");
        return driver = new FirefoxDriver();
    }

    public WebDriver setupChromeBrowser() {

        System.setProperty(CHROME_DRIVER_PROPERTY, Constants.ROOT_PATH_EXECUTE + "chromedriver1.exe");
        return driver = new ChromeDriver();
    }
    public WebDriver setupSARAFIBrowser() {

        System.setProperty(SAFARI_DRIVER_PROPERTY, Constants.ROOT_PATH_EXECUTE);
        return driver = new SafariDriver();
    }

}
