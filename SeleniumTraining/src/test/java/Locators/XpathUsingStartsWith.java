package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingStartsWith {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		// Close Login Popup using contains(text())
		driver.findElement(By.xpath("//span[starts-with(text(),'✕')]")).click();

		Thread.sleep(2000);

		// Click Search Box using contains(attribute)
		driver.findElement(By.xpath("//input[starts-with(@class,'nw1UBF')]")).sendKeys("toys");

		Thread.sleep(2000);

		// Click Search Button using contains(attribute)
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		driver.quit();
	}
}
