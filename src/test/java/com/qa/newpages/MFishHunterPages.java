package com.qa.newpages;

import com.qa.Pages.BasePage;
import com.qa.Pages.HandleException.MyPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MFishHunterPages extends BasePage {
    WebDriver driver;

    public MFishHunterPages(WebDriver driver){
        this.driver = driver;
        MyPageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"wrap_bg\"]/section[1]/a/i")
    private WebElement btnBack;
    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/ul/li[7]/a/p/img")
    private WebElement MFishHunter;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[1]/figure/a/img")
    private WebElement DragonHunter;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[2]/figure/a/img")
    private WebElement FishHunter;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[3]/figure/a/img")
    private WebElement SpaceCat;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[4]/figure/a/img")
    private WebElement GoldenDragon;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[5]/figure/a/img")
    private WebElement AirCombat;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/section[2]/div/ul/li[6]/figure/a/img")
    private WebElement ThreeKingdoms;

    public void MFishHunter() throws InterruptedException {
        MFishHunter.click();
        Thread.sleep(5000);
    }
    public void DragonHunter() throws InterruptedException {
        DragonHunter.click();
        Thread.sleep(5000);
    }
    public void FishHunter() throws InterruptedException {
        FishHunter.click();
        Thread.sleep(5000);
    }
    public void SpaceCat() throws InterruptedException {
        SpaceCat.click();
        Thread.sleep(5000);
    }
    public void GoldenDragon() throws InterruptedException {
        GoldenDragon.click();
        Thread.sleep(5000);
    }
    public void AirCombat() throws InterruptedException {
        AirCombat.click();
        Thread.sleep(5000);
    }
    public void ThreeKingdoms() throws InterruptedException {
        ThreeKingdoms.click();
        Thread.sleep(5000);
    }
}
