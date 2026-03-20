package WebElementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		//fetch attribute value for a static attribute
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		System.out.println(search.getAttribute("id"));
		//fetching the attribute value of a dynamic attribute
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		System.out.println(search.getAttribute("value"));
		Thread.sleep(2000);
		search.sendKeys("Books");
		System.out.println("Default"+search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		System.out.println("Hi"+search.getAttribute("value"));
		
}
}
