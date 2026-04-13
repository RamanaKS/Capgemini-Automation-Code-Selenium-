package Demo;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.orangehrm.seleniumuiframework.genericutility.FileUtility;
import com.orangehrm.seleniumuiframework.genericutility.ScreenShotUtility;
import com.orangehrm.seleniumuiframework.genericutility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class screenShot {
	@Test(invocationCount = 1)
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		FileUtility fu = new FileUtility();
		LoginPage lp = new LoginPage(driver);
		Dashboard db = new Dashboard(driver);
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");
		wu.navigateToApplication(urlPath);
		lp.login(un, pass);
		Thread.sleep(4000);
		ScreenShotUtility su = new ScreenShotUtility();
		su.captureScreenshot(driver, "dashboard");
		su.captureScreenshot(db.getRecruitment(), "recruitment");
		/*
		 * String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File temp =
		 * ts.getScreenshotAs(OutputType.FILE); File perm = new
		 * File("./Reports/dashboard_" + timeStamp + ".png"); FileHandler.copy(temp,
		 * perm); WebElement recruitmentLink = db.getRecruitment(); File temp1 =
		 * recruitmentLink.getScreenshotAs(OutputType.FILE); File perm1 = new
		 * File("./Reports/Recruitment_" + timeStamp + ".png"); FileHandler.copy(temp1,
		 * perm1);
		 */

	}
}
