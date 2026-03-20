package WebElementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		 WebElement text=driver.findElement(By.xpath("//div[@id=\"nav-main\"]"));
		 WebElement text1=driver.findElement(By.linkText("Registry"));
		 System.out.println(text.getText());
		 System.out.println(text1.getText());
}
}
