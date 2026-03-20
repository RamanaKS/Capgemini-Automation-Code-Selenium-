package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment {
	public Recruitment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Vacancies")
	private WebElement vacancies;
	@FindBy(linkText = "Candidates")
	private WebElement Candidate;

	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;

	public WebElement getCandidates() {
		return Candidate;
	}

	// Setter / Action Method
	public void clickCandidates() {
		getCandidates().click();
	}

	public WebElement getVacancies() {
		return vacancies;
	}

	public void clickVacancies() {
		getVacancies().click();
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void clickAddBtn() {
		getAddBtn().click();
	}

	public void ClickAddButton() {
		clickAddBtn();
	}

	public void ClickVacanciesButton() {
		clickVacancies();
	}
}
