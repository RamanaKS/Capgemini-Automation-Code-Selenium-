package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_get_method {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	driver.get("https://www.youtube.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
