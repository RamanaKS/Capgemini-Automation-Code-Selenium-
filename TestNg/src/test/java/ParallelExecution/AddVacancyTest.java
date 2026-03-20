package ParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddVacancyTest {
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
		// Click Vacancies
		driver.findElement(By.linkText("Vacancies")).click();
		// Click Add button
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		// Enter Vacancy Name
		 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))
				.sendKeys("Automation Tester Vacancy");
		// Select Job Title
		// Click Job Title dropdown
		 WebElement ele1=driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text')]"));
		 ele1.click();
		 // Wait a moment (dropdown loads)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='listbox']//span[contains(.,'Account Assistant')]")).click();
		// Select Automation Tester
		//driver.findElement(By.xpath("//span[text()='Automation Tester']")).click();
		// Enter Description
		driver.findElement(By.cssSelector("[placeholder='Type description here']"))
				.sendKeys("Automation Testing vacancy position");
		// Enter Hiring Manager
		WebElement ele=driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		ele.sendKeys("john ");
		Thread.sleep(3000);
		ele.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		// Enter Number of Positions
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("2");
		// Click Save
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
	}
}
