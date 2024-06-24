package HandlingTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import java.util.List;

import static utility.ReusableCode.driver;

public class HandlingTableDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("https://www.globalsqa.com/demo-site/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

        driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();

        List<WebElement> datePicker = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        int total_Count = datePicker.size();
        System.out.println("Total Count: " + total_Count);

        for(int i=0; i < total_Count; i++){

            String dates = datePicker.get(i).getText();

            System.out.println("Dates: "+ dates);

            if(dates.equalsIgnoreCase("12")){

                datePicker.get(i).click();
                break;
            }

        }

    }

}
