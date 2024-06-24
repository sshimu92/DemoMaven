package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import static utility.ReusableCode.driver;

public class DoubleClickDemo {

    public static void main(String[] args) throws InterruptedException {

        ReusableCode.driverSetup();

        driver.get("https://api.jquery.com/dblclick/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        Actions actions = new Actions(driver);

        actions.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();

        Thread.sleep(3000);

        System.out.println("Yeeee I double cliked the element !!! wowww !!!");
        driver.quit();

    }

}
