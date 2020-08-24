package com.qa.newpages;


import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import com.qa.managers.Wait;
import com.qa.screenshot.Utility;
import com.qa.videoreport.VideoRecorder_utlity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(how = How.ID, using = "lnkAccountBank")
    private WebElement bankAccount;
    @FindBy(how = How.ID, using = "addNewBank")
    private WebElement btnAddBanks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"language\"]/li[3]/a/img")
    private WebElement languageEN;
    @FindBy(how = How.XPATH, using = "(//a[@title='Live dealer'])[1]")
    private WebElement gameLiveDealer;
    @FindAll(@FindBy(how = How.XPATH, using = "(//ul[@class='dropdown-menu game-list game-12'])[1]//li//img"))
    private List<WebElement> list_lobby;
    @FindBy(how = How.XPATH, using = "//*[@id=\"dv_ct1\"]/li[4]/div/a")
    private WebElement Funds;
    @FindBy(how = How.XPATH, using = "//*[@id=\"dv_ct1\"]/li[4]/div/div/a[2]")
    private WebElement FundsN;
    @FindBy(how = How.XPATH, using = "//li[@class='select-funds']//div//select[@class='from-select']")
    private WebElement fromSelect;
    @FindBy(how = How.XPATH, using = "//li[@class='select-funds']//div//select[@class='to-select']")
    private WebElement toSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab1\"]/div[3]/ul/li[6]/input")
    private WebElement toAmount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab1\"]/div[3]/ul/li[8]/input")
    private WebElement btnFund;
    @FindBy(how = How.XPATH, using = "//*[@id=\"bank_custom_select\"]/div/button/span[1]")
    private WebElement nameBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"bank_custom_select\"]/div/div/div/input")
    private WebElement txtnameBank;
    @FindAll(@FindBy(how = How.XPATH, using = "//*[@class='dropdown-menu inner selectpicker']//li//a"))
    private List<WebElement> listNameBanks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab1\"]/div[3]/ul/li[9]/input")
    private WebElement btnFundAndPlay;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab1\"]/div[3]/ul/li[10]/input")
    private WebElement btnPlayGame;


    // URL PAGE
    String homePageVega19 = "http://www.vega19.com/";


    public void OpenHomePage() throws Exception {
        VideoRecorder_utlity.startRecord("Canvas");
        driver.navigate().to(homePageVega19);
        Thread.sleep(2000);
//        try {
//            WebElement baotri = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
//            String regularMaintenanceA = baotri.getText().trim();
//            String regularMaintenanceE = (driver.findElement(By.xpath("/html/body/div/div/div/div[1]"))).getText().trim();
//            if (baotri.isDisplayed() && regularMaintenanceA.contains(regularMaintenanceE)){
//                System.out.println("Message is [" + regularMaintenanceE + "]");
//                String messageMaintenance = (driver.findElement(By.xpath("//*[@id=\"langVN\"]/div[1]/p[1]"))).getText().trim();
//                System.out.println("Information Maintenance is [" + messageMaintenance + "]");
//                Utility.captureScreenshot("BaoTri",driver);
//                driver.quit();
//            }else System.out.println("Process Next Steps");
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
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

        String expectedUrl = driver.getCurrentUrl();

        if (homePageVega19.equalsIgnoreCase(expectedUrl)) {
            for (String popup : driver.getWindowHandles()) {
                driver.switchTo().window(popup);
                btnclose.click();
                Thread.sleep(2000);
            }
            System.out.println("Login passed");
        } else {
            System.out.println("Login failed");
            String messageerrorAcc = (driver.findElement(By.xpath("(//div[@class='modal-body'])[8]")).getText().trim());
            System.out.println("MessageError is [" + messageerrorAcc + "]");
            Utility.captureScreenshot("LoginFailed", driver);
            VideoRecorder_utlity.stopRecord();
            driver.quit();
        }

    }

    public void ClosePage() throws Exception {
//        VideoRecorder_utlity.stopRecord();
        Thread.sleep(2000);
        driver.quit();
    }

    public void MyAccount() throws InterruptedException {
        myAccount.click();
        Thread.sleep(2000);
        bankAccount.click();
        Thread.sleep(2000);
    }


    public void addBanks(String namebank) throws InterruptedException {
        btnAddBanks.click();
        Thread.sleep(2000);
        for (String popup : driver.getWindowHandles()) {
            driver.switchTo().window(popup);
            Thread.sleep(2000);
            nameBank.click();
            Thread.sleep(2000);
            txtnameBank.clear();
            txtnameBank.sendKeys(namebank);
            Thread.sleep(2000);
            select_itemOf(listNameBanks, namebank);
            Thread.sleep(2000);
        }
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

    public void AGHall() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement game = driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/a"));
        actions.moveToElement(game).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/ul/li[10]/ul/li[1]/a/img"))).click().build().perform();
        Thread.sleep(2000);
        btnPlayGame();
        Wait.untilPageLoadComplete(driver);
    }

    public void GrandHall() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement game = driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/a"));
        actions.moveToElement(game).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/ul/li[9]/ul/li[1]/a/img"))).click().build().perform();
        Thread.sleep(2000);

    }

    public void PlayGandHall() throws InterruptedException {
        for (String popup : driver.getWindowHandles()) {
            driver.switchTo().window(popup);
            Thread.sleep(2000);
        }
        WebElement element = driver.findElement(By.xpath("//*[@id=\"canvas\"]"));
        Actions actions = new Actions(driver);
        Action action = actions.contextClick(element).moveToElement(element, 8, 8).clickAndHold(element).moveByOffset(120, 120).moveByOffset(60, 70).moveByOffset(-140, -140).release(element).build();
        action.perform();
    }

    public void SelectFunds() throws InterruptedException {
        Funds.click();
        Thread.sleep(2000);
        FundsN.click();
        Thread.sleep(2000);
    }

    public void select_From(String keySearch) throws InterruptedException {
        Select selectFrom = new Select(fromSelect);
        selectFrom.selectByVisibleText(keySearch);
        Thread.sleep(2000);
    }

    public void select_To(String keySearch1) throws InterruptedException {
        Select selectTo = new Select(toSelect);
        selectTo.selectByVisibleText(keySearch1);
        Thread.sleep(2000);
    }

    public void AmountTransfer(String amount) throws InterruptedException {
        toAmount.sendKeys(amount);
        System.out.println("Amount: " + amount + "");
        Thread.sleep(2000);
        btnFund.click();
        Wait.untilPageLoadComplete(driver);
        Thread.sleep(5000);
        try {
            String messageTransfer = (driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/span"))).getText().trim();
            System.out.println("MessagePass: " + messageTransfer + "");
        } catch (Exception e) {
            String messageTransfer1 = (driver.findElement(By.xpath("//div[@id='tab1']//div[@class='notification']"))).getText().trim();
            Utility.captureScreenshot("TransferFailed", driver);
            System.out.println("MessageFailed: " + messageTransfer1 + "");

        }
    }

    private void btnFund() throws InterruptedException {
        btnFund.click();
        Thread.sleep(5000);
    }

    private void btnFundAndPlay() throws InterruptedException {
        btnFundAndPlay.click();
        Thread.sleep(5000);
    }

    private void btnPlayGame() throws InterruptedException {
        btnPlayGame.click();
        Thread.sleep(5000);
    }


}

