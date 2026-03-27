package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		ExtentReports test = new ExtentReports();// contains collection of report and attach the report
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sampleReport.html");// create report
		test.attachReporter(spark);
		ExtentTest ref = test.createTest("Sample Test");
		ref.info("---Started test execution--");
		ref.pass("---The test step has passes---");
		ref.fail("---The test step has failed--");
		test.flush();
	}
}
