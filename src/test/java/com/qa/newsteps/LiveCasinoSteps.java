package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.LiveCasioPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class LiveCasinoSteps {
    public WebDriver driver;
    TestContext testContext;
    LiveCasioPages liveCasioPages;

    public LiveCasinoSteps(TestContext context) {
        testContext = context;
        liveCasioPages = testContext.getPageObjectManager().getLiveCasioPages();
    }

    @And("^I click game Live Casio$")
    public void iClickGameLiveCasio() throws InterruptedException {
        liveCasioPages.LiveCasio();
    }

    @And("^I choose Live Casio \"([^\"]*)\"$")
    public void iChooseLiveCasio(String hall) throws Throwable {
        switch (hall) {
            case "JulyGaming":
                liveCasioPages.JulyGaming();
                System.out.println("Hall JulyGaming");
                break;
            case "N2Casino":
                liveCasioPages.N2Casino();
                System.out.println("Hall N2Casino");
                break;
            case "EvoCasino":
                liveCasioPages.EvoCasino();
                System.out.println("Hall EvoCasino");
                break;
            case "WmCasino":
                liveCasioPages.WmCasino();
                System.out.println("Hall WmCasino");
                break;
            case "AllBetCasino":
                liveCasioPages.AllBetCasino();
                System.out.println("Hall AllBetCasino");
                break;
            case "SexyBaccarat":
                liveCasioPages.SexyBaccarat();
                System.out.println("Hall SexyBaccarat");
                break;
            case "ViVoCasino":
                liveCasioPages.ViVoCasino();
                System.out.println("Hall VivoCasino");
                break;
            case "LuckyCasino":
                liveCasioPages.LuckyCasino();
                System.out.println("Hall LuckyCasino");
                break;
            case "AsiaGaming":
                liveCasioPages.AsiaGaming();
                System.out.println("Hall AsiaGaming");
                break;
            case "GoldenDelux":
                liveCasioPages.GoldenDelux();
                System.out.println("Hall GoldenDelux");
                break;
            case "EbetCasino":
                liveCasioPages.EbetCasino();
                System.out.println("Hall EbetCasino");
                break;
            case "VgsCasino":
                liveCasioPages.VgsCasino();
                System.out.println("Hall VgsCasino");
                break;
        }
    }

}
