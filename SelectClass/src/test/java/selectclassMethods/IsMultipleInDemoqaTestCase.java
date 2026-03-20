package selectclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleInDemoqaTestCase {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropdown);
		System.out.println(select.isMultiple());
		WebElement dropdown1 = driver.findElement(By.id("cars"));
		Select select1 = new Select(dropdown1);
		System.out.println(select1.isMultiple());
		driver.quit();

	}
}
