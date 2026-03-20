package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTerminationReasonPage {
	public AddTerminationReasonPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement reasonInput;

	@FindBy(css = ".oxd-button--secondary.orangehrm-left-space")
	private WebElement saveBtn;

	public WebElement getReasonInput() {
		return reasonInput;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setReason(String reason) {
		getReasonInput().sendKeys(reason);
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}

	public void addTerminationReason(String reason) {

		setReason(reason);

		clickSaveBtn();
	}
}
