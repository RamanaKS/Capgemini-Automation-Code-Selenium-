package com.orangehrm.seleniumuiframework.object_repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@role='row']//div[3]")
	private List<WebElement> employeeNames;

	// Next button
	@FindBy(xpath = "//button[.//i[contains(@class,'bi-chevron-right')]]")
	private List<WebElement> nextButton;

	// 🔹 Getter methods
	public List<WebElement> getEmployeeNames() {
		return employeeNames;
	}

	public List<WebElement> getNextButton() {
		return nextButton;
	}

	public boolean searchEmployee(String name) throws InterruptedException {

		while (true) {

			for (WebElement emp : getEmployeeNames()) {
				if (emp.getText().equals(name)) {
					return true;
				}
			}
			if (getNextButton().size() > 0 && getNextButton().get(0).isEnabled()) {
				getNextButton().get(0).click();
				Thread.sleep(3000);
			} else {
				break;
			}
		}

		return false;
	}
}
