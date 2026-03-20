package WebElementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSVAlue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//*[local-name()='svg'and @id=\"Layer_1\" ]"));
		System.out.println(logo.getCssValue("font"));
		System.out.println(logo.getCssValue("display"));
		WebElement link=driver.findElement(By.xpath("//span[.='Downloads']"));
		System.out.println(link.getCssValue("font-family"));
		System.out.println(link.getCssValue("display"));
		
		
		
}
}
