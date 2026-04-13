package com.seleniumFrameWork.swagLabs.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllUtilities {

	public WebDriver driver;
	public WebDriverWait wait;

	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}

	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}

	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}

	public Dimension fetchSize() {
		return driver.manage().window().getSize();

	}

	public void configBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));

	}

	public Point fetchBrowserCoordinates() {
		return driver.manage().window().getPosition();
	}

	public void configBrowseCoodinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}

	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateBackward() {
		driver.navigate().back();
	}

	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}

	public void enterUrl(String url) {
		driver.get(url);
	}

	public String fetchApplicationTitle() {
		return driver.getTitle();
	}

	public String fetchApplicationUrl() {
		return driver.getCurrentUrl();
	}

	public void closingBrowserTab() {
		driver.close();
	}

	public void closingBrowserWindow() {
		 driver.quit();
	}

	public void waitForElementsToLoad(long timeInSeconds) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}

	public WebDriverWait ExplicitWait(long maximumTimeToWait) {
		return new WebDriverWait( driver, Duration.ofSeconds(maximumTimeToWait));
	}

	public void waitTillElementIsClickable(long maximumTimeToWait, WebElement ele) {
		ExplicitWait(maximumTimeToWait).until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void waitTillElementIsVisible(long maximumTimeToWait, WebElement ele) {
		ExplicitWait(maximumTimeToWait).until(ExpectedConditions.visibilityOf(ele));
	}

	public void clickOnAccept() {
		 driver.switchTo().alert().accept();
	}

	public void clickOnDismiss() {
		 driver.switchTo().alert().dismiss();
	}

	public void typeMessageInJavascriptPopup(String text) {
		 driver.switchTo().alert().sendKeys(text);
	}

	public void fetchJavascriptPopupMessage() {
		System.out.println( driver.switchTo().alert().getText());
	}

	public void windowSwitchingByTitle(String childApplicationTitle) {
		String parentId =  driver.getWindowHandle();
		Set<String> childIds =  driver.getWindowHandles();
		childIds.remove(parentId);
		for (String child : childIds) {
			 driver.switchTo().window(child);
			String title = fetchApplicationTitle();
			if (title.contains(childApplicationTitle))
				break;
		}
	}

	public void windowSwitchingByUrl(String childApplicationUrl) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for (String child : childIds) {
			 driver.switchTo().window(child);
			String title = fetchApplicationUrl();
			if (title.contains(childApplicationUrl))
				break;
		}
	}

	public void switchframebyindex(int index) {
		 driver.switchTo().frame(index);
	}

	public void switchframebyIdOrName(String idOrNameValue) {
		 driver.switchTo().frame(idOrNameValue);
	}

	public void switchframeByWebelement(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void switchBackthecontrolTopreviousframe() {
		 driver.switchTo().parentFrame();// it go to previous frame
	}

	public void switchBackTheControlToMainPage() {
		 driver.switchTo().defaultContent();
	}

	FileInputStream fis;
	Properties prop;
	FileOutputStream fos;

	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commomData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	public void setProperty(String key, String value) throws IOException {
		fos = new FileOutputStream("./src/test/resources/commomData/CommonData.properties");
		prop = new Properties();
		prop.setProperty(key, value);
		prop.store(fos, "Updated Common Data");
		fos.close();
	}

	public int getRandomNumber(int range) {
		Random randomNumber = new Random();
		int randomNum = randomNumber.nextInt(range);
		return randomNum;
	}

	// Generate current date
	public String getCurrentDate(String dateFormat) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}

	// Counting days (add days to current date)
	public String getFutureDate(int days) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(date);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDays = sdf.format(cal.getTime());
		return requiredDays;
	}

//	Actions act = new Actions(driver);
//
//	public void click(WebElement element) {
//		act.click(element).perform();
//	}
//
//	public void sendKeys(WebElement element, String value) {
//		act.click(element).sendKeys(value).perform();
//	}
//
//	public void clearAndType(WebElement element, String value) {
//		act.click(element).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(value)
//				.perform();
//	}
//
//	public void selectByArrowDown(WebElement element, int count) {
//		act.click(element).perform();
//		for (int i = 0; i < count; i++) {
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//		}
//		act.sendKeys(Keys.ENTER).perform();
//	}
//
//	public void typeAndSelect(WebElement element, String value) throws InterruptedException {
//		act.click(element).sendKeys(value).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
//	}
}
