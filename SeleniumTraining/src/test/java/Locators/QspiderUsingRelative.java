package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class QspiderUsingRelative {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	     Thread.sleep(4000);
	     WebElement nameField = driver.findElement(By.id("name"));
	     nameField.sendKeys("Ramana");

	     Thread.sleep(3000);

	     driver.findElement(
	             RelativeLocator.with(By.tagName("input")).below(nameField)).sendKeys("ramana@gmail.com");

	     Thread.sleep(3000);
	     driver.findElement(
	             RelativeLocator.with(By.tagName("input"))
	                     .below(driver.findElement(
	                             RelativeLocator.with(By.tagName("input")).below(nameField)
	                     ))).sendKeys("Ramana");
	
	    

	     driver.findElement(
	             RelativeLocator.with(By.tagName("button")).below(nameField)
	     ).click();
	     
}
}
