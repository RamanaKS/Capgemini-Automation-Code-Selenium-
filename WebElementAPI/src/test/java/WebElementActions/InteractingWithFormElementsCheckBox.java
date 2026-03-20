package WebElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithFormElementsCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement movie= driver.findElement(By.id("checkbox2"));
		movie.click();
		Thread.sleep(2000);
		movie.click();
		driver.quit();
		
}
}
