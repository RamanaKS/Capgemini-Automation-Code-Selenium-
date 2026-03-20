package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.findElement(By.partialLinkText("Compute")).click();
        Thread.sleep(2000);

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.className("ico-register")).click();
    }
}