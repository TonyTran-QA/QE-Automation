package com.qa.newpages;


import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import com.qa.managers.Wait;
import com.qa.screenshot.Utility;
import com.qa.videoreport.VideoRecorder_utlity;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.util.List;



public class LoginPages extends BasePage {
    WebDriver driver;


    public LoginPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.ID, using = "Username")
    private WebElement userName;
    @FindBy(how = How.ID, using = "Password")
    private WebElement passWord;
    @FindBy(how = How.ID, using = "SecurityCode")
    private WebElement capchaCode;
    @FindBy(how = How.XPATH, using = "//input[@class ='btn-012']")
    private WebElement btnSubmit;
    @FindBy(how = How.XPATH, using = "(//div[@class='modal-header']//button[@class='close'])[1]")
    private WebElement btnclose;
    @FindBy(how = How.ID, using = "MyAccount")
    private WebElement myAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"language\"]/li[3]/a/img")
    private WebElement languageEN;
    @FindBy(how = How.XPATH, using = "(//a[@title='Live dealer'])[1]")
    private WebElement gameLiveDealer;
    @FindAll(@FindBy(how = How.XPATH, using = "(//ul[@class='dropdown-menu game-list game-12'])[1]//li//img"))
    private List<WebElement> list_lobby;




    @Before
    public void OpenHomePage() throws Exception {
        VideoRecorder_utlity.startRecord("LoginPage");
        String homePage = "http://www.vega19.com/";
        driver.navigate().to(homePage);
        Thread.sleep(2000);
    }

    public void LoginPage(String userID, String passwd) throws InterruptedException {
        userName.sendKeys(userID);
        Thread.sleep(2000);
        passWord.sendKeys(passwd);
        Thread.sleep(2000);
        capchaCode.sendKeys("赌场大堂");
        Thread.sleep(2000);
    }

    public void signIn() throws Exception {
        btnSubmit.click();
        Thread.sleep(2000);

        String actualUrl = "http://www.vega19.com/";
        String expectedUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            for (String popup : driver.getWindowHandles()) {
                driver.switchTo().window(popup);
                btnclose.click();
                Thread.sleep(2000);
            }
            System.out.println("Login passed");
        } else {
            System.out.println("Login failed");
            String messageerrorAcc =String.valueOf (driver.findElement(By.xpath("(//div[@class='modal-body'])[8]")).getText().trim());
            System.out.println("MessageError is ["+messageerrorAcc+"]");
            Utility.captureScreenshot("Erros", driver);
            VideoRecorder_utlity.stopRecord();
            driver.quit();
        }

    }

    public void ClosePage() throws Exception {
        VideoRecorder_utlity.stopRecord();
        Thread.sleep(2000);
        driver.quit();
    }

    public void MyAccount() throws InterruptedException {
        myAccount.click();
        Thread.sleep(2000);
    }

    public void ChooseLanguage() throws InterruptedException {
        languageEN.click();
        Thread.sleep(2000);
    }

    public void SexHall() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement game = driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/a"));
        actions.moveToElement(game).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/ul/li[6]/ul/li[1]/a/img"))).click().build().perform();
        Thread.sleep(2000);
    }

    public void HGHall() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement game = driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/a"));
        actions.moveToElement(game).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/ul/li[1]/ul/li[1]/a/img"))).click().build().perform();
        Thread.sleep(2000);
    }

}

