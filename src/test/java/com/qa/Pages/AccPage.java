package com.qa.Pages;

import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;

public class AccPage extends BasePage {
    final static int DEEP_SLEEP = 1000;
    final static int SHORT_SLEEP = 200;
    final static String SOURCE_FILE = "C:\\Users\\User\\Downloads\\Report2.pdf";
    final static String TARGET_FILE = "C:\\Users\\User\\Downloads\\report\\%s.PDF";

    public AccPage(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    String baseURL = "http://jpportal.jetstarpacificair.com/inphieuthu/Login.aspx";

    @FindBy(how = How.ID, using = "txtUserName")
    private WebElement txtUserName;
    @FindBy(how = How.ID, using = "txtPassword")
    private WebElement txtPassWord;
    @FindBy(how = How.ID, using = "btnLogin")
    private WebElement btnLogIn;

    @FindBy(how = How.ID, using = "btnOkay")
    private WebElement btnOkay;
    @FindBy(how = How.XPATH, using = "//a[@title='In 1 PNR']")
    private WebElement btnPrintInvoice;

    @FindBy(how = How.ID, using = "txtinputpnr")
    private WebElement txtInputCode;
    @FindBy(how = How.ID,using = "bttSubmit")
    private WebElement viewDetails;
    @FindBy(how = How.ID,using = "GridView1_ctl02_Btn_Print")
    private WebElement btnPrint;
    @FindBy(how = How.ID,using = "ReportViewer1_ctl05_ctl04_ctl00_ButtonImgDown")
    private WebElement btnPrint1;
    @FindBy(how = How.XPATH,using = "//a[@title='PDF']")
    private WebElement btnPrint2;


    public void OpenPage()  {
        driver.navigate().to(baseURL);
    }

    public void LoginPage()  {
        txtUserName.clear();
        txtUserName.sendKeys("37965745");
        txtPassWord.clear();
        txtPassWord.sendKeys("Gtdsgn2014#");
        clickAndWait(btnLogIn);

    }

    public void ClickSuccess()  {
        btnOkay.click();

    }

    public void PrintInvoice()  {
        btnPrintInvoice.click();
    }

    public void inputCode(String keyCode)  {
        txtInputCode.clear();
        txtInputCode.sendKeys(keyCode);

    }
    public void viewDetails() {
        viewDetails.click();
        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printInvoice(String keyCode) throws InterruptedException{
        btnPrint.click();
        Thread.sleep(DEEP_SLEEP);
        btnPrint1.click();
        btnPrint2.click();
        Thread.sleep(DEEP_SLEEP);
        Thread.sleep(DEEP_SLEEP);
        moveFile(SOURCE_FILE, String.format(TARGET_FILE, keyCode));
    }

    public void sayGoodBy() {
        driver.quit();
    }

    public void moveFile(String sourceFile, String targetFile ) {
        File file = new File(sourceFile);
        if(file.renameTo(new File(targetFile))) {
            file.delete();
            System.out.println("File moved successfully");
        } else {
            System.out.println("Failed to move the file");
            driver.quit();
            // TODO: Throw a Exception + Clear sourceFile if sourceFile is found
        }
    }
}

