package com.qa.Pages.HandleException;

import com.qa.managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class ElementProxy implements InvocationHandler {
    private final WebElement element;
    private final WebDriver driver;

    public ElementProxy(WebElement element, WebDriver driver) {
        this.element = element;
        this.driver = driver;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //before invoking actual method check for the popup
        this.checkForPopupAndKill();
        //at this point, popup would have been closed if it had appeared. element action can be called safely now.
        Object result = method.invoke(element, args);
        return result;
    }

    public void checkForPopupAndKill() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int x = driver.findElements(By.cssSelector(".ematicOverlayContent.ematicOverlayContent0")).size();
        if (x > 0) {
            if (driver.findElement(By.cssSelector(".ematicOverlayContent.ematicOverlayContent0")).isDisplayed()) {
                System.out.println("Tim thay cai popup, damn!!!!" + driver.findElements(By.cssSelector(".ematicOverlayContent.ematicOverlayContent0")).size());
                driver.findElement(By.cssSelector("#ematic_closeExitIntentOverlay_1_xl_1_2")).click();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
    }


}