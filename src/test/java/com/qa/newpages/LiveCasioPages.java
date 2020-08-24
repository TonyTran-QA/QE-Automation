package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LiveCasioPages extends BasePage {
    WebDriver driver;

    public LiveCasioPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.XPATH,using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;
    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/ul/li[1]/a/p/img")
    private WebElement LiveCasio;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement JULYGAMING;
    @FindBy(how = How.XPATH,using = "/html/body/my-app/div/ng-component/div/v4lobbylayoutdesktop/div/v4gameselectiondesktop/v4dealerviewdesktopcomponent/div[2]/v4dealerbaccaratdesktopcomponent[1]/div/div[2]/v4playbutton/div")
    private WebElement BTNJULYGAMING;
    @FindBy(how = How.XPATH,using = "//*[@id=\"v4betlimit\"]/span")
    private WebElement btnAmountPlay;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement N2Casino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[3]/figure/a/img")
    private WebElement EvoCasino;
    @FindBy(how = How.XPATH,using = "/html/body/div[6]/div/div/div/div[3]/div[3]/div/div/div/div[1]/div/div[1]/div[2]")
    private WebElement BtnPlayEvoCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[4]/figure/a/img")
    private WebElement WmCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[5]/figure/a/img")
    private WebElement AllBetCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[6]/figure/a/img")
    private WebElement SexyBaccarat;
    @FindBy(how = How.XPATH,using = "//*[@id=\"redirect\"]")
    private WebElement BtnPlaySexyBaccarat;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[7]/figure/a/img")
    private WebElement ViVoCasino;
    @FindBy(how = How.XPATH,using = "//*[@id=\"thumb-labels-overlay-1\"]")
    private WebElement btnViVoCasino;
    @FindBy(how = How.XPATH,using = "//*[@id=\"limit-LMTBAB3FF02-CFF4-40D6-8947-59A26597D1C9\"]/span")
    private WebElement btn2ViVoCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[8]/figure/a/img")
    private WebElement LuckyCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[9]/figure/a/img")
    private WebElement AsiaGaming;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[10]/figure/a/img")
    private WebElement GoldenDelux;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[11]/figure/a/img")
    private WebElement EbetCasino;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[12]/figure/a/img")
    private WebElement VgsCasino;


    public void LiveCasio() throws InterruptedException {
        LiveCasio.click();
        Thread.sleep(2000);
    }
    public void JulyGaming() throws InterruptedException {
        JULYGAMING.click();
        Thread.sleep(5000);
        BTNJULYGAMING.click();
        Thread.sleep(2000);
        btnAmountPlay.click();
        Thread.sleep(5000);
    }
    public void N2Casino() throws InterruptedException {
        N2Casino.click();
        Thread.sleep(5000);
    }
    public void EvoCasino() throws InterruptedException {
        EvoCasino.click();
        Thread.sleep(5000);
        BtnPlayEvoCasino.click();
        Thread.sleep(5000);
    }
    public void WmCasino() throws InterruptedException {
        WmCasino.click();
        Thread.sleep(5000);
    }
    public void AllBetCasino() throws InterruptedException {
        AllBetCasino.click();
        Thread.sleep(5000);
    }
    public void SexyBaccarat() throws InterruptedException {
        SexyBaccarat.click();
        Thread.sleep(5000);
        BtnPlaySexyBaccarat.click();
        Thread.sleep(5000);
    }
    public void ViVoCasino() throws InterruptedException {
        ViVoCasino.click();
        Thread.sleep(5000);
        btnViVoCasino.click();
        Thread.sleep(5000);
        btn2ViVoCasino.click();
        Thread.sleep(5000);
    }
    public void LuckyCasino() throws InterruptedException {
        LuckyCasino.click();
        Thread.sleep(5000);
    }
    public void AsiaGaming() throws InterruptedException {
        AsiaGaming.click();
        Thread.sleep(5000);
    }
    public void GoldenDelux() throws InterruptedException {
        GoldenDelux.click();
        Thread.sleep(5000);
    }
    public void EbetCasino() throws InterruptedException {
        EbetCasino.click();
        Thread.sleep(5000);
    }
    public void VgsCasino() throws InterruptedException {
        VgsCasino.click();
        Thread.sleep(5000);
    }

}
