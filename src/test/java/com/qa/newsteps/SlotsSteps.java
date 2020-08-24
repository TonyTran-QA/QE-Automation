package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.SlotsPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class SlotsSteps {
    public WebDriver driver;
    TestContext testContext;
    SlotsPages slotsPages;

    public SlotsSteps(TestContext context) {
        testContext = context;
        slotsPages = testContext.getPageObjectManager().getSlotsPages();
    }

    @And("^I click game Slots$")
    public void iClickGameSlots() throws InterruptedException {
        slotsPages.SLOTS();
    }

    @And("^I choose Slots \"([^\"]*)\"$")
    public void iChooseSlots(String hall) throws Throwable {
        switch (hall) {
            case "AsiaSlots":
                slotsPages.AsiaSlots();
                System.out.println("Hall AsiaSlots");
                break;
            case "Haba":
                slotsPages.Haba();
                System.out.println("Hall Haba");
                break;
            case "OneForAll":
                slotsPages.OneForAll();
                System.out.println("Hall OneForAll");
                break;
        }
    }
}
