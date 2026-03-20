package com.orangehrm.seleniumuiframework.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;

	@BeforeClass
	public void setUp() throws IOException {
		fis = new FileInputStream("./src/main/resources/orangehrm.CommonData/CommonData.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {

		String url = prop.getProperty("url");
		// String browser=prop.getProperty("browser");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		LoginPage lp = new LoginPage(driver);
		driver.get(url);

		// Login
		lp.login(username, password);

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Dashboard db = new Dashboard(driver);
		db.clickLogoutDropDown();
		Thread.sleep(2000);
		db.clickLogoutLink();

		// Close browser
		driver.quit();
	}
}