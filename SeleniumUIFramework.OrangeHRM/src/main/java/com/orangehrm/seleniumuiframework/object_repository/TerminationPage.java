package com.orangehrm.seleniumuiframework.object_repository;

import java.util.List;

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
	@FindBy(xpath = "//div[@role='row']//div[2]")
	private List<WebElement> reasonList;

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void clickAddBtn() {
		getAddBtn().click();
	}

	public List<WebElement> getReasonList() {
		return reasonList;
	}

	public boolean verifyTerminationReason(String expectedReason) throws InterruptedException {

		for (WebElement ele : getReasonList()) {
			if (ele.getText().contains(expectedReason)) {
				return true;
			}
		}
		return false;
	}

}
