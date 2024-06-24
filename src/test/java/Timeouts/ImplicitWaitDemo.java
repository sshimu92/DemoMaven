package Timeouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ImplicitWaitDemo { //Global time wait.

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--window-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deb.nexxvali@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("deb.nexxvali@gmail.com");
        driver.findElement(By.xpath("//button[@name='login']")).click();


        driver.quit();


    }

}
