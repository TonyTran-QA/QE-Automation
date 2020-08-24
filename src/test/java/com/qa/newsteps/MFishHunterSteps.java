package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.MFishHunterPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class MFishHunterSteps {
    public WebDriver driver;
    TestContext testContext;
    MFishHunterPages mFishHunterPages;

    public MFishHunterSteps(TestContext context) {
        testContext = context;
        mFishHunterPages = testContext.getPageObjectManager().getmFishHunterPages();
    }

    @And("^I click game MFishHunter$")
    public void iClickGameMFishHunter() throws InterruptedException {
        mFishHunterPages.MFishHunter();
    }

    @And("^I choose MFishHunter \"([^\"]*)\"$")
    public void iChooseMFishHunter(String hall) throws Throwable {
        switch (hall) {
            case "DragonHunter":
                mFishHunterPages.DragonHunter();
                System.out.println("Hall DragonHunter");
                break;
            case "FishHunter":
                mFishHunterPages.FishHunter();
                System.out.println("Hall FishHunter");
                break;
            case "SpaceCat":
                mFishHunterPages.SpaceCat();
                System.out.println("Hall SpaceCat");
                break;
            case "GoldenDragon":
                mFishHunterPages.GoldenDragon();
                System.out.println("Hall GoldenDragon");
                break;
            case "AirCombat":
                mFishHunterPages.AirCombat();
                System.out.println("Hall AirCombat");
                break;
            case "ThreeKingdoms":
                mFishHunterPages.ThreeKingdoms();
                System.out.println("Hall ThreeKingdoms");
                break;
        }

    }
}
