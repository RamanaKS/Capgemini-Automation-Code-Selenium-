package WebDriverInterrogationMethods;

import java.time.Duration;
//import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// fetching the session ID using Getwindowhandles return single session ID
		String ParentsesID = driver.getWindowHandle();
		System.out.println(ParentsesID);
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();

		// fetching the session ids of multiple windows
//		LinkedHashSet<String> sessionIDs =(LinkedHashSet<String>) driver.getWindowHandles();
//		System.out.println(sessionIDs);
		Set<String> allIDs = driver.getWindowHandles();

		for (String id : allIDs) {
			driver.switchTo().window(id);

			String title = driver.getTitle();
			System.out.println("ID: " + id);
			System.out.println("Title: " + title);
			System.out.println("--------------------");
		}

	}
}
