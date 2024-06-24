package HandlingHIddenElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class FindHiddenElementsDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

        List<WebElement> radio = driver.findElements(By.id("male"));

        int count = radio.size();

        System.out.println("Total Radio Buttons are: "+ count);


        for(int i=0; i < count; i++){

            int x = radio.get(i).getLocation().getX();
            System.out.println("Value of X: "+ x);

            if(x != 0){

                radio.get(i).click();
                break;
            }

        }

    }

}
