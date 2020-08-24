package com.qa.newsteps;

import com.qa.cucumber.TestContext;
import com.qa.newpages.JoinNowPages;
import com.servicecorp.core.utils.ReadProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Calendar;
import java.util.Date;




public class JoinNowSteps {
    public WebDriver driver;
    TestContext testContext;
    JoinNowPages joinNowPages;


    public JoinNowSteps(TestContext context) {
        testContext = context;
        joinNowPages = testContext.getPageObjectManager().getJoinNowPages();
    }

    @Given("^I open HomePage new UI$")
    public void i_open_HomePage_new_UI() throws Throwable {
        joinNowPages.OpenNewHomePage();
    }

    @When("^I check switch Language$")
    public void i_check_switch_Language() throws Throwable {
        joinNowPages.SwitchLanguage();
    }

    @When("^I click join now$")
    public void i_click_join_now() throws Throwable {
        joinNowPages.JoinNow();
    }

    @And("^I sign in with \"([^\"]*)\"$")
    public void iSignInWith(String arg0) throws Throwable {
        switch (arg0) {
            case "TonyA":
                System.out.println("Join now with TonyA");
                joinNowPages.SignIn(ReadProperties.getConfig("userA"), ReadProperties.getConfig("passA"), ReadProperties.getConfig("passA"));
                Thread.sleep(2000);
                break;
            case "TonyB":
                System.out.println("Join now with TonyB");
                joinNowPages.SignIn(ReadProperties.getConfig("userB"), ReadProperties.getConfig("passB"), ReadProperties.getConfig("passB"));
                Thread.sleep(2000);
                break;
            case "TonyC":
                System.out.println("Join now with TonyC");
                joinNowPages.SignIn(ReadProperties.getConfig("userC"), ReadProperties.getConfig("passA"), ReadProperties.getConfig("passB"));
                Thread.sleep(2000);
                break;
            case "TonyD":
                System.out.println("Join now with TonyD");
                joinNowPages.SignIn(ReadProperties.getConfig("userD"), ReadProperties.getConfig("passA"), ReadProperties.getConfig("passD"));
                Thread.sleep(2000);
                break;
            case "TonyE":
                System.out.println("Join now with TonyE");
                joinNowPages.SignIn(ReadProperties.getConfig("userE"), ReadProperties.getConfig("passD"), ReadProperties.getConfig("passB"));
                Thread.sleep(2000);
                break;
        }

    }

    @When("^I confirm password and next steps$")
    public void i_confirm_password_and_next_steps() throws Throwable {
        joinNowPages.Submit();
    }

    @And("^I fill infor \"([^\"]*)\" information$")
    public void iFillInforInformation(String arg1) throws Throwable {
        switch (arg1) {
            case "TonyA":
                System.out.println("Full Name Is TonyA");
                joinNowPages.FillInfor(ReadProperties.getConfig("userA"), ReadProperties.getConfig("phoneA"));
                Thread.sleep(2000);
                break;
            case "TonyB":
                System.out.println("Full Name Is TonyB");
                joinNowPages.FillInfor(ReadProperties.getConfig("userB"), ReadProperties.getConfig("phoneB"));
                Thread.sleep(2000);
                break;
            case "TonyC":
                System.out.println("Full Name Is TonyC");
                joinNowPages.FillInfor(ReadProperties.getConfig("userC"), ReadProperties.getConfig("phoneC"));
                Thread.sleep(2000);
                break;
            case "TonyD":
                System.out.println("Full Name Is TonyD");
                joinNowPages.FillInfor(ReadProperties.getConfig("userD"), ReadProperties.getConfig("phoneD"));
                Thread.sleep(2000);
                break;
            case "TonyE":
                System.out.println("Full Name Is TonyE");
                joinNowPages.FillInfor(ReadProperties.getConfig("userE"), ReadProperties.getConfig("phoneE"));
                Thread.sleep(2000);
                break;
        }

    }

    @And("^I fill OTP$")
    public void iFillOTP() throws InterruptedException {
        joinNowPages.OTP();

    }

    @When("^I back to Home$")
    public void i_back_to_Home() throws Throwable {
        joinNowPages.CreatAccount();

    }

    @And("^I close HomePage$")
    public void iCloseHomePage() throws Exception {
        joinNowPages.CloseHomePage();

    }

    @And("^I verify account has just been registered$")
    public void iVerifyAccountHasJustBeenRegistered() {
        joinNowPages.VerifymyAccount();

    }

    @And("^I click login$")
    public void iClickLogin() throws InterruptedException {
        joinNowPages.btnLogin();

    }

