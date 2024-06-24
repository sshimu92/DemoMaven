package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class OldDropdownExample {

    public static void main(String[] args) {

        ReusableCode.driverSetup();
        driver.get("https://demoqa.com/select-menu");

        List<WebElement> ele = driver.findElements(By.cssSelector("select#oldSelectMenu>option"));
        System.out.println("Colors are: "+ ele.size());

        for(WebElement names : ele){
            String colors = names.getText();
            System.out.println("Name of the colors are: "+ colors);
        }

         Select sc = new Select(driver.findElement(By.id("oldSelectMenu")));
          sc.selectByIndex(5);



    }

}
