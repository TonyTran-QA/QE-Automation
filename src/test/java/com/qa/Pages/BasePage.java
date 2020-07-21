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
    public BasePage(WebDriver driver1, WebDriverWait wait) {
        this.driver = driver1;
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

    void select_itemOf(List<WebElement> list, String textToSelected) {
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
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            if (!winHandle.equals(winHandleBefore)) {
                driver.switchTo().window(winHandle);
            } else {
                driver.switchTo().window(winHandleBefore);
            }
        }
        return driver;
    }

    public void switchToWindow() {

        String parentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                driver.close();
                driver.switchTo().window(parentWindow);
            }
        }

    }
    public WebDriver getDriver() {
        return driver;
    }

}