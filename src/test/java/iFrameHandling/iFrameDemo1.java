package iFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import static utility.ReusableCode.driver;

public class iFrameDemo1 {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("C:\\Users\\shimu\\IdeaProjects\\DemoMaven\\src\\main\\java\\iFrameHandling\\iframe.html");

        int numberOfiFrames = driver.findElements(By.tagName("iframe")).size();
        System.out.printf("Number of iFrames:" + numberOfiFrames);

        driver.switchTo().frame("selenium");

        driver.findElement(By.xpath("//button[@id='genesis-mobile-nav-primary']")).click();

        driver.switchTo().defaultContent();

        WebElement lastiFrame = driver.findElement(By.xpath("//iframe[@title='selenium_news']"));

        driver.switchTo().frame(lastiFrame);

        driver.findElement(By.xpath("//*[@type='button'][@class='navbar-toggler']")).click();

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[contains(text(),'Click here for Selenium tutorial ')]")).click();



    }

}
