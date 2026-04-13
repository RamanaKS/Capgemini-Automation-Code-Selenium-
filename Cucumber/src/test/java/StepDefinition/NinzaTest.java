package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NinzaTest {
	WebDriver driver;

	@Given("open the browser")
	public void open_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("Navigate to Application")
	public void navigate_to_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://49.249.28.218:8098/");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	}

	@When("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[.='Sign In']")).click();

	}

	@When("click on campaign btn")
	public void click_on_campaign_btn() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='/campaigns']")).click();

	}

	@When("click on createCampaign button")
	public void click_on_create_campaign_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[.='Create Campaign']")).click();

	}

	@When("enter campaign name and targetsize")
	public void enter_campaign_name_and_targetsize() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("campaignName")).sendKeys("Amazonawas");
		driver.findElement(By.name("targetSize")).sendKeys("344");

	}

	@When("click on create campaign button")
	public void click_on_create_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[.='Create Campaign']")).click();

	}

	@Then("verify it add or not")
	public void verify_it_add_or_not() {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> val = driver.findElements(By.xpath("//tbody//td"));
		boolean flag = false;
		for (WebElement ele : val) {
			if (ele.getText().contains("Amazonawa")) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}

	}

	@Then("click on logout")
	public void click_on_logout() {
		// Write code here that turns the phrase above into concrete actions
		WebElement usericon = driver.findElement(By.className("user-icon"));
		Actions action = new Actions(driver);
		action.pause(5000).moveToElement(usericon).perform();
		driver.findElement(By.xpath("//div[text()='Logout ']")).click();
	}
}
