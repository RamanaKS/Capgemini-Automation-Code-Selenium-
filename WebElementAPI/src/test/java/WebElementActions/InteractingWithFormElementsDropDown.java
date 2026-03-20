package WebElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithFormElementsDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
//		driver.findElement(By.id("Skills")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[value='C']")).click();
		
		WebElement skills=driver.findElement(By.id("Skills"));
		skills.click();
		skills.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
}
}