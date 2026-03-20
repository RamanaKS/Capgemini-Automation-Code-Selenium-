package JavaScriptPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
}
}
