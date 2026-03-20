package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurrounding {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Show details for 14.1-inch Laptop']/../..//input[@type='button']"))
				.click();
	}
}
