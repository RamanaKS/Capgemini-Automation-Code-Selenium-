package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsOnHrm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		// login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		Thread.sleep(9000);
//     recuritment
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button' and contains( .,'Add')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ramana");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K S");
		driver.findElement(By.xpath("//label[.='Contact Number']/../..//input[@placeholder='Type here']"))
				.sendKeys("456789");
		driver.findElement(By.xpath("//label[.='Email']/../..//input[@placeholder='Type here']"))
				.sendKeys("ramana@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Ramana  K S')]/../../../..//i[@class='oxd-icon bi-trash']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Yes, Delete')]")).click();

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//label[.='Employee Name']/following::div/following::input[@placeholder='Type for hints...']"))
				.sendKeys("albert");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//label[.='Employee Name']/following::div/following::input[@placeholder='Type for hints...']"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By
				.xpath("//label[.='Employee Name']/following::div/following::input[@placeholder='Type for hints...']"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By
				.xpath("//label[.='Employee Name']/following::div/following::input[@placeholder='Type for hints...']"))
				.click();
		driver.findElement(By.xpath("//button[.=' Search ']")).click();

	}
}
