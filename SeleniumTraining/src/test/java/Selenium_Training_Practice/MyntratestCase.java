package Selenium_Training_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntratestCase {
	public static void main(String[] args) throws InterruptedException {
		// step1 launch the browser
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/?utm_source=gh_ht&utm_medium=ht_rev&utm_campaign=gh_ht_listicle50j&gad_source=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Dress",
				Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class=\"product-base\"]//child::img")).click();
		String parent = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		window.remove(parent);
		for (String childId : window) {
			driver.switchTo().window(childId);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
		Thread.sleep(4000);
		if (driver.findElement(By.xpath("//div[text()='Login ']")).isDisplayed()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8667363855");
		driver.findElement(By.xpath("//div[@class=\"consentContainer\"]//child::input")).click();
		driver.findElement(By.xpath("//div[.='CONTINUE']")).click();

	}
}
