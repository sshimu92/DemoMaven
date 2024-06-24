package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class DropDown {


    public static void main(String[] args) {


        ReusableCode.driverSetup();
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

        List<WebElement> ele = driver.findElements(By.cssSelector("select#tools>option"));
        System.out.println("Total: "+ele.size());

        for(WebElement tools : ele){
            String names = tools.getAttribute("value");
            System.out.println("Sorted tools are: "+ names);
        }

        Select sc = new Select(driver.findElement(By.id("tools")));
        sc.selectByVisibleText("Cucumber");

        List<WebElement> notSorted = driver.findElements(By.cssSelector("select#tools1>option"));
        System.out.println("Total: "+notSorted.size());

        for(WebElement tools1 : notSorted){
            String names1 = tools1.getAttribute("value");
            System.out.println("Not sorted tools are: "+ names1);
        }

        Select sc1 = new Select(driver.findElement(By.id("tools1")));
        sc1.selectByVisibleText("Selenium");

        System.out.println("Test Successful");

    }

}
