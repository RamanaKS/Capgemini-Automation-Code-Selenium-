package com.orangehrm.seleniumuiframework.genericutility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class DemoBaseClass {
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	public Actions a = null;
	public LoginPage loginPage = null;
	public Dashboard dashboardPage = null;
	public JavascriptExecutor js = null;

	@Parameters("browser")
	@BeforeTest
	public void launchingBrowser(@Optional("chrome") String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		a = new Actions(driver);
		js = (JavascriptExecutor) driver;
		loginPage = new LoginPage(driver);
		dashboardPage = new Dashboard(driver);

	}

	@BeforeClass
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage.login("Admin", "admin123");
	}

	@AfterClass
	public void AfterClass() {
		dashboardPage.clickLogoutDropDown();
		driver.quit();
	}

}