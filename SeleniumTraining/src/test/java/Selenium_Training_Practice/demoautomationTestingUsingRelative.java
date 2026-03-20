package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class demoautomationTestingUsingRelative {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://demo.automationtesting.in/Register.html");
	        Thread.sleep(2000);

	        WebElement firstNameTF = driver.findElement(
	                By.cssSelector("[placeholder='First Name']")
	        );
	        firstNameTF.sendKeys("Ramana");

	        WebElement lastNameTF = driver.findElement(
	                RelativeLocator.with(By.tagName("input"))
	                .toRightOf(firstNameTF)
	        );
	        lastNameTF.sendKeys("K S");

	        WebElement addressTF = driver.findElement(
	                RelativeLocator.with(By.tagName("textarea"))
	                .below(lastNameTF)
	        );
	        addressTF.sendKeys("Chennai");

	        Thread.sleep(3000);
	        //driver.quit();
	    }
}
