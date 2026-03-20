package TestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import Object_Repository_PageFactory.LoginPage;

public class LoginTestPageFactory {

	@Test
	public void logIn() {
		WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.enterUrl("https://www.saucedemo.com/");
		lp.LoginToApplication("standard_user", "secret_sauce");
	}
}
