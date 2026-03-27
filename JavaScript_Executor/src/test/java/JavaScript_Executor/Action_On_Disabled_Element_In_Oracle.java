package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_On_Disabled_Element_In_Oracle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		driver.findElement(By.cssSelector("[class=\"license-link icn-download-locked\"]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}
}
