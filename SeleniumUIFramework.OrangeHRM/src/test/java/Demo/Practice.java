package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginDemo;

public class Practice {

	@Test
	public void readData() throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 🔹 Load properties
		FileInputStream fis = new FileInputStream("./src/main/resources/orangehrm.CommonData/CommonData.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		driver.get(url);

		LoginDemo lp = new LoginDemo(driver);
		lp.login(username, password);

		System.out.println("Login successful");
	}
}