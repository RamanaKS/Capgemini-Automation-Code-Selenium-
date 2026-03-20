package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSpidersForm {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        Thread.sleep(3000);

        driver.findElement(By.id("name")).sendKeys("Ramana");
        driver.findElement(By.id("email")).sendKeys("ramanasekar2004@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456", Keys.ENTER);
    }
}