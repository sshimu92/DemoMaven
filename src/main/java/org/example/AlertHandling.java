package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import static utility.ReusableCode.driver;

public class AlertHandling {

    public static void main(String[] args) throws InterruptedException {

        ReusableCode.driverSetup();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]")).click();
        Thread.sleep(2000);

        Alert alertElement = driver.switchTo().alert();

        System.out.printf(alertElement.getText());

        alertElement.accept();




    }

}
