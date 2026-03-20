package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttrinbute {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Easter decor']")).click();
	}
}