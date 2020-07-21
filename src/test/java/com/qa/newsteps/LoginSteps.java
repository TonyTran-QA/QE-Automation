package com.qa.newsteps;

import com.github.javafaker.Faker;
import com.qa.Pages.Hooks;
import com.qa.cucumber.TestContext;
import com.qa.newpages.LoginPages;
import com.servicecorp.core.utils.ReadProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver driver;
    public Faker faker;
    TestContext testContext;
    LoginPages loginPages;

    public LoginSteps(TestContext context) {
        driver = Hooks.driver;
        faker = new Faker();
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

        }
    }

    @Then("^I close$")
    public void i_close() throws Throwable {
        loginPages.ClosePage();
    }
    @Given("^I open Home please$")
    public void i_open_Home_please() throws Throwable {

    }



}
