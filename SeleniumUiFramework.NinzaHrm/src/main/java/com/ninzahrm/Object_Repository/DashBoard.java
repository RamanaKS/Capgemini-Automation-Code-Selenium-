package com.ninzahrm.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/campaigns']")
	private WebElement campaginsLink;

	@FindBy(className = "user-icon")
	private WebElement usericon;

	@FindBy(xpath = "//div[text()='Logout ']")
	private WebElement logoutBtn;

	public void clickCampagins() {
		campaginsLink.click();
	}

	// ✅ Hover + Logout
	public void LogoutMethod() {
		Actions action = new Actions(driver);
		action.pause(5000).moveToElement(usericon).perform();
		logoutBtn.click();
	}
}