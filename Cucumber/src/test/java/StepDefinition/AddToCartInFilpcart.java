package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddToCartInFilpcart {
	WebDriver driver;

	@Given("open the browser And load the url of flipcart {string}")
	public void open_the_browser_and_load_the_url_of_flipcart(String URL) {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.className("b3wTlE")).click();

	}

	@When("search the item {string} in the searchbar")
	public void search_the_item_in_the_searchbar(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products, Brands and More'])[1]"))
				.sendKeys("IPhone", Keys.ENTER);

	}

	@When("Click on  the product {string}")
	public void click_on_the_product(String productname) {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath("//div[text()='" + productname + "']")).click();

	}

	@When("navigate to new window")
	public void navigate_to_new_window() {
		// Write code here that turns the phrase above into concrete actions
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for (String child : childIds) {
			driver.switchTo().window(child);
		}
	}

	@When("click add to cart button in flipcart")
	public void click_add_to_cart_button_in_flipcart() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@style='transform: translateY(0px) scale(1);']")).click();

	}

	@When("product is added click on add to cart in flipcart")
	public void product_is_added_click_on_add_to_cart_in_flipcart() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("SXucWY")).click();

	}

	@When("verify the product is added correctly {string}")
	public void verify_the_product_is_added_correctly(String productname) {
		// Write code here that turns the phrase above into concrete actions
		WebElement ele = driver.findElement(By.xpath("//div[text()='" + productname + " ']"));
		Assert.assertTrue(ele.isDisplayed());

	}
}
