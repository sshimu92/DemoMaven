package VerifyLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.ReusableCode;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static utility.ReusableCode.driver;

public class VerifyLinkDemo {

    public static void main(String[] args) {

        ReusableCode.driverSetup();

        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total Links are: " + links.size());

        for (int i = 0; i < links.size(); i++) {

            WebElement ele = links.get(i);

            String url = ele.getAttribute("href");

            verifyLinkActive(url);

        }

    }

    public static void verifyLinkActive(String linkUrl) {

        try{
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.setConnectTimeout(3000);

            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200){

                System.out.println(linkUrl + "  " + httpURLConnection.getResponseMessage());

            }
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND){

                System.out.println(linkUrl + "  " + httpURLConnection.getResponseMessage() + "  " + httpURLConnection.getResponseMessage());
            }

        }catch (Exception e){
            System.out.println("Exception coming from verifylink method:  " + e.getMessage());
        }

    }

}
