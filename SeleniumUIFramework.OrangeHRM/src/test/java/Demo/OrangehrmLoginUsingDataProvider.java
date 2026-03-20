package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class OrangehrmLoginUsingDataProvider {
	WebDriver driver;
	@DataProvider(name = "LoginData")
	Object[][] getdata() {
		return new Object[][] { { "Admin", "admin123" }

		};
	}
	@Test(dataProvider="LoginData")
	public void login(String username,String password)
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
	}
}
