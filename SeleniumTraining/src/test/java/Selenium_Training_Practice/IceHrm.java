package Selenium_Training_Practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHrm {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("a123");
		driver.findElement(
				By.xpath("//button[@type=\"button\"and @class=\"btn btn-info btn-medium w-100 text-uppercase\"][1]"))
				.click();
		if (driver.findElement(By.cssSelector("[class='alert alert-danger']")).isDisplayed())
			System.out.println("Error message is showing");
		else
			System.out.println("Error message  not is showing");
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
		driver.findElement(By.linkText("Skills")).click();
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		WebElement divcontainer = driver.findElement(By.className("ant-modal-content"));
		System.out.println("Div Container is displayed : " + divcontainer.isDisplayed());
		driver.findElement(By.xpath("//span[@aria-label=\"close\"]")).click();
		driver.findElement(
				By.xpath("//i[@class='glyphicon glyphicon-user']/following-sibling::span[contains(.,'IceHrm')]"))
				.click();
		driver.findElement(By.linkText("Sign out")).click();
		if(driver.getCurrentUrl().equals("https://icehrmpro.gamonoid.com/login.php?logout=1"))
			System.out.println("login page is showing");
		else
			System.out.println("login page is  not showing");
		driver.quit();

	}
}
