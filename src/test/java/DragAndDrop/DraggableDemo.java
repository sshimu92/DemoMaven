package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
//import utility.ReusableCode;

//import static utility.ReusableCode.driver;

public class DraggableDemo {

    public static void main(String[] args) {

//        ReusableCode.driverSetup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

        Actions actions = new Actions(driver);

        WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));

        actions.pause(Duration.ofSeconds(2)).dragAndDropBy(src, 194, 36).perform();

    }
}