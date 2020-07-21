package com.qa.Pages.HandleException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Proxy;

public class ElementGuard {
    public static WebElement guard(WebElement element, WebDriver driver) {
        ElementProxy proxy = new ElementProxy(element,  driver);
        WebElement wrappdElement = (WebElement) Proxy.newProxyInstance(ElementProxy.class.getClassLoader(),
                new Class[] { WebElement.class }, proxy);
        return wrappdElement;
    }


}
