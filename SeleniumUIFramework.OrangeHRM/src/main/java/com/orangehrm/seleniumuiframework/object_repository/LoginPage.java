package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(css = "[type='submit']")
	private WebElement loginBtn;
	@FindBy(xpath = "//p[.='Forgot your password? ']")
	private WebElement forgetPwd;
	@FindBy(css = "[href=\"http://www.orangehrm.com\"]")
	private WebElement info;
	@FindBy(css = "[href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")
	private WebElement linkedinLink;
	@FindBy(css = "[href=\"https://www.facebook.com/OrangeHRM/\"]")
	private WebElement facebookLink;
	@FindBy(css = "[href=\"https://www.youtube.com/c/OrangeHRMInc\"]")
	private WebElement youtubeLink;

	public WebElement getUserName() {
		return userName;
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

	public WebElement getForgetPwd() {
		return forgetPwd;
	}

	public void clickForgetPwd() {
		getForgetPwd().click();
	}

	public WebElement getLinkedinLink() {
		return linkedinLink;
	}

	public void clickLinkedinLink() {
		getLinkedinLink().click();
	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}

	public void clickFacebookLink() {
		getFacebookLink().click();
	}

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	public void clickYoutubeLink() {
		getYoutubeLink().click();
	}

	public WebElement getInfo() {
		return info;
	}

	public void setInfo() {
		getInfo().click();
	}

	public void login(String ValidUserName, String ValidPassword) {
		setUserName(ValidUserName);
		setPassword(ValidPassword);
		setLoginBtn();
	}

}
