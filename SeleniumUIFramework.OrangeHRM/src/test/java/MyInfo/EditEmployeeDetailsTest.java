package MyInfo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditEmployeeDetailsTest {

    @Test
    public void testMethod() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
     // Click My Info
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        Thread.sleep(4000);
        // Edit First Name
        driver.findElement(By.name("firstName")).sendKeys(Keys.CONTROL+"a",Keys.DELETE);
        driver.findElement(By.name("firstName")).sendKeys("Ramana");
        // Edit Last Name
        driver.findElement(By.name("lastName")).sendKeys(Keys.CONTROL+"a",Keys.DELETE);
        driver.findElement(By.name("lastName")).sendKeys("K S");
        // Edit Employee ID
        driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div//input")).sendKeys(Keys.CONTROL+"a",Keys.DELETE);
        driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div//input")).sendKeys("2257");
        // Click Save
        driver.findElement(By.xpath("//button[.=' Save ']")).click();
        Thread.sleep(2000);
        // Logout
        driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
        driver.findElement(By.linkText("Logout")).click();
        // Login again
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Go to My Info again
        driver.findElement(By.xpath("//span[text()='My Info']")).click();

        Thread.sleep(2000);

        // Verify updated details
        String firstName = driver.findElement(By.name("firstName")).getAttribute("value");

        if(firstName.equals("Ramana")) {
            System.out.println("Employee details updated successfully");
        } else {
            System.out.println("Employee details not updated");
        }

        // Logout
        driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
        driver.findElement(By.linkText("Logout")).click();

        driver.quit();
    }
}