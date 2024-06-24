package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {

    public static WebDriver driver;

    public static void screenShots(String filePath){

        TakesScreenshot screenshot = ((TakesScreenshot) driver);

        File source = screenshot.getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(source, new File(filePath));

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
