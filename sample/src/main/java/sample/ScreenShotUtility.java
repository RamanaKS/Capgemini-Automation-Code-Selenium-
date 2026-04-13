package sample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public String captureScrrenShot(WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String path = "./Reports/" + screenShotName + "_" + timeStamp + ".png";
		File perm = new File(path);
		FileHandler.copy(temp, perm);
		return perm.getAbsolutePath();

	}

	public String captureScrrenShot(WebElement element, String screenShotName) throws IOException {
		File temp = element.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String path = "./Reports/" + screenShotName + "_" + timeStamp + ".png";
		File perm = new File(path);
		FileHandler.copy(temp, perm);
		return perm.getAbsolutePath();

	}
}
