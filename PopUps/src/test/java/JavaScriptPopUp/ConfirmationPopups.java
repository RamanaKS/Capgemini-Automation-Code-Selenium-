package JavaScriptPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopups {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='Levis Shirt']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@id='deleteButton']")).click();
		driver.switchTo().alert().accept();

		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Alerts")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		driver.switchTo().alert().accept();
	}
}
