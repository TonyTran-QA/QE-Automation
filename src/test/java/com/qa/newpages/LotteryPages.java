package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LotteryPages extends BasePage {
    WebDriver driver;

    public LotteryPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/ul/li[5]/a/p/img")
    private WebElement LOTTERY;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement Vlote;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement Lottery39;

    public void Lottery() throws InterruptedException {
        LOTTERY.click();
        Thread.sleep(2000);
    }
    public void Vlote() throws InterruptedException {
        Vlote.click();
        Thread.sleep(5000);
    }
    public void Lottery39() throws InterruptedException {
        Lottery39.click();
        Thread.sleep(5000);
    }


}
