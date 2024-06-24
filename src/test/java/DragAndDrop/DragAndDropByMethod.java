package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import java.time.Duration;

import static utility.ReusableCode.driver;

public class DragAndDropByMethod {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Actions actions = new Actions(driver);

        WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Ian Rankin')][@class='dhx_tree-list-item__text']"));
        WebElement dest = driver.findElement(By.xpath("//li[@class='dhx_list-item dhx_list-item--drag'][contains(text(),'Zend Framework in Action')]"));


        actions.sendKeys(Keys.PAGE_DOWN).pause(Duration.ofSeconds(2)).dragAndDrop(src, dest).perform();

    }

}
