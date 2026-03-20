package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(4000);
	     //login
	     WebElement searchBox = driver.findElement(By.id("small-searchterms"));

	        WebElement elementAbove = driver.findElement(
	                RelativeLocator.with(By.tagName("input")).above(searchBox)
	        );
	        Thread.sleep(4000);

	        searchBox.sendKeys("Laptop");

	   
}
}
