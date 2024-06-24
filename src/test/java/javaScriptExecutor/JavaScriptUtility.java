package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

    public static void highLightElement(WebDriver driver, WebElement element) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver; //downcast

        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');", element);


        Thread.sleep(500);

        js.executeScript("arguments[0].setAttribute('style','border: solid 3px blue');", element);
    }

}
