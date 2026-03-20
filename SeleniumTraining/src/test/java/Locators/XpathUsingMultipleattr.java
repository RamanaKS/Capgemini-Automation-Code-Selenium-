package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingMultipleattr {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// Close Login Popup using contains(text())
		driver.findElement(By.partialLinkText("DIGITAL")).click();
//	        driver.findElement(By.xpath("//a[contains(@href,'/digital-downloads')and @class ='top-menu']"))
//            .click();

		Thread.sleep(2000);
	}
}
