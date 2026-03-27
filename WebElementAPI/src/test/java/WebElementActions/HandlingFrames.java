package WebElementActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("1234");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("1234");
		WebElement ele = driver.findElement(By.id("singleframe"));
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("1234");

	}
}
