package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Actions a = new Actions(driver);
		a.clickAndHold(ele).moveByOffset(200,30).release().perform();
		
		System.out.println(ele.getRect().x);
		System.out.println(ele.getRect().y);
		a.dragAndDropBy(ele,700 ,300).perform();
		//driver.quit();
	}
}
