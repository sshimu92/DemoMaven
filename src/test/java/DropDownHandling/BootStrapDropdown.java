package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class BootStrapDropdown {

    public static void main(String[] args) {

        ReusableCode.driverSetup();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

        driver.findElement(By.xpath("//button[@id='menu1']")).click();

        List<WebElement> dropDownMenu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement ele : dropDownMenu) {

            String innerHtml = ele.getAttribute("innerHTML");
            System.out.println("Dropdown Elements are : "+ innerHtml);

        }

        for(WebElement ele : dropDownMenu) {
            String innerHtml = ele.getAttribute("innerHTML");

            if(innerHtml.equalsIgnoreCase("JavaScript")){
                ele.click();
                break;
            }
        }

        driver.quit();
    }

}
