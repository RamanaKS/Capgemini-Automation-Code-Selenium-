package com.seleniumframework_swagLabs_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id = "user-name")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void login(String username,String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginBtn().click();
	}
	

}
