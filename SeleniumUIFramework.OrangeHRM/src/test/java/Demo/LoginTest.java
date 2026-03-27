package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.genericutility.FileUtility;
import com.orangehrm.seleniumuiframework.genericutility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports test = new ExtentReports();// contains collection of report and attach the report
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Login_Report1.html");// create report
		test.attachReporter(spark);
		ExtentTest ref = test.createTest("Login Test");
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		FileUtility fu = new FileUtility();
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");
		wu.navigateToApplication(urlPath);
		ref.log(Status.INFO, "Naviagte to orangeHrm login page");
		LoginPage lp = new LoginPage(driver);
		lp.login(un, pass);
		ref.log(Status.PASS, "Naviagte to orangeHrm login page");
		// ref.log(Status.FAIL, "Naviagte to orangeHrm login page");
		test.flush();
	}
}
