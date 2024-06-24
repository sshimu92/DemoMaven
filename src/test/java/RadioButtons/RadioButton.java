package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class RadioButton {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[@class='btn btn-light btn-block'][@href='radio_buttons.html']")).click();

        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total radio stations: "+ radio.size());

        for(WebElement radioElement : radio) {
            String value = radioElement.getAttribute("value");
            System.out.println("Values from radio buttons are: "+ value);

            if(value.equalsIgnoreCase("polskieradio"));{
                radioElement.click();
            }

//            driver.quit();
        }




    }

}
