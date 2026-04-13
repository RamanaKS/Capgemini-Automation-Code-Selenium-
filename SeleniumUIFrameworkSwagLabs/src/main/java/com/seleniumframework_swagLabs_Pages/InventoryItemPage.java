package com.seleniumframework_swagLabs_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage {
	@FindBy(id = "add-to-cart")
	private WebElement addtocartBtn;

	public WebElement getAddtocartBtn() {
		return addtocartBtn;
	}

	public void clickOnaddTocartBtn() {
		getAddtocartBtn().click();
	}

}
