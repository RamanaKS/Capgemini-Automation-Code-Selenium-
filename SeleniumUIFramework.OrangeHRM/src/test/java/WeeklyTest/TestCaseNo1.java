package WeeklyTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseNo1 {

	@Test
		public void testMethod() throws InterruptedException {
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--incognito");
		  WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			String pdturl=driver.getCurrentUrl();
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(pdturl.contains("inventory"));
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			List<WebElement> verify=driver.findElements(By.cssSelector("[class=\"inventory_item_name\"]"));
			List<String> productNames = new ArrayList<>();

			for (WebElement each : verify) {
			    productNames.add(each.getText());
			}

			sa.assertTrue(productNames.contains("Sauce Labs Backpack"));
			sa.assertTrue(productNames.contains("Sauce Labs Bike Light"));
			sa.assertAll();
			System.out.println("Product Verified");
			driver.findElement(By.id("checkout")).click();
			driver.findElement(By.id("first-name")).sendKeys("Ramana");
			driver.findElement(By.id("last-name")).sendKeys("K S");
			driver.findElement(By.id("postal-code")).sendKeys("607302");
			driver.findElement(By.id("continue")).click();
			sa.assertTrue(driver.findElement(By.cssSelector("[class=\"summary_total_label\"]")).getText().contains("$43.18"));
			System.out.println("Total Verified");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.quit();
			
			
			
			
			
}
}
