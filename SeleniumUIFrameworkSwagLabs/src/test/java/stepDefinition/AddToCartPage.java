package stepDefinition;
import org.testng.Assert;

import com.seleniumFrameWork.swagLabs.utility.BaseClass;
import com.seleniumFrameWork.swagLabs.utility.Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartPage {
	private BaseClass b;

	public AddToCartPage(BaseClass b) {
		this.b = b;
	}

	@When("inventory is displayed click on product {string}")
	public void inventory_is_displayed_click_on_product(String productname) {
		// Write code here that turns the phrase above into concrete actions
		Pages.ip.clickOnProduct(b.driver, productname);
	}

	@When("click on add-to-cart button")
	public void click_on_add_to_cart_button() {
		// Write code here that turns the phrase above into concrete actions
		Pages.iip.clickOnaddTocartBtn();
		

	}

	@When("product is added to cart click on cart button")
	public void product_is_added_to_cart_click_on_cart_button() {
		// Write code here that turns the phrase above into concrete actions
		Pages.ip.clickCartBtn();
		
	}

	@When("validate whether the product name {string} is in cart")
	public void validate_whether_the_product_name_is_in_cart(String productname) {
		// Write code here that turns the phrase above into concrete actions
		String text = Pages.cp.captureTextName();
		Assert.assertEquals(productname, text);
	}
}
