package Selenium_Training_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrave {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }
}