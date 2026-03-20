package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTestCases {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[value='Search']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("Computer");
		driver.findElement(By.cssSelector("[value='Search']")).click();
		driver.quit();

	}
}