    @And("^I login with \"([^\"]*)\"$")
    public void iLoginWith(String account) throws Throwable {
        switch (account) {
            case "TonyA":
                System.out.println("Join now with TonyA");
                joinNowPages.Login(ReadProperties.getConfig("userA"), ReadProperties.getConfig("passA"));
                Thread.sleep(2000);
                break;
            case "TonyB":
                System.out.println("Join now with TonyB");
                joinNowPages.Login(ReadProperties.getConfig("userB"), ReadProperties.getConfig("passB"));
                Thread.sleep(2000);
                break;
            case "TonyC":
                System.out.println("Join now with TonyC");
                joinNowPages.Login(ReadProperties.getConfig("userC"), ReadProperties.getConfig("passA"));
                Thread.sleep(2000);
                break;
            case "TonyD":
                System.out.println("Join now with TonyD");
                joinNowPages.Login(ReadProperties.getConfig("userD"), ReadProperties.getConfig("passA"));
                Thread.sleep(2000);
                break;
            case "TonyE":
                System.out.println("Join now with TonyE");
                joinNowPages.Login(ReadProperties.getConfig("userE"), ReadProperties.getConfig("passD"));
                Thread.sleep(2000);
                break;
        }
    }

    @And("^I click login submit$")
    public void iClickLoginSubmit() throws InterruptedException {
        joinNowPages.SubmitLogin();
    }

    @And("^I verify account has just been login$")
    public void iVerifyAccountHasJustBeenLogin() throws InterruptedException {
        joinNowPages.VerifymyAccountLogin();
    }
    @And("^I verify my account has just been login$")
    public void iVerifyMyAccountHasJustBeenLogin() throws InterruptedException {
        joinNowPages.VerifymyAccountLogin1();
    }

    @And("^I check my profile$")
    public void iCheckMyProfile() throws InterruptedException {
        joinNowPages.MyProFile();

    }

    @And("^I add my bank account with name \"([^\"]*)\"$")
    public void iAddMyBankAccountWithName(String namebank) throws Throwable {
        joinNowPages.BankAccount(namebank);
    }


    @And("^I click recharge account and sent \"([^\"]*)\"$")
    public void iClickRechargeAccountAndSent(String amount) throws Throwable {
        joinNowPages.AddMoney(amount);
    }

    @And("^I choose \"([^\"]*)\" recharge$")
    public void iChooseRecharge(String choosebank) throws Throwable {
        joinNowPages.ChooseBank(choosebank);

    }

    @And("^I choose \"([^\"]*)\"$")
    public void iChoose(String transfer) throws Throwable {
        joinNowPages.TransferMethod(transfer);
    }

    @And("^I choose Deposit without promotion And Select promotion \"([^\"]*)\"$")
    public void iChooseDepositWithoutPromotionAndSelectPromotion(String chess) throws Throwable {
        switch (chess) {
            case "NotPromotion":
                joinNowPages.ChooseMethodRecharge();
                Thread.sleep(2000);
                break;
            case "TruePromotion":
                joinNowPages.ChooseMethodRechargePromotion();
                Thread.sleep(2000);
                break;
        }

    }

    @And("^I process Withdraw money$")
    public void iProcessWithdrawMoney() throws InterruptedException {
        joinNowPages.WithdrawMoney();

    }

    @And("^I click wallet$")
    public void iClickWallet() throws InterruptedException {
        joinNowPages.Wallet();
    }

    @And("^I choose one option in three \"([^\"]*)\"$")
    public void iChooseOneOptionInThree(String option) throws Throwable {
        switch (option) {
            case "PlayNow":
                joinNowPages.PlayNow();
                Thread.sleep(2000);
                break;
            case "FundIn":
                joinNowPages.FundIn();
                Thread.sleep(2000);
                break;
            case "FundOut":
                joinNowPages.FundOut();
                Thread.sleep(2000);
                break;
        }
    }

    @And("^I view transaction report$")
    public void iViewTransactionReport() throws InterruptedException {
        joinNowPages.TransactionReport();
        Thread.sleep(2000);
    }
    @And("^I choose date from$")
    public void iChooseDateFrom() throws InterruptedException {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        c.set(2020, date.getMonth(), date.getDate());
        date = c.getTime();
        joinNowPages.choose_From(date.getYear(), date.getMonth(), date.getDate());
        Thread.sleep(2000);
    }

    @And("^I choose date to$")
    public void iChooseDateTo() throws InterruptedException {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        c.set(2020, date.getMonth(), date.getDate());
        date = c.getTime();
        joinNowPages.choose_To(date.getYear(), date.getMonth(), date.getDate()+3);
        Thread.sleep(2000);
    }

    @And("^I view tranfer report$")
    public void iViewTranferReport() throws InterruptedException {
        joinNowPages.TranferReport();
    }


    @And("^I view deposit & withdrawal history$")
    public void iViewDepositWithdrawalHistory() throws InterruptedException {
        joinNowPages.DepositAndWithdrawalHistory();
    }

    @And("^I send \"([^\"]*)\" code$")
    public void iSendCode(String code) throws Throwable {
        switch (code) {
            case "Code1":
                joinNowPages.ReferralCode(ReadProperties.getConfig("Code1"));
                Thread.sleep(2000);
                break;
            case "Code2":
                joinNowPages.ReferralCode(ReadProperties.getConfig("Code2"));
                Thread.sleep(2000);
                break;
            case "Null":
                joinNowPages.ReferralCode(ReadProperties.getConfig("Code3"));
                Thread.sleep(2000);
                break;
        }
    }
}
