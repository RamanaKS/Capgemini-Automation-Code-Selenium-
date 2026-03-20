package Selenium_Training_Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesNo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button")).click();
		WebElement dropdown = driver.findElement(By.xpath("((//div[@class='oxd-select-text-input'])[1])"));
		dropdown.click();
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);
		if (dropdown.getText().contains("Admin"))
			System.out.println("Verified");
		dropdown.click();
		dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);
		if (dropdown.getText().contains("ESS"))
			System.out.println("Second  verfied");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();
		driver.quit();
	}

}