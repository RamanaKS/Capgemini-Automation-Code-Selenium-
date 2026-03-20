package Notification_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("browNotButton")).click();
		
		
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(3000);
		driver1.findElement(By.id("browNotButton")).click();
		//https://peter.sh/experiments/chromium-command-line-switches/            
		
}
}