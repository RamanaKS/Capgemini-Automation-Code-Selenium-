package WeeklyTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseNo2 {
	@Test
	public void testMethod() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String pdturl = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		Select opt = new Select(driver.findElement(By.cssSelector("[class=\"product_sort_container\"]")));
		opt.selectByValue("lohi");

		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		sa.assertTrue(driver.findElement(By.cssSelector("[class=\"inventory_item_name\"]")).getText()
				.equals("Sauce Labs Onesie"));
		sa.assertAll();
		System.out.println("Product Verified");
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ramana");
		driver.findElement(By.id("last-name")).sendKeys("K S");
		driver.findElement(By.id("postal-code")).sendKeys("607302");
		driver.findElement(By.id("continue")).click();
		sa.assertTrue(driver.findElement(By.cssSelector("[class=\"inventory_item_name\"]")).getText()
				.equals("Sauce Labs Onesie"));
		sa.assertAll();
		System.out.println("Product summary verified");
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}
}
