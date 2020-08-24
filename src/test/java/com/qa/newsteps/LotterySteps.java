package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.LotteryPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class LotterySteps {
    public WebDriver driver;
    TestContext testContext;
    LotteryPages lotteryPages;

    public LotterySteps(TestContext context) {
        testContext = context;
        lotteryPages = testContext.getPageObjectManager().getLotteryPages();
    }
    @And("^I click game Lottery$")
    public void iClickGameLottery() throws InterruptedException {
        lotteryPages.Lottery();
    }

    @And("^I choose Lottery \"([^\"]*)\"$")
    public void iChooseLottery(String hall) throws Throwable {
        switch (hall){
            case "Vlote":
                lotteryPages.Vlote();
                System.out.println("Hall Vlote");
                break;
            case "Lottery39":
                lotteryPages.Lottery39();
                System.out.println("Hall Lottery39");
                break;
        }

    }
}
