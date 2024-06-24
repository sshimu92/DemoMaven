package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://qbek.github.io/selenium-exercises/en/");

        driver.findElement(By.xpath("//a[@href='check_boxes.html']")).click();

        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@class='form-check-input']"));
        System.out.println("Total number of check boxes are: "+ checkBox.size());

        for(WebElement ckBox : checkBox){
            String color = ckBox.getAttribute("name");
            System.out.println("Checkboxes are:"+ color);

            if(color.equalsIgnoreCase("green")){
                ckBox.click();


            }

        }

       driver.quit();

    }

}
