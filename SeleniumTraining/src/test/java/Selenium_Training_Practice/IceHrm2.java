package Selenium_Training_Practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHrm2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");

		driver.findElement(
				By.xpath("//button[@type=\"button\"and @class=\"btn btn-info btn-medium w-100 text-uppercase\"][1]"))
				.click();
		if(driver.getCurrentUrl().equals("https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin"))
			System.out.println("Dashboard is showing");
		else
			System.out.println("does not navigate to dashboard");
		driver.findElement(By.xpath("//span[.='Employees']")).click();
		
		driver.findElement(By.xpath("// i[@class=\"fa fa-users\"][1]")).click();
		driver.findElement(By.linkText("Employees")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		 WebElement dept=driver.findElement(By.cssSelector("[id=\"rc_select_5\"]"));
		 dept.click();
		 dept.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		 driver.findElement(By.xpath("//span[.='Save']")).click();
		List<WebElement> val= driver.findElements(By.cssSelector("[class=\"ant-list-item-meta-description\"]"));
		int count=0;
		for(WebElement eac:val)
		{
			if(eac.getText().contains("Head Office"))
				count++;
		}
		if(count==val.size())
		{
			System.out.println("Filter is working fine for department");
		}
		else
			System.out.println("Filter is working fine for department");
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		 WebElement job=driver.findElement(By.cssSelector("[id=\"rc_select_8\"]"));
		 job.click();
		 job.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		 job.findElement(By.xpath("//span[.='Save']")).click();
		 List<WebElement> val1= driver.findElements(By.cssSelector("[class=\"ant-list-item-meta-description\"]"));
			int count1=0;
			for(WebElement eac:val1)
			{
				if(eac.getText().contains("Head Office | Product Manager"))
					count++;
			}
			if(count==val.size())
			{
				System.out.println("Filter is working fine for job");
			}
			else
				System.out.println("Filter is working fine for job");
			
			driver.findElement(
					By.xpath("//i[@class='glyphicon glyphicon-user']/following-sibling::span[contains(.,'IceHrm')]"))
					.click();
			driver.findElement(By.linkText("Sign out")).click();
			driver.quit();
		
		
}
}