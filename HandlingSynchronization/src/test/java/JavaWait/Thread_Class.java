package JavaWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Class {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(3000,2000);
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(Duration.ofSeconds(10));
		driver.quit();
	}
}
