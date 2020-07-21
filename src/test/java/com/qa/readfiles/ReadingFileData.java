package com.qa.readfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReadingFileData {
    public static void main(String[] args) throws IOException {
        String File = "src/test/java/com/qa/readfiles/file/file.txt";
        FileReader FR = new FileReader(File);
        BufferedReader BR = new BufferedReader(FR);
        String content;
        while ((content = BR.readLine()) != null) {
            System.out.println(content);
            System.setProperty("webdriver.chrome.driver", "execute/chromedriver1.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://www.vega19.com/");
            System.out.println(driver.getTitle());



        }


    }
}


