package sample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ListenersImplementation implements ITestListener {

	ExtentReports extent = ExtentReportUtility.extentInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et = extent.createTest(result.getMethod().getMethodName());
		test.set(et);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status : PASS");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.get().fail(result.getThrowable());

		Object obj = result.getInstance();
		// Base bsc = (Base) obj;

		// driver = bsc.driver;

		ScreenShotUtility sc = new ScreenShotUtility();

		try {
			String path = sc.captureScrrenShot(driver, result.getMethod().getMethodName());
			test.get().addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Status : SKIPPED");
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}