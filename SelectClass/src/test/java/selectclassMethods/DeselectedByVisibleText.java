package selectclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectedByVisibleText {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		 WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(4000);
		select.deselectByVisibleText("Mens Casual Premium ...");
		Thread.sleep(4000);
		driver.quit();
		
}
}
