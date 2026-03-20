package WebDriverInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		String expectedUrl = "https://www.amazon.com/";
		String actualUrl = driver.getCurrentUrl();

		System.out.println("Actual URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("URL Verified - PASS");
		} else {
			System.out.println("URL Verified - FAIL");
		}

		driver.quit();
	}
}
