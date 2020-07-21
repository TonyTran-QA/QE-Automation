package com.qa.screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility
{
    public static void captureScreenshot(String fileName,WebDriver driver)
    {
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
            Date date = new Date();
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            fileName="Erros";
            FileUtils.copyFile(scrFile, new File("src/test/java/com/qa/screenshot/imgfailed/"+fileName+"-"+dateFormat.format(date)+".png"));
            System.out.println("Screenshot taken");
        }
        catch (Exception e)
        {
            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
    }
}
