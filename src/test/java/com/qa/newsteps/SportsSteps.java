package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.SlotsPages;
import com.qa.newpages.SportsPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class SportsSteps {
    public WebDriver driver;
    TestContext testContext;
    SportsPages sportsPages;

    public SportsSteps(TestContext context) {
        testContext = context;
        sportsPages = testContext.getPageObjectManager().getSportsPages();
    }

    @And("^I click game Sports$")
    public void iClickGameSports() throws InterruptedException {
        sportsPages.Sports();
    }

    @And("^I choose Sports \"([^\"]*)\"$")
    public void iChooseSports(String hall) throws Throwable {
        switch (hall) {
            case "M8Sport":
                sportsPages.M8Sport();
                System.out.println("Hall M8Sport");
                break;
            case "AsiaSport":
                sportsPages.AsiaSport();
                System.out.println("Hall AsiaSport");
                break;
            case "IGKSport":
                sportsPages.IGKSport();
                System.out.println("Hall IGKSport");
                break;
            case "LuckySport":
                sportsPages.LuckySport();
                System.out.println("Hall LuckySport");
                break;
            case "ISNSport":
                sportsPages.ISNSport();
                System.out.println("Hall ISNSport");
                break;
        }
    }
}
