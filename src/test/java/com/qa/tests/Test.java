package com.qa.tests;


import com.qa.videoreport.VideoRecorder_utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws Exception {

        VideoRecorder_utlity.startRecord("Test");
        System.setProperty("webdriver.chrome.driver", "D:\\OutsourceExpect\\execute\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        String URL = "http://app-demo.uwin29.asia/login";
        driver.navigate().to(URL);
        Thread.sleep(5000);
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        String winHanaleBefore = driver.getWindowHandle();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
        element.click();
        driver.switchTo().window(winHanaleBefore);
//        element.sendKeys("qa102");

//        WebElement element1 = driver.findElement(By.id("Password"));
//        element1.sendKeys("123456");
//
//        WebElement element2 = driver.findElement(By.id("SecurityCode"));
//        element2.sendKeys("赌场大堂");
//
//        WebElement element3 = driver.findElement(By.className("sign_in"));
//        element3.click();
//        Thread.sleep(5000);
//
//        for (String popup : driver.getWindowHandles()) {
//            driver.switchTo().window(popup);
//            WebElement btnclosee = driver.findElement(By.xpath("(//div[@class='modal-header']//button[@class='close'])[1]"));
//            btnclosee.click();
//            Thread.sleep(5000);
//        }
//
//        WebElement game = driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/a"));
//        actions.moveToElement(game).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav_mn\"]/ul/li[2]/ul/li[1]/ul/li[1]/a/img"))).click().build().perform();
//        Thread.sleep(5000);
//
//        VideoRecorder_utlity.stopRecord();
//        driver.quit();

    }

}





