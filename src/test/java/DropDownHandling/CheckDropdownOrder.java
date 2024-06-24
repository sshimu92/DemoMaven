package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.ReusableCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utility.ReusableCode.driver;

public class CheckDropdownOrder {

    public static void main(String[] args) {

        ReusableCode.driverSetup();
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

        Select tools = new Select(driver.findElement(By.id("tools1")));

        List<WebElement> myTools = tools.getOptions();

        List<String> actualList = new ArrayList<>();

        for(WebElement ele : myTools ){

            actualList.add(ele.getText());
        }

        List<String> expectedList = new ArrayList<>(actualList);

        Collections.sort(expectedList);

        if(actualList.equals(expectedList)){

            System.out.println("Sorted");

        }else{
            System.out.println("Not Sorted");
        }

    }

}
