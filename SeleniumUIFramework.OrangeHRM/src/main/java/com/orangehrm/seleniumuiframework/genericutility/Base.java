package com.orangehrm.seleniumuiframework.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
//@Listeners(com.orangehrm.seleniumuiframework.genericutility.ListenersImplementation.class)
public class Base {

	public WebDriver driver;
	public WebDriverUtility webutility;
	public FileUtility fileUtility;

	public WebDriverWait wait;

	public JavascriptExecutor js;

	// Page Objects
	public LoginPage loginPage;
	public Dashboard dashboardPage;
	public ExcelUtility excelUtility = new ExcelUtility();

	// Launch Browser
	@BeforeTest
	public void launchingBrowser() throws IOException {

		fileUtility = new FileUtility();

		String browser = fileUtility.getPropertyKeyValue("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Invalid browser name in properties file");
		}

		// Utilities
		webutility = new WebDriverUtility(driver);

		webutility.configMaximizedBrowser();
		webutility.waitForElementsToLoad(30);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;

		// Page Objects
		loginPage = new LoginPage(driver);
		dashboardPage = new Dashboard(driver);

	}

	@DataProvider(name = "addEmployee")
	public Object[][] getEmployeeData() throws Exception {
		Reporter.log("----Loading Vacancy data----", true);
		return excelUtility.getExcelDataAsArray("addEmployee");
	}

	@DataProvider(name = "VacancyExcelData")
	public Object[][] getVacancyData() throws Exception {
		ExcelUtility excel = new ExcelUtility();
		return excel.getExcelDataAsArray("addVacancy");
	}
	@DataProvider(name = "TerminationReason")
	public Object[][] getTermissionReasonData() throws Exception {
		Reporter.log("----Loading Vacancy data----", true);
		return excelUtility.getExcelDataAsArray("TerminationReason");
	}
	@DataProvider(name = "CandidateExcelData")
	public Object[][] getCandidateData() throws Exception {
	    ExcelUtility excel = new ExcelUtility();
	    return excel.getExcelDataAsArray("addCandidate");
	}

	// Login
	@BeforeClass
	public void login() throws IOException {
		webutility.enterUrl(fileUtility.getPropertyKeyValue("url"));

		loginPage.login(fileUtility.getPropertyKeyValue("username"), fileUtility.getPropertyKeyValue("password"));
	}

	// logout
	@AfterClass
	public void logout() {
		dashboardPage.logoutMethod();
		webutility.closingBrowserWindow();
	}
}