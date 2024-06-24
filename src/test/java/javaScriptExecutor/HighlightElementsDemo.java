package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import static javaScriptExecutor.JavaScriptUtility.highLightElement;
import static utility.ReusableCode.driver;

public class HighlightElementsDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("https://www.facebook.com/");

        WebElement userName = driver.findElement(By.id("email"));

        try {
            highLightElement(driver,userName);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }


    }


}
