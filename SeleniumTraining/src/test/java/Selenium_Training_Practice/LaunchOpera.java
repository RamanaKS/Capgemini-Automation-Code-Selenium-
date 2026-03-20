package Selenium_Training_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchOpera {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Opera browser path
        options.setBinary("C:\\Program Files\\Opera\\opera.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com");
    }
}