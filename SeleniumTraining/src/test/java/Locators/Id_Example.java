package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Example { 
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://testfreshers.qspiders.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("standard-adornment-weight"));
        Thread.sleep(3000);
        
        driver.get("https://www.yahoo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("ybar-sbq"))
              .sendKeys("Selenium WebDriver", Keys.ENTER);
        Thread.sleep(3000);
       
        
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);
        driver.findElement(By.id("login1")).sendKeys("test");
        
        driver.get("https://duckduckgo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("searchbox_input"))
              .sendKeys("Automation", Keys.ENTER);
        
        driver.get("https://www.bing.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("sb_form_q"))
              .sendKeys("Selenium", Keys.ENTER);

//         YouTube
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("guide-button")).click();

        // Google
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("APjFqb"))
              .sendKeys("Selenium", Keys.ENTER);

        // Amazon
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Laptop", Keys.ENTER);

        // Wikipedia
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        driver.findElement(By.id("searchInput"))
              .sendKeys("India", Keys.ENTER);

        //  Gmail
        driver.get("https://accounts.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
        Thread.sleep(2000);


    }
}