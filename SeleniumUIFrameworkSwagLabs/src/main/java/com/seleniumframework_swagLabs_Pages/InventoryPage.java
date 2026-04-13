package com.seleniumframework_swagLabs_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
	@FindBy(id = "react-burger-menu-btn")
	private WebElement menubar;
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutBtn;
	@FindBy(id = "shopping_cart_container")
	private WebElement cartIcon;

	public WebElement getMenubar() {
		return menubar;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public void clickCartBtn() {
		getCartIcon().click();
	}

	public void logout() {
		getMenubar().click();
		getLogoutBtn().click();
	}

	public void clickOnProduct(WebDriver driver, String productName) {
		driver.findElement(By.xpath("//div[text()='" + productName + "']")).click();
	}

}
