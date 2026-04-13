package com.ninzaHrmFramework.Utilities;

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

import com.ninzahrm.Object_Repository.DashBoard;
import com.ninzahrm.Object_Repository.LoginPage;

public class BaseClass {

    public WebDriver driver;
    public WebDriverUtility webutility;
    public FileUtility fileUtility;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    // Page Objects
    public LoginPage loginPage;
    public DashBoard dashboardPage;
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
        dashboardPage = new DashBoard(driver);
    }

    @DataProvider(name = "campaignData")
    public Object[][] getCampaignData() throws Exception {
        Reporter.log("----Loading Campaign data----", true);
        return excelUtility.getExcelDataAsArray("CampaignData");
    }

    // Login
    @BeforeClass
    public void login() throws IOException {
        webutility.enterUrl(fileUtility.getPropertyKeyValue("url"));
        loginPage.login(
                fileUtility.getPropertyKeyValue("username"),
                fileUtility.getPropertyKeyValue("password"));
    }

    // Logout
    @AfterClass
    public void logout() {
        dashboardPage.LogoutMethod();
        webutility.closingBrowserWindow();
    }
}