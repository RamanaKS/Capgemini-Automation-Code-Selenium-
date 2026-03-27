package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "PIM")
	private WebElement pimLink;
	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement recruitment;
	@FindBy(css = "li[class=\"oxd-userdropdown\"]")
	private WebElement logoutDropDown;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminTab;

	// 🔹 Getter
	public WebElement getAdminTab() {
		return adminTab;
	}

	// 🔹 Setter (not recommended, but added)
	public void setAdminTab(WebElement adminTab) {
		getAdminTab().click();
	}

	// 🔹 Business Method (BEST PRACTICE)
	public void clickAdmin() {
		adminTab.click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void clickLogoutLink() {
		getLogoutLink().click();
	}

	public WebElement getPimLink() {
		return pimLink;
	}

	public void clickPimLink() {
		getPimLink().click();
	}

	public WebElement getLogoutDropDown() {
		return logoutDropDown;
	}

	public void clickLogoutDropDown() {
		getLogoutDropDown().click();
	}

	public WebElement getRecruitment() {
		return recruitment;
	}

	public void clickRecruitment() {
		getRecruitment().click();
	}

	public void clickAdminMethod() {
		clickAdmin();
	}

	public void logoutMethod() {
		clickLogoutDropDown();
		clickLogoutLink();

	}
}
