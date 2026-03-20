package WebElementInterrogationMethods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));

		System.out.println(searchbtn.getLocation()); // Prints Point object

		Point point = searchbtn.getLocation();
////*[name()='svg'and @data-icon-id=":r4:"]
		System.out.println(point);
		System.out.println(point.getX());
		System.out.println(point.x);
		System.out.println(point.getY());
		System.out.println(point.y);

		// or
		System.out.println(searchbtn.getLocation().getX());
		System.out.println(searchbtn.getLocation().x);

		driver.quit();
	}
}
