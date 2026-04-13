package com.orangehrm.seleniumuiframework.genericutility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility {

	WebDriver driver;
	Actions act;

	public ActionUtility(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	public void click(WebElement element) {
		act.click(element).perform();
	}

	public void sendKeys(WebElement element, String value) {
		act.click(element).sendKeys(value).perform();
	}

	public void clearAndType(WebElement element, String value) {
		act.click(element).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(value)
				.perform();
	}

	public void selectByArrowDown(WebElement element, int count) {
		act.click(element).perform();
		for (int i = 0; i < count; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}

	public void typeAndSelect(WebElement element, String value) throws InterruptedException {
		act.click(element).sendKeys(value).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
}
