package TestCase;

import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LoginLogout;
import ObjectRepository.LogoutPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		LoginLogout lp = new LoginLogout(driver);

		lp.enterUserName("standard_user");

		lp.enterPassword("secret_sauce");

		lp.clickLogin();

		LogoutPage lop=new LogoutPage(driver);
		lop.clickMenu();
		lop.clickLogout();
	}
}