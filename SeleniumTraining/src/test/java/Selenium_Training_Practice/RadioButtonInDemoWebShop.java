package Selenium_Training_Practice;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement val : radio) {
			val.click();
			Thread.sleep(2000);
		}
	}
}