package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class MouseHoverDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

        WebElement tools = driver.findElement(By.xpath("//button[text()='Automation Tools']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(tools).perform();


        List<WebElement> links = driver.findElements(By.cssSelector("div.dropdown-content>a"));


        int total_count = links.size();

        for(int i = 0; i < total_count; i++){

            WebElement ele = links.get(i);
            String text = ele.getAttribute("innerHTML");
            boolean status = ele.isEnabled();
            System.out.println("Links name is: " + text + " and Links status is: "+ status);

            if (text.equalsIgnoreCase("Appium")){
                ele.click();
                break;
            }

        }




    }
}
