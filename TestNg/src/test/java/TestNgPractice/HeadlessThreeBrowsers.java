package TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessThreeBrowsers {

    public static void main(String[] args) {

        // Headless Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver chrome = new ChromeDriver(chromeOptions);
        chrome.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Chrome Title: " + chrome.getTitle());
        chrome.quit();

        // Headless Edge
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--headless");
        WebDriver edge = new EdgeDriver(edgeOptions);
        edge.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Edge Title: " + edge.getTitle());
        edge.quit();

        // Headless Firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        WebDriver firefox = new FirefoxDriver(firefoxOptions);
        firefox.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Firefox Title: " + firefox.getTitle());
        firefox.quit();
    }
}
