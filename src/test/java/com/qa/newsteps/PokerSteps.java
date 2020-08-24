package com.qa.newsteps;

import com.lowagie.text.pdf.SpotColor;
import com.qa.cucumber.TestContext;
import com.qa.newpages.PokerPages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PokerSteps {
    public WebDriver driver;
    TestContext testContext;
    PokerPages pokerPages;

    public PokerSteps(TestContext context) {
        testContext = context;
        pokerPages = testContext.getPageObjectManager().getPokerPages();
    }

    @And("^I click game Poker$")
    public void iClickGamePoker() throws InterruptedException {
        pokerPages.Poker();
    }

    @And("^I choose Poker \"([^\"]*)\"$")
    public void iChoosePoker(String hall) throws Throwable {
        switch (hall) {
            case "IDNPoker":
                pokerPages.IDNPoker();
                System.out.println("Hall IDNPoker");
                break;
        }
    }

}
