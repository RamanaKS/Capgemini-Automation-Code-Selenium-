package Selenium_Training_Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTestCasesFornavigation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String ParentsesID = driver.getWindowHandle();
		System.out.println(ParentsesID);
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allIDs = driver.getWindowHandles();
		for (String id : allIDs) {
			driver.switchTo().window(id);

			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(url.contains("YouTube"))
			{
				driver.findElement(By.name("search_query")).sendKeys("pookal pookum song", Keys.ENTER);
				driver.findElements(By.id("video-title")).get(0).click();
			}
		}
		for (String id : allIDs) {
			driver.switchTo().window(id);

			String url = driver.getCurrentUrl();
			if(!url.contains("YouTube"))
			{
				driver.close();
			}
		}
		

	}
}
