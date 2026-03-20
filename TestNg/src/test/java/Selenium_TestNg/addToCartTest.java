package Selenium_TestNg;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class addToCartTest extends BaseClass {
	

	@Test(priority = 1)
	public void addToCart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		List<WebElement> ele = driver.findElements(By.cssSelector("[class=\"inventory_item_name\"]"));
		int count = 0;
		for (WebElement q : ele) {
			if (q.getText().contains("Sauce Labs Backpack")) {
				count++;
			}
			if (q.getText().contains("Sauce Labs Bike Light"))
				count++;
		}
		if (count == ele.size())
			System.out.println("Verified");

	}

}
