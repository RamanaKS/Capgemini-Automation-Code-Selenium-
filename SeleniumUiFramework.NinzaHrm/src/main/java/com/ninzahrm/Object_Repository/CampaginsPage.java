package com.ninzahrm.Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaginsPage {
    
    public CampaginsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Create Campaign']")
    private WebElement createCampaginBtn;

    @FindBy(xpath = "//tbody//td")
    private List<WebElement> campaignList;

    @FindBy(css = ".Toastify_close-button.Toastify_close-button--success")
    public WebElement toastCloseBtn;

    public WebElement getCreateCampaginBtn() {
        return createCampaginBtn;
    }

    public void clickOnCreateCampaign() {
        createCampaginBtn.click();
    }

    public void clickOnToastCloseButton() {
        toastCloseBtn.click();
    }

    public boolean verifyCampaign(String campaignName) {
        for (WebElement ele : campaignList) {
            if (ele.getText().contains(campaignName)) {
                return true;
            }
        }
        return false;
    }
}