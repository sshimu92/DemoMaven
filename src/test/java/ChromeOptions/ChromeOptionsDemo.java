package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Add chrome switch to disable browser notification
        options.addArguments("--disable-notifications");

        // Add chrome switch to start browser in maximized mode
        options.addArguments("--start-maximized");

        // Add chrome switch to disable browser's info bar
        options.addArguments("disable-infobars");

        // Add chrome switch to set browser language (here setting as Bangla)
        options.addArguments("--lang=en");

        // Add chrome switch to ignore SSL errors
        options.addArguments("--ignore-certificate-errors");

        // Add chrome switch to disable tooltips
        options.addArguments("--disable-popup-blocking");

        // Add chrome switch to run browser in headless mode
        options.addArguments("--headless");

        // Add chrome switch to disable sandbox
        options.addArguments("--no-sandbox");

        // Add chrome switch to overcome limited resource problems
        options.addArguments("--disable-dev-shm-usage");

        // Add chrome switch to set initial window size
        options.addArguments("--window-size=1024,768");

        // Add chrome switch to open browser in incognito mode
        options.addArguments("--incognito");

        // Add chrome switch to set proxy server
        // Remember to replace host:port with your actual proxy server details if you're using the --proxy-server option.
        options.addArguments("--proxy-server=host:port");

        // Add chrome switch to disable GPU
        options.addArguments("--disable-gpu");

        // options.addExtensions(new File("")) add path of a extension.

        WebDriver driver = new ChromeDriver(options);




    }

}
