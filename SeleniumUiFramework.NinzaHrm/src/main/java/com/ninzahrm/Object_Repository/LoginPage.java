package com.ninzahrm.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "inputPassword")
	private WebElement password;
	@FindBy(xpath = "//button[.='Sign In']")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return username;
	}

	public void setUserName(String validUserName) {
		getUserName().sendKeys(validUserName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String validPassword) {
		getPassword().sendKeys(validPassword);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn() {
		getLoginBtn().click();
	}

	public void login(String ValidUserName, String ValidPassword) {
		setUserName(ValidUserName);
		setPassword(ValidPassword);
		setLoginBtn();
	}
}
