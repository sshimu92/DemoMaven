package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import static utility.ReusableCode.driver;

public class RightClickDemo {

    public static void main(String[] args) throws InterruptedException {

        ReusableCode.driverSetup();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'copy')]")).click();
        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.quit();

    }

}
