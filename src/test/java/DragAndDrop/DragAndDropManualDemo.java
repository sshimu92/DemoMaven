package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import java.time.Duration;

import static utility.ReusableCode.driver;

public class DragAndDropManualDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Actions actions = new Actions(driver);

        WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Lawrence Block')]"));
        WebElement dest = driver.findElement(By.xpath("//li[contains(text(),'Zend Framework in Action')]"));

        actions.sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofSeconds(2))
                .clickAndHold(src)
                .pause(Duration.ofSeconds(2))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(2))
                .release()
                .build()
                .perform();




    }

}
