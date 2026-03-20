package JavaScriptPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Alerts")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Ramana K S");
		Thread.sleep(3000);
		System.out.println(prompt.getText());
		prompt.accept();
		driver.quit();
	}
}
