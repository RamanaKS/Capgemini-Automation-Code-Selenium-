package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TerminationPage {
	public TerminationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".oxd-button--secondary")
	private WebElement addBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void clickAddBtn() {
		getAddBtn().click();
	}

}
