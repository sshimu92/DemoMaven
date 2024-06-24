package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import java.time.Duration;

import static utility.ReusableCode.driver;

public class KeyboardEventsDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();
        driver.get("https://www.google.com/");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//textarea[@id='APjFqb']")))
                .pause(Duration.ofSeconds(2))
                .sendKeys("Nexxvali")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ARROW_DOWN)
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ENTER)
                .build()
                .perform();




    }
}