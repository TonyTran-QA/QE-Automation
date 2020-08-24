package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.CockFightPages;
import com.qa.newpages.JoinNowPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class CockFightSteps {
    public WebDriver driver;
    TestContext testContext;
    CockFightPages cockFightPages;

    public CockFightSteps(TestContext context) {
        testContext = context;
        cockFightPages = testContext.getPageObjectManager().getCockFightPages();
    }
    @And("^I click game CockFight$")
    public void iClickGameCockFight() throws InterruptedException {
        cockFightPages.CockFight();
    }

    @And("^I choose CockFight \"([^\"]*)\"$")
    public void iChooseCockFight(String hall) throws Throwable {
        switch (hall){
            case "SV388":
                cockFightPages.SV388();
                System.out.println("Hall SV388");
                break;
            case "S128":
                cockFightPages.S128();
                System.out.println("Hall S128");
                break;
        }
    }
}
