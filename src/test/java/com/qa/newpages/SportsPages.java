package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SportsPages extends BasePage {
    WebDriver driver;

    public SportsPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    //Xpath
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/ul/li[3]/a/p/img")
    private WebElement Sports;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement M8Sport;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement AsiaSport;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[3]/figure/a/img")
    private WebElement IGKSport;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[4]/figure/a/img")
    private WebElement LuckySport;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[5]/figure/a/img")
    private WebElement ISNSport;

    public void Sports() throws InterruptedException {
        Sports.click();
        Thread.sleep(2000);
    }

    public void M8Sport() throws InterruptedException {
        M8Sport.click();
        Thread.sleep(5000);
    }

    public void AsiaSport() throws InterruptedException {
        AsiaSport.click();
        Thread.sleep(5000);
    }

    public void IGKSport() throws InterruptedException {
        IGKSport.click();
        Thread.sleep(5000);
    }

    public void LuckySport() throws InterruptedException {
        LuckySport.click();
        Thread.sleep(5000);
    }

    public void ISNSport() throws InterruptedException {
        ISNSport.click();
        Thread.sleep(5000);
    }

}
