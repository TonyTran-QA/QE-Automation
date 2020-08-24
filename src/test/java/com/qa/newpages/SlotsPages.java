package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SlotsPages extends BasePage {
    WebDriver driver;

    public SlotsPages(WebDriver driver) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    // Xpath
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/ul/li[2]/a/p/img")
    private WebElement SLOTS;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement AsiaSlots;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[1]/div[3]/div/div[3]/div/div/div[3]")
    private WebElement btnPlayAsiaSlots;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement Haba;
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/game-slots-detail/div[2]/ul/li[1]/figure/a/img")
    private WebElement btnPlayScopa;

    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/div/ul/li[3]/figure/a/img")
    private WebElement OneForAll;
    @FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/section[2]/game-slots-detail/div[2]/ul/li[1]/figure/a/img")
    private WebElement btnSuperShot;


    public void SLOTS() throws InterruptedException {
        SLOTS.click();
        Thread.sleep(2000);
    }

    public void AsiaSlots() throws InterruptedException {
        AsiaSlots.click();
        Thread.sleep(5000);
        btnPlayAsiaSlots.click();
        Thread.sleep(5000);
    }

    public void Haba() throws InterruptedException {
        Haba.click();
        Thread.sleep(5000);
        btnPlayScopa.click();
        Thread.sleep(5000);
    }

    public void OneForAll() throws InterruptedException {
        OneForAll.click();
        Thread.sleep(5000);
        btnSuperShot.click();
        Thread.sleep(5000);
    }


}
