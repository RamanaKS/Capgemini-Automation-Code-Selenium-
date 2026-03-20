package WebElementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//input[@id=\"attended_c\"]"));
		System.out.println(btn.isSelected());
		driver.findElement(By.xpath("//input[@id=\"attended_c\"]")).click();
		System.out.println(btn.isSelected());

	}
}
