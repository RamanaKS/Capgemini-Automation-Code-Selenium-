package WebElementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement searchbtn= driver.findElement(By.id("nav-search-submit-button"));
		System.out.println(searchbtn.getSize());
		Dimension dim=searchbtn.getSize();
		System.out.println(dim);
		System.out.println(dim.getHeight());
		System.out.println(dim.height);
		System.out.println(dim.getWidth());
		System.out.println(dim.width);
		//or
		System.out.println(searchbtn.getSize().getWidth());
		System.out.println(searchbtn.getSize().width);
		driver.quit();
		
		
}
}
