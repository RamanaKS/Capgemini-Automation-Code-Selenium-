package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://www.google.com/");
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//textarea[@title='Search']/parent::div/parent::div/parent::div/following-sibling::div[2]/child::center/child::input[@value='Google
		// Search']")).click();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//font[.='Offers']/parent::h2/parent::div/following::div/following::a[.='Book Now' and @class=\"font14 primaryText latoBlack pushRight capText\" and @data-cy=\"superOfferCtaText0\"]"))
				.click();
	}

}
