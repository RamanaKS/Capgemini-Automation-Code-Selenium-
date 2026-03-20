package Recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Recruitment_AddCandidateAndVerifyTest {

	@Test
	public void testMethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Login with valid credentials
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Click Recruitment
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("Ranjith");
		driver.findElement(By.cssSelector("[placeholder=\"Middle Name\"]")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("A");
		WebElement vacancy = driver.findElement(By.cssSelector("[class=\"oxd-select-text-input\"]"));
		vacancy.click();
		Thread.sleep(3000);
		vacancy.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"))
				.sendKeys("ranjithkumar@gmail.com");
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("98429834");
		WebElement resume = driver.findElement(By.cssSelector("[class=\"oxd-file-input\"]"));
		resume.sendKeys("C:\\Users\\RAMANA\\Downloads\\Critical Reasoning.pptx.pdf");
		WebElement date = driver.findElement(By.cssSelector("[placeholder=\"yyyy-dd-mm\"]"));
		date.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		date.sendKeys("2026-01-14");
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
		driver.findElement(By.linkText("Candidates")).click();
		WebElement jobtitle = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		jobtitle.click();
		Thread.sleep(3000);
		jobtitle.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		WebElement vacancy1 = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]"));
		vacancy1.click();
		Thread.sleep(3000);
		vacancy1.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		WebElement manager = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[3]"));
		manager.click();
		Thread.sleep(3000);
		manager.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		WebElement status = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[4]"));
		status.click();
		Thread.sleep(3000);
		status.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		WebElement name = driver.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		name.sendKeys("Ranjith ");
		Thread.sleep(4000);
		name.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		driver.findElement(By.cssSelector("[placeholder=\"From\"]")).sendKeys("2026-10-01");
		driver.findElement(By.cssSelector("[placeholder=\"To\"]")).sendKeys("2026-15-01");
		driver.findElement(By.xpath("//button[.=' Search ']")).click();

	}
}
