package PopupsMethods;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		window.remove(parent);
		for (String childId : window) {
			driver.switchTo().window(childId);
		}
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.tagName("button"));
		btn.click();
		btn.click();
		btn.click();
		btn.click();
		btn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[local-name()='svg']")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.tagName("h2")).isDisplayed()) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		List<WebElement> ele = driver.findElements(By.tagName("button"));
		System.out.println(ele.size());

	}
}
