package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        // Click link using exact text
        driver.findElement(By.linkText("Downloads")).click();

        driver.quit();
    }
}