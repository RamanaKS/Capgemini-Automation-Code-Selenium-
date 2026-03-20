package selectclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		 WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		Select select=new Select(dropdown);
		select.selectByContainsVisibleText("Jacket...");
		select.selectByIndex(1);
		select.selectByValue("Solid Gold Petite Micropave ");
		select.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(3000);
		System.out.println(select.getFirstSelectedOption().getText());
		driver.quit();
		
}
}
