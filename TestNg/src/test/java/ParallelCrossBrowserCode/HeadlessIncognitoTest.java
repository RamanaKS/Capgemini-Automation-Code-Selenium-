package ParallelCrossBrowserCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HeadlessIncognitoTest {

    WebDriver driver;

    @Test
    @Parameters("browser")
    public void loginTest(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--incognito");

            driver = new ChromeDriver(options);

        } 
        else if (browser.equalsIgnoreCase("edge")) {

            EdgeOptions options = new EdgeOptions();
            options.addArguments("--headless");
            options.addArguments("--inprivate");

            driver = new EdgeDriver(options);

        } 
        else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-headless");
            options.addArguments("-private");

            driver = new FirefoxDriver(options);
        }

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println(browser + " Title: " + driver.getTitle());

        driver.quit();
    }
}