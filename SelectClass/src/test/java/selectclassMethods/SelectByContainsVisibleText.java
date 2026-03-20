package selectclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByContainsVisibleText {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		 WebElement dropdown=driver.findElement(By.id("Skills"));
		Select select=new Select(dropdown);
		select.selectByContainsVisibleText("Systems (CMS)");
		Thread.sleep(2000);
		driver.quit();
}
}
