package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_On_Hidden_Element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		WebElement dropdown = driver.findElement(By.xpath("//div[starts-with(@id,'_R_')and @role='combobox']"));
		dropdown.click();
		dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[starts-with(@id,'_r_')]"));
		ele.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Other than boy and girl'", ele);

	}
}
