package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App {

    public static void main(String[] args ) {

        System.out.println( "Hello World!" );

        WebDriver driver = new ChromeDriver();
        driver.get("https://chatgpt.com/?oai-dm=1");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());
        driver.quit();
    }

}

