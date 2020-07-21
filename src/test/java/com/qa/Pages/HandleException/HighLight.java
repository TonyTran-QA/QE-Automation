package com.qa.Pages.HandleException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight {
    public void highLight (WebDriver driver , WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",element);
    }
}
//        WebElement searchKey = driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
//        searchKey.sendKeys("Outsource Expect");
//        Test d = new Test();
//        d.highLight(driver, searchKey);
//        Thread.sleep(10000);
//        File scrFile = ((TakesScreenshot) driver)
//                .getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("pathTOSaveFile"));
//        System.out.println("Run Success");
//        driver.quit();