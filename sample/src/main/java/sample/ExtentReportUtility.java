package sample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static ExtentReports extent;

	public static ExtentReports extentInstance() {
		if (extent == null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sampleReport.html");
			spark.config().setReportName("OrangeHRM UI Automation Report");
			spark.config().setDocumentTitle("Test Results");
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Automation Tester", "Ramana K S");
			extent.setSystemInfo("UI_Automaion_Framework", "Selenium+TestNG");
		}
		return extent;
	}
}
