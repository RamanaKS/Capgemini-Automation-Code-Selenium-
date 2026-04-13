package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddtoCartInSwagLabsTest {
	WebDriver driver;

	@Given("open the browserAnd load the url {string}")
	public void open_the_browser_and_load_the_url(String URL) {
		// Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}

	@When("enter the username {string} and password {string}")
	public void enter_the_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on login button in swagLabs")
	public void click_on_login_button_in_swag_labs() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();

	}

	@When("inventory is displayed click on product {string}")
	public void inventory_is_displayed_click_on_product(String productname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[text()='" + productname + "']")).click();
	}

	@When("click on add-to-cart button")
	public void click_on_add_to_cart_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("add-to-cart")).click();

	}

	@When("product is added to cart click on cart button")
	public void product_is_added_to_cart_click_on_cart_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("shopping_cart_link")).click();
	}

	@When("validate whether the product name {string} is in cart")
	public void validate_whether_the_product_name_is_in_cart(String productname) {
		// Write code here that turns the phrase above into concrete actions
		WebElement ele = driver.findElement(By.xpath("//div[text()='" + productname + "']"));
		Assert.assertTrue(ele.isDisplayed());
	}
}
