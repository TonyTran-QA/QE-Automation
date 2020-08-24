package com.qa.managers;

import com.qa.Pages.*;
import com.qa.newpages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectManager {
    private WebDriverWait wait;
    private WebDriver driver;
    private BasePage basePage;
    private AccPage accPage;
    private JoinNowPages joinNowPages;
    private LoginPages loginPages;
    private LiveCasioPages liveCasioPages;
    private SlotsPages slotsPages;
    private SportsPages sportsPages;
    private PokerPages pokerPages;
    private LotteryPages lotteryPages;
    private CockFightPages cockFightPages;
    private MFishHunterPages mFishHunterPages;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public void WebDriverManager(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage getBasePage() {
        return (basePage == null) ? basePage = new BasePage(driver, wait) : basePage;
    }

    public AccPage getAccPage() {
        return (accPage == null) ? accPage = new AccPage(driver) : accPage;
    }

    public LoginPages getLoginPages() {
        return (loginPages == null) ? loginPages = new LoginPages(driver) : loginPages;

    }

    public JoinNowPages getJoinNowPages() {
        return (joinNowPages == null) ? joinNowPages = new JoinNowPages(driver) : joinNowPages;
    }

    public LiveCasioPages getLiveCasioPages() {
        return (liveCasioPages == null) ? liveCasioPages = new LiveCasioPages(driver) : liveCasioPages;
    }

    public SlotsPages getSlotsPages() {
        return (slotsPages == null) ? slotsPages = new SlotsPages(driver) : slotsPages;
    }

    public SportsPages getSportsPages() {
        return (sportsPages == null) ? sportsPages = new SportsPages(driver) : sportsPages;
    }

    public PokerPages getPokerPages() {
        return (pokerPages == null) ? pokerPages = new PokerPages(driver) : pokerPages;
    }

    public LotteryPages getLotteryPages() {
        return (lotteryPages == null) ? lotteryPages = new LotteryPages(driver) : lotteryPages;
    }

    public CockFightPages getCockFightPages() {
        return (cockFightPages == null) ? cockFightPages = new CockFightPages(driver) : cockFightPages;
    }

    public MFishHunterPages getmFishHunterPages() {
        return (mFishHunterPages == null) ? mFishHunterPages = new MFishHunterPages(driver) : mFishHunterPages;
    }


}
