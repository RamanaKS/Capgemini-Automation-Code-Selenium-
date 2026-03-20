package Selenium_Training_Practice;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement val : links) {
            System.out.println(val.getText());
            if (val.getText().equals("About")) {
                val.click();
                break;
            }
        }
    }
}