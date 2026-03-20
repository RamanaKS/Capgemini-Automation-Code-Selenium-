package Object_Repository_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement userName;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement loginBtn;

	public void enterUrl(String url) {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
	}

	public void LoginToApplication(String username, String pass) {
		userName.sendKeys(username);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
