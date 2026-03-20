package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Static.html");
		 WebElement logo=driver.findElement(By.id("angular"));
		 WebElement target=driver.findElement(By.id("droparea"));
		 Actions a=new Actions(driver);
		 a.pause(2000).dragAndDrop(logo, target).perform();
		 a.pause(2000).dragAndDrop(logo, target).perform();
		 a.pause(2000).dragAndDrop(logo, target).perform();
		
}
}
