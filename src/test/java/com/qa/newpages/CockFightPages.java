package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CockFightPages extends BasePage {
    WebDriver driver;

    public CockFightPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    //Xpath
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/ul/li[6]/a/p/img")
    private WebElement COCKFIGHT;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement SV388;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement S128;

    public void CockFight() throws InterruptedException {
        COCKFIGHT.click();
        Thread.sleep(2000);
    }

    public void SV388() throws InterruptedException {
        SV388.click();
        Thread.sleep(5000);
    }

    public void S128() throws InterruptedException {
        S128.click();
        Thread.sleep(5000);
    }
}
