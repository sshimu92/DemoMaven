package MultipleWindow;

import org.openqa.selenium.By;
import utility.ReusableCode;

import java.util.Set;

import static utility.ReusableCode.driver;

public class MultipleWindowHandling {

    public static void main(String[] args) throws InterruptedException {

        ReusableCode.driverSetup();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");

        String parent = driver.getWindowHandle();
        System.out.println("Parent window id is: "+ parent);

        driver.findElement(By.xpath("//a[@href=\"//www.google.com\"]")).click();

        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total window: "+ count);

        for(String child : allWindows){

            if(!parent.equalsIgnoreCase(child)){

                driver.switchTo().window(child);

                driver.findElement(By.id("APjFqb")).sendKeys("What is the weather today?");
                Thread.sleep(3000);

                driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")).click();
                Thread.sleep(5000);

                driver.close();

            }

        }



    }


}
