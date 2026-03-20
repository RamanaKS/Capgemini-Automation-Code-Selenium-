package PopupsMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowTab {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(4000);
		 driver.findElement(By.xpath("(//img[@data-image-index='1'])"))
         .click();
		//driver.findElement(By.xpath("//span[@class='rush-component'and @data-component-id='10']")).click();
		 Set<String>allWindowId=driver.getWindowHandles();
		 String parentId=driver.getWindowHandle();
		 allWindowId.remove(parentId);
		 for(String ChildId:allWindowId)
		 {
			 driver.switchTo().window(ChildId);
		 }
		 driver.findElement(By.xpath("//input[@id='buy-now-button']"))
         .click();
		 
		
}
}
