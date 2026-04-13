package com.seleniumFrameWork.swagLabs.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.seleniumframework_swagLabs_Pages.CartPage;
import com.seleniumframework_swagLabs_Pages.InventoryItemPage;
import com.seleniumframework_swagLabs_Pages.InventoryPage;
import com.seleniumframework_swagLabs_Pages.LoginPage;

public class Pages {
	public static LoginPage lp;
	public static InventoryPage ip;
	public static InventoryItemPage iip;
	public static CartPage cp;

	public static void loadAllPages(WebDriver driver) {
		lp = PageFactory.initElements(driver, LoginPage.class);
		ip = PageFactory.initElements(driver, InventoryPage.class);
		iip = PageFactory.initElements(driver, InventoryItemPage.class);
		cp = PageFactory.initElements(driver, CartPage.class);
	}
}
