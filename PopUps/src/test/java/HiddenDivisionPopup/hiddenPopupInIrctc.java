package HiddenDivisionPopup;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenPopupInIrctc {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		driver.findElement(By.xpath("//a[.='11']")).click();
}
}
