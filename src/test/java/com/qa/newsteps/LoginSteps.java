package com.qa.newsteps;


import com.qa.cucumber.TestContext;
import com.qa.newpages.LoginPages;
import com.qa.videoreport.VideoRecorder_utlity;
import com.servicecorp.core.utils.ReadProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver driver;
    TestContext testContext;
    LoginPages loginPages;

    public LoginSteps(TestContext context) {
        testContext = context;
        loginPages = testContext.getPageObjectManager().getLoginPages();
    }

    @Given("^I open Home$")
    public void i_open_Home() throws Throwable {
        loginPages.OpenHomePage();
        Thread.sleep(2000);
    }

    @When("^I doLogin with thing \"([^\"]*)\"$")
    public void i_doLogin_with_thing(String arg0) throws Throwable {
        switch (arg0) {
            case "AccPass":
                System.out.println("AccPass Login");
                loginPages.LoginPage(ReadProperties.getConfig("UserId"), ReadProperties.getConfig("Passwd"));
                Thread.sleep(2000);
                break;
            case "AccFailed_Pass":
                System.out.println("AccFailed_Pass Login");
                loginPages.LoginPage(ReadProperties.getConfig("UserId"), ReadProperties.getConfig("Pass_wd"));
                Thread.sleep(2000);
                break;
            case "AccFailed_Acc":
                System.out.println("AccFailed_Acc Login");
                loginPages.LoginPage(ReadProperties.getConfig("UserID_F"), ReadProperties.getConfig("Passwd"));
                Thread.sleep(2000);
        }
    }

    @And("^I click on submit$")
    public void i_click_on_submit() throws Throwable {
        loginPages.signIn();
    }

    @And("^I verify my account$")
    public void iVerifyMyAccount() throws InterruptedException {
        loginPages.MyAccount();
    }

    @And("^I switch Language$")
    public void iSwitchLanguage() throws InterruptedException {
        loginPages.ChooseLanguage();
    }

    @And("^I choose game and \"([^\"]*)\"$")
    public void iChooseGameAnd(String arg0) throws Throwable {
        switch (arg0) {
            case "SexyHall":
                System.out.println("Sexy Hall");
                loginPages.SexHall();
                Thread.sleep(2000);
                break;
            case "HGHall":
                System.out.println("HG HALL");
                loginPages.HGHall();
                Thread.sleep(2000);
                break;
            case "AGHall":
                System.out.println("AG HALL");
                loginPages.AGHall();
                Thread.sleep(2000);
                break;
            case "Grand Hall":
                System.out.println("Grand Hall");
                loginPages.GrandHall();
                Thread.sleep(2000);
                break;
        }
    }

    @Then("^I close$")
    public void i_close() throws Throwable {
        VideoRecorder_utlity.stopRecord();
        loginPages.ClosePage();
    }

    @When("^I click on funds$")
    public void i_click_on_funds() throws Throwable {
        loginPages.SelectFunds();

    }
    @And("^I select \"([^\"]*)\" \"([^\"]*)\" transfer$")
    public void iSelectTransfer(String keySearch, String keySearch1) throws Throwable {
        loginPages.select_From(keySearch);
        loginPages.select_To(keySearch1);
    }

    @And("^I choose \"([^\"]*)\" is transfer$")
    public void iChooseIsTransfer(String amount) throws Throwable {
        loginPages.AmountTransfer(amount);

    }


    @And("^I choose and add \"([^\"]*)\"$")
    public void iChooseAndAdd(String namebank) throws Throwable {
       loginPages.addBanks(namebank);
    }


    @And("^I play game$")
    public void iPlayGame() throws InterruptedException {
        loginPages.PlayGandHall();
    }
}
