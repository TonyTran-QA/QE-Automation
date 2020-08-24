package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import com.qa.managers.Wait;
import com.qa.screenshot.Utility;
import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

public class JoinNowPages extends BasePage {
    WebDriver driver;
    private String today;

    public JoinNowPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.XPATH, using = "//span[@class='show_lang_hea_l']//img")
    private WebElement btnLanguage;
    @FindBy(how = How.XPATH, using = "(//ul[@class='sub_lang_hea_l']//li)[2]")
    private WebElement btnEN;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div/ul/li[2]/a")
    private WebElement btnJoinNow;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/form/ul/li[1]/input")
    private WebElement txtUserName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/form/ul/li[2]/input")
    private WebElement txtPassWord;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/form/ul/li[3]/input")
    private WebElement txtPassWordConfirm;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/form/button")
    private WebElement btnSubmit;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/ul/li[1]/input")
    private WebElement txtFullName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/input")
    private WebElement txtReferralCode;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/ul/li[2]/input")
    private WebElement txtEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/ul/li[3]/input")
    private WebElement txtPhoneNumber;
    @FindAll(@FindBy(how = How.XPATH, using = "//div[@class='num_key']//a"))
    private List<WebElement> opt;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/ul/li[4]/div/input[1]")
    private WebElement opt1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/ul/li[5]/label/input")
    private WebElement checkBoxConfirm;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/form/button")
    private WebElement btnSubmit2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/button[2]")
    private WebElement btnBackHome;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[1]/a[1]/i")
    private WebElement menuAccount;
    @FindBy(how = How.XPATH, using = "//div[@class='avt_menu_rwd']//strong")
    private WebElement userAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_rwd\"]/a/i")
    private WebElement btnClose;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div/ul/li[1]/a")
    private WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    private WebElement btnRecaptcha;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_rwd\"]/div[1]/div/a/figure/img")
    private WebElement imgAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[6]/a")
    private WebElement myProFile;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/shared-go-back/section/a/i")
    private WebElement btnBack;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[7]/a")
    private WebElement mybankAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[1]/a[2]/i")
    private WebElement btnAddBank;
    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='bankName']")
    private WebElement bankName;
    @FindAll(@FindBy(how = How.XPATH, using = "//select[@formcontrolname='bankName']//option"))
    private List<WebElement> listNameBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/ul/li[2]/input")
    private WebElement bankAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/ul/li[3]/input")
    private WebElement bankNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/ul/li[4]/input")
    private WebElement bankBranch;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/ul/li[5]/input")
    private WebElement bankCity;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/button")
    private WebElement submitAddBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[1]/div/a[2]/i")
    private WebElement btnAddMoney;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[1]/div/a[1]/i")
    private WebElement btnWithdrawMoney;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[2]/ul[2]/li[1]/input")
    private WebElement txtAmountMoney;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[2]/ul[2]/li[2]/input")
    private WebElement btnChooseBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/app-bank/form/ul/li[1]/a")
    private WebElement btnChooseBankAcc;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/ul/li[1]/input")
    private WebElement txtSearchBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/ul/li[2]/a")
    private WebElement btnNameBank;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[1]/shared-bank-card/div/a")
    private WebElement btnChooseOther;


    @FindAll(@FindBy(how = How.XPATH, using = "//ul[@class='list_Payment_Method']//li"))
    private List<WebElement> listNameBanksRecharge;
    @FindBy(how = How.XPATH, using = "//select[@class='slec_c_win_2 sty_slec']")
    private WebElement btnTransferMethod;
    @FindAll(@FindBy(how = How.XPATH, using = "//select[@class='slec_c_win_2 sty_slec']//option"))
    private List<WebElement> listTransferMethod;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[2]/ul[2]/li[4]/input")
    private WebElement txtAccountName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[2]/ul[2]/li[5]/input")
    private WebElement txtAccountNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/deposit-bank/form/div[2]/ul[2]/li[6]/input")
    private WebElement txtBankref;
    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[1]")
    private WebElement btnDepositWithoutPromotion;
    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
    private WebElement btnSelectPromotion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/div/div/app-promotion-gallery/div/ul/li[3]/a")
    private WebElement imgPromotion777;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/div/div/button")
    private WebElement submitPromotion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/div[2]/ul/li[1]/input")
    private WebElement txtmoneyWithdraw;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/div[2]/ul/li[2]/input")
    private WebElement txtpassWithdraw;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div/button")
    private WebElement submitWithdraw;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/button[1]")
    private WebElement viewhistoryRecharge;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[1]/a")
    private WebElement btnWallet;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/ul/li[1]/div/a[1]")
    private WebElement btnPlayNow;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/ul/li[1]/div/a[2]")
    private WebElement btnFundIn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/ul/li[1]/div/a[3]")
    private WebElement btnFundOut;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/div[3]/input")
    private WebElement txtAmountFund;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/div[4]/button[1]")
    private WebElement btnTransferNow;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/div[4]/button[2]")
    private WebElement btnTransferPlay;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div/div[2]/form/div[4]/button")
    private WebElement btnFundOutSubmit;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[3]/a")
    private WebElement btnTransactionReport;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[4]/a")
    private WebElement btnTranferReport;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[2]/ul/li[2]/a")
    private WebElement btnHistoryDepositandWithdrawal;

    // Xpath Calendar
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[1]/div[1]/label[1]/input")
    private WebElement From;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section/div[1]/div[1]/label[2]/input")
    private WebElement To;
    @FindAll(@FindBy(how = How.XPATH, using = "//div[@class='bs-datepicker-body']//table//tbody//tr//td"))
    private List<WebElement> dayOfMonth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/bs-datepicker-inline/bs-datepicker-inline-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[4]")
    private WebElement nextMonth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/bs-datepicker-inline/bs-datepicker-inline-container/div/div/div/div/bs-month-calendar-view/bs-calendar-layout/div[2]/table")
    private WebElement month;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/bs-datepicker-inline/bs-datepicker-inline-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[4]/td[3]/span")
    private WebElement day17;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[2]/bs-datepicker-inline/bs-datepicker-inline-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[4]/td[6]/span")
    private WebElement day20;

    //                    String URLNewHomePage = "http://app-demo.uwin29.asia/";
    String URLNewHomePage = "http://192.168.0.11:1860/home"; //local

    public void
    OpenNewHomePage() throws Exception {
//        VideoRecorder_utlity.startRecord("LoginPage");
        driver.navigate().to(URLNewHomePage);
        Thread.sleep(2000);
//        try {
//            WebElement messeageErrorBaoTri = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
//            String regularMaintenance = messeageErrorBaoTri.getText().trim();
//            String messeageErrorBaoTri1 = (driver.findElement(By.xpath("/html/body/div/div/div/div[1]"))).getText().trim();
//            WebElement messeageErrorBaoTriInfor = driver.findElement(By.xpath("//*[@id=\"langVN\"]/div[1]/p[1]"));
//            String messageMaintenance = messeageErrorBaoTriInfor.getText().trim();
//            if (messeageErrorBaoTri.isDisplayed() && regularMaintenance.contains(messeageErrorBaoTri1)) {
//                System.out.println("Message is [" + regularMaintenance + "]");
//                System.out.println("Information Maintenance is [" + messageMaintenance + "]");
//                Utility.captureScreenshot("BaoTri", driver);
//                driver.quit();
//            } else System.out.println("Process Next Steps");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    public void SwitchLanguage() throws InterruptedException {
        btnLanguage.click();
        Thread.sleep(2000);
        btnEN.click();
        Thread.sleep(2000);
        String liveCasino = (driver.findElement(By.xpath("//*[@id=\"container\"]/section[2]/ul/li[1]/a/h2"))).getText().trim();
        System.out.println("Message EN is: " + liveCasino + "\n");
        String slots = (driver.findElement(By.xpath("//*[@id=\"container\"]/section[2]/ul/li[2]/a/h2"))).getText().trim();
        System.out.println("Message EN is: " + slots + "");
    }

    public void JoinNow() throws InterruptedException {
        btnJoinNow.click();
        Thread.sleep(2000);

    }

    public void SignIn(String username, String password, String confirmpass) throws InterruptedException {
        txtUserName.sendKeys(username);
        Thread.sleep(2000);
        txtPassWord.sendKeys(password);
        Thread.sleep(2000);
        txtPassWordConfirm.sendKeys(confirmpass);
        Thread.sleep(2000);

    }

    public void Submit() throws InterruptedException {
        btnSubmit.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("JoinNowError", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SubmitLogin() throws InterruptedException {
//        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//        String winHanaleBefore = driver.getWindowHandle();
//        driver.switchTo().frame(0);
//        btnRecaptcha.click();
//        driver.switchTo().window(winHanaleBefore);
//        Thread.sleep(10000);
        btnSubmit.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("LoginError", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ReferralCode(String code) throws InterruptedException {
        txtReferralCode.sendKeys(code);
        Thread.sleep(2000);
    }

    public void FillInfor(String fullname, String phone) throws InterruptedException {
        txtFullName.sendKeys(fullname);
        Thread.sleep(2000);
        txtEmail.sendKeys(fullname + "@yopmail.com");
        Thread.sleep(2000);
        txtPhoneNumber.sendKeys(phone);
        Thread.sleep(2000);
    }

    public void OTP() throws InterruptedException {
//        opt1.click();
//        for (int i = 0; i <= 3; i++) {
//            opt.get(i).click();
//        }
//        Thread.sleep(2000);
        checkBoxConfirm.click();
    }

    public void CreatAccount() throws InterruptedException {
        btnSubmit2.click();
        Thread.sleep(5000);
        btnBackHome.click();
        Thread.sleep(5000);
    }

    public void VerifymyAccount() {
        menuAccount.click();
        String actual = userAccount.getText();
        System.out.println(actual);
        btnClose.click();
    }

    public void VerifymyAccountLogin() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        Thread.sleep(2000);
        if (btnAddMoney.isDisplayed()) {
            btnAddMoney.click();
            Thread.sleep(2000);
        }
    }

    public void VerifymyAccountLogin1() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        Thread.sleep(2000);
    }

    public void btnLogin() throws InterruptedException {
        btnLogin.click();
        Thread.sleep(2000);
    }

    public void Login(String username, String password) throws InterruptedException {
        txtUserName.sendKeys(username);
        Thread.sleep(2000);
        txtPassWord.sendKeys(password);
        Thread.sleep(2000);
    }

    public void MyProFile() throws InterruptedException {
        myProFile.click();
        Thread.sleep(2000);
        btnBack.click();
    }

    public void BankAccount(String namebank) throws InterruptedException {
        mybankAccount.click();
        Thread.sleep(2000);
        btnAddBank.click();
        Thread.sleep(2000);
        btnChooseBankAcc.click();
        Thread.sleep(2000);
        txtSearchBank.clear();
        txtSearchBank.sendKeys(namebank);
        Thread.sleep(2000);
        btnNameBank.click();
        System.out.println(namebank);
        bankAccount.clear();
        bankAccount.sendKeys("VIB");
        Thread.sleep(2000);
        bankNumber.clear();
        bankNumber.sendKeys("123456789");
        Thread.sleep(2000);
        bankBranch.clear();
        bankBranch.sendKeys("700000");
        Thread.sleep(2000);
        bankCity.clear();
        bankCity.sendKeys("TPHCM");
        Thread.sleep(2000);
        submitAddBank.click();
        Thread.sleep(2000);

    }

    public void AddMoney(String amount) throws InterruptedException {
        txtAmountMoney.clear();
        Thread.sleep(2000);
        txtAmountMoney.sendKeys(amount);
        Thread.sleep(2000);
        System.out.println(amount);
    }

    private void BankOfAgent() {
        btnChooseOther.click();
        List<WebElement> allOther = driver.findElements(By.xpath("//ul[@class='list_Payment_Method']//li//a"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allOther.size());
        allOther.get(randomProduct).click();
    }

    public void ChooseBank(String choosebank) throws InterruptedException {
        BankOfAgent();
        Thread.sleep(2000);
        btnChooseBank.click();
        Thread.sleep(2000);
        txtSearchBank.clear();
        txtSearchBank.sendKeys(choosebank);
        Thread.sleep(2000);
        btnNameBank.click();
        System.out.println(choosebank);

    }

    public void TransferMethod(String transfer) throws InterruptedException {
        Select transfermethod = new Select(btnTransferMethod);
        transfermethod.selectByValue(transfer);
        Thread.sleep(2000);
        txtAccountName.sendKeys("Tony");
        Thread.sleep(2000);
        txtAccountNumber.sendKeys("19001560");
        Thread.sleep(2000);
        txtBankref.sendKeys("123456789");
        Thread.sleep(2000);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ChooseMethodRecharge() throws InterruptedException {
        btnDepositWithoutPromotion.click();
        Thread.sleep(2000);
        viewhistoryRecharge.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("NotPromotion", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ChooseMethodRechargePromotion() throws InterruptedException {
        btnSelectPromotion.click();
        Thread.sleep(2000);
        imgPromotion777.click();
        Thread.sleep(2000);
        submitPromotion.click();
        Thread.sleep(2000);
        viewhistoryRecharge.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("Promotion", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void WithdrawMoney() throws InterruptedException {
        menuAccount.click();
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        btnWithdrawMoney.click();
        Thread.sleep(2000);
        txtmoneyWithdraw.clear();
        txtmoneyWithdraw.sendKeys("1000");
        txtpassWithdraw.sendKeys("0904458940");
        Thread.sleep(2000);
        submitWithdraw.click();
        viewhistoryRecharge.click();
        Thread.sleep(2000);

    }

    public void Wallet() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        btnWallet.click();
        Thread.sleep(15000);
        Wait.untilPageLoadComplete(driver);

    }

    public void PlayNow() throws InterruptedException {
        btnPlayNow.click();
        Thread.sleep(10000);
        Wait.untilPageLoadComplete(driver);
    }

    public void FundIn() throws InterruptedException {
        btnFundIn.click();
        Thread.sleep(2000);
        txtAmountFund.clear();
        txtAmountFund.sendKeys("500");
//        btnTransferNow.click();
        btnTransferPlay.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("FundIn", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void FundOut() throws InterruptedException {
        btnFundOut.click();
        Thread.sleep(2000);
        txtAmountFund.clear();
        txtAmountFund.sendKeys("500");
        btnFundOutSubmit.click();
        Thread.sleep(2000);
        try {
            WebElement messeageError = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"));
            String messeageErrorA = messeageError.getText().trim();
            String messeageErrorE = (driver.findElement(By.xpath("//*[@id=\"wrapper\"]/shared-alert/p"))).getText().trim();
            if (messeageError.isDisplayed() && messeageErrorA.contains(messeageErrorE)) {
                System.out.println("MessageError is: " + messeageErrorE + "");
                Utility.captureScreenshot("FundOut", driver);
                driver.quit();
            } else System.out.println("Process Next Steps");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void TransactionReport() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        btnTransactionReport.click();
        Thread.sleep(2000);
    }

    public void TranferReport() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        btnTranferReport.click();
        Thread.sleep(2000);
    }

    public void DepositAndWithdrawalHistory() throws InterruptedException {
        menuAccount.click();
        Thread.sleep(2000);
        String actual = userAccount.getText();
        System.out.println(actual);
        imgAccount.click();
        btnHistoryDepositandWithdrawal.click();
        Thread.sleep(2000);
    }

    public void CloseHomePage() throws Exception {
//        VideoRecorder_utlity.stopRecord();
//        Thread.sleep(2000);
        driver.quit();
    }

    public void choose_From(int nam, int thang, int ngay) {
        From.click();
//        chonThang(thang);
        chonNgay(ngay);
    }

    public void choose_To(int nam, int thang, int ngay) {
        To.click();
//        chonThang(thang);
        chonNgay(ngay);
    }

    private void chonThang(int thang) {
        int monWeb = convertMonthToInt(month.getText().trim());
        if (monWeb == thang) {
            System.out.println("Select month: " + monWeb);
        } else {
            nextMonth.click();
            chonThang(thang);
        }
    }

    private void chonNgay(int ngay) {
        for (WebElement day : dayOfMonth) {
            if (day.getText().equalsIgnoreCase(String.valueOf(ngay))) {
                day.click();
                break;
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int convertMonthToInt(String month) {
        System.out.println(month);
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Tháng 1")) {
            return 1;
        } else if (month.equalsIgnoreCase("February") || month.equalsIgnoreCase("Tháng 2")) {
            return 2;
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Tháng 3")) {
            return 3;
        } else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("Tháng 4")) {
            return 4;
        } else if (month.equalsIgnoreCase("May") || month.equalsIgnoreCase("Tháng 5")) {
            return 5;
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("Tháng 6")) {
            return 6;
        } else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("Tháng 7")) {
            return 7;
        } else if (month.equalsIgnoreCase("August") || month.equalsIgnoreCase("Tháng 8")) {
            return 8;
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Tháng 9")) {
            return 9;
        } else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Tháng 10")) {
            return 10;
        } else if (month.equalsIgnoreCase("November") || month.equalsIgnoreCase("Tháng 11")) {
            return 11;
        } else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Tháng 12")) {
            return 12;
        } else return -1;
    }

}
