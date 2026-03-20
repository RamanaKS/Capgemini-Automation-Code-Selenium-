package Selenium_Training_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseNo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Set<String> window = driver.getWindowHandles();
		window.remove(parent);
		for (String childId : window) {
			driver.switchTo().window(childId);
		}
		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains("orangehrm")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		 if(driver.getTitle()!=null)
		 {
			 System.out.println("title is present");
		 }
		 else
		 {
			 System.out.println("title is not present");
		 }
		 driver.close();
		 driver.switchTo().window(parent);
		 if (driver.getCurrentUrl().contains("orangehrmlive.com/web/index.php/auth/login")) {
				System.out.println("login page in open");
			} else {
				System.out.println("Fail");
			}
		 driver.quit();
				
}
}
