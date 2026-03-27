package com.orangehrm.seleniumuiframework.object_repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addBtn;
	@FindBy(css = "span.oxd-topbar-body-nav-tab-item")
	private WebElement Configuration;

	@FindBy(linkText = "Termination Reasons")
	private WebElement terminationReasons;
	

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getConfiguration() {
		return Configuration;
	}

	public WebElement getTerminationReasons() {
		return terminationReasons;
	}

	
	

	public void clickConfiguration() {
		getConfiguration().click();
	}

	public void clickTerminationReasons() {
		getTerminationReasons().click();
	}

	public void clickAddBtn() {
		getAddBtn().click();
	}

	

	
}
