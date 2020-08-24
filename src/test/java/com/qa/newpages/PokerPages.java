package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PokerPages extends BasePage {
    WebDriver driver;

    public PokerPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/ul/li[4]/a/p/img")
    private WebElement POKER;
    @FindBy(how = How.XPATH,using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li/figure/a/img")
    private WebElement IDNPoker;


    public void Poker() throws InterruptedException {
        POKER.click();
        Thread.sleep(2000);
    }
    public void IDNPoker() throws InterruptedException {
        IDNPoker.click();
        Thread.sleep(5000);
    }
}
