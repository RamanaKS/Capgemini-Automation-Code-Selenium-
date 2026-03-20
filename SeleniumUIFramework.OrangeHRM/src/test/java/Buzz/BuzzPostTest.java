package Buzz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuzzPostTest {

	@Test
	public void testMethod() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Click Buzz
		driver.findElement(By.xpath("//span[text()='Buzz']")).click();
		Thread.sleep(2000);
		String postMessage = "Automation testing post";
		driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys(postMessage);
		// Click Post
		driver.findElement(By.xpath("//button[normalize-space()='Post']")).click();
		Thread.sleep(3000);
		// Verify post in recent posts
		String recentPost = driver
				.findElement(By.xpath("(//div[@class=\"orangehrm-buzz-post-body\"])[1]")).getText();

		if (recentPost.contains(postMessage)) {
			System.out.println("Post added successfully");
		} else {
			System.out.println("Post not added");
		}
		// Logout
		driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
		driver.findElement(By.linkText("Logout")).click();

		driver.quit();
	}
}