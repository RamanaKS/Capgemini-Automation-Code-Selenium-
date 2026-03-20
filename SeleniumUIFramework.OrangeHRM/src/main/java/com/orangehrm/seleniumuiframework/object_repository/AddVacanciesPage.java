package com.orangehrm.seleniumuiframework.object_repository;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddVacanciesPage {
	public WebDriverWait wait;

	public AddVacanciesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement vacancyName;

	@FindBy(xpath = "//div[contains(@class,'oxd-select-text')]")
	private WebElement jobTitleDropdown;

	@FindBy(xpath = "//div[@role='listbox']//span[contains(.,'Account Assistant')]")
	private WebElement jobTitleOption;

	@FindBy(css = "[placeholder='Type description here']")
	private WebElement description;

	@FindBy(css = "[placeholder='Type for hints...']")
	private WebElement hiringManager;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement numberOfPositions;

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveBtn;

	@FindBy(xpath = "//h6[.='Edit Vacancy']")
	private WebElement editVacancyHeader;

	public WebElement getVacancyName() {
		return vacancyName;
	}

	public WebElement getJobTitleDropdown() {
		return jobTitleDropdown;
	}

	public WebElement getJobTitleOption() {
		return jobTitleOption;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getHiringManager() {
		return hiringManager;
	}

	public WebElement getNumberOfPositions() {
		return numberOfPositions;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setVacancyName(String name) {
		getVacancyName().sendKeys(name);
	}

	public void selectJobTitle() throws InterruptedException {
		getJobTitleDropdown().click();
		Thread.sleep(2000);
		getJobTitleOption().click();
	}

	public void setDescription(String desc) {
		getDescription().sendKeys(desc);
	}

	public void setHiringManager(String manager) throws InterruptedException {
		getHiringManager().sendKeys(manager);
		Thread.sleep(3000);
		getHiringManager().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
	}

	public void setNumberOfPositions(String num) {
		getNumberOfPositions().sendKeys(num);
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}

	public void AddVacanciesDetails(String name, String desc, String manager, String positions)
			throws InterruptedException {

		setVacancyName(name);
		selectJobTitle();
		setDescription(desc);
		setHiringManager(manager);
		setNumberOfPositions(positions);
		clickSaveBtn();
		wait.until(ExpectedConditions.visibilityOf(editVacancyHeader));

	}
}
