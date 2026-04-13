package com.seleniumframework_swagLabs_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeBtn;
	@FindBy(className = "inventory_item_name")
	private WebElement itemList;

	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	public WebElement getItemList() {
		return itemList;
	}

	public String captureTextName() {
		return getItemList().getText();
	}

	public void removeItem() {
		getRemoveBtn().click();
	}
}
