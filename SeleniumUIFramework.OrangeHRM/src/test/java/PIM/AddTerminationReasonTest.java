package PIM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddTerminationReasonTest {
	@Test
	public void testMethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Login with valid credentials
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		driver.findElement(By.cssSelector("span[class=\"oxd-topbar-body-nav-tab-item\"]")).click();
		driver.findElement(By.linkText("Termination Reasons")).click();
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"))
				.sendKeys("Summa Fun dhan hello updated2111111");
		driver.findElement(
				By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"))
				.click();
		Thread.sleep(4000);
		List<WebElement> verify = driver.findElements(By.xpath("//div[@role='row']//div[2]"));
		boolean flag = false;
		for (WebElement reason : verify) {
			if (reason.getText().contains("Summa Fun dhan hello updated2111111")) {
				flag = true;
				break;
			}

		}
		if (flag)
			System.out.println("Termination reason is added");
		else
			System.out.println("Termination not added");
//		driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
//		driver.findElement(By.linkText("Logout")).click();

	}
}
