package com.qa.managers;

import com.qa.Pages.*;
import com.qa.newpages.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectManager {
    private WebDriverWait wait;
    private WebDriver driver;
    private BasePage basePage;
    private AccPage accPage;

    private LoginPages loginPages;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public void WebDriverManager(WebDriver driver){
        this.driver=driver;
    }

    public BasePage getBasePage(){
        return (basePage == null) ? basePage = new BasePage(driver,wait) : basePage;
    }

    public AccPage getAccPage(){
        return (accPage == null) ? accPage = new AccPage(driver) :accPage;
    }
   public LoginPages getLoginPages(){
        return (loginPages==null)? loginPages = new LoginPages(driver): loginPages;

   }
}
