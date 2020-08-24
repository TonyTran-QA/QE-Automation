package com.qa.Pages;

import com.qa.Pages.HandleException.MyPageFactory;
import com.qa.managers.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Set;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }

    public BasePage() {

    }

    //Click Method
    public void clickAndWait(WebElement element) {

        System.out.println("Click on -[" + element.getText() + "]- and wait !!!");
        element.click();
        Wait.untilPageLoadComplete(driver);


    }

    //Write Text
    public void writeText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText(By elementLocation) {
        return driver.findElement(elementLocation).getText().trim();
    }

    public int getNumberOf(WebElement webElement) {
        String chuoiCanLaySo = webElement.getText();
        String numberOnly = chuoiCanLaySo.replaceAll("[^0-9]", "").trim();
        if (numberOnly.equalsIgnoreCase("")) throw new RuntimeException("WebElement don't have a number");
        else return Integer.parseInt(numberOnly);
    }

    public void select_itemOf(List<WebElement> list, String textToSelected) {
        for (WebElement element : list) {
            if (element.getText().trim().equalsIgnoreCase(textToSelected)) {
                element.click();
                break;
            }
        }
    }

    String select_itemOf(List<WebElement> list, int index) {
        String result = list.get(index).getText();
        list.get(index).click();
        return result;
    }

    public WebDriver switchToWindowHandle() {
        String winHandleBefore = this.driver.getWindowHandle();
        for (String winHandle : this.driver.getWindowHandles()) {
            if (!winHandle.equals(winHandleBefore)) {
                this.driver.switchTo().window(winHandle);
            } else {
                this.driver.switchTo().window(winHandleBefore);
            }
        }
        return this.driver;
    }
    public void SwitchToWindow() throws InterruptedException {
        for (String popup : driver.getWindowHandles()) {
            driver.switchTo().window(popup);
            Thread.sleep(2000);
        }
    }

//    public WebDriver getDriver() {
//        return driver;
//    }

}