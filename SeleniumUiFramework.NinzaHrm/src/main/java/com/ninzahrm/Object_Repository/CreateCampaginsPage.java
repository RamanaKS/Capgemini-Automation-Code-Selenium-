package com.ninzahrm.Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaginsPage {

    // Constructor
    public CreateCampaginsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "campaignName")
    private WebElement campaignNameField;

    @FindBy(name = "targetSize")
    private WebElement targetSizeField;

    @FindBy(xpath = "//button[.='Create Campaign']")
    private WebElement createCampaignBtn;

    // Getter Methods
    public WebElement getCampaignNameField() {
        return campaignNameField;
    }

    public WebElement getTargetSizeField() {
        return targetSizeField;
    }

    public WebElement getCreateCampaignBtn() {
        return createCampaignBtn;
    }

    // Setter / Action Methods

    public void setCampaignName(String campaignName) {
        getCampaignNameField().sendKeys(campaignName);
    }

    public void setTargetSize(String targetSize) {
        getTargetSizeField().clear();
        getTargetSizeField().sendKeys(targetSize);
    }

    public void clickCreateCampaignBtn() {
        getCreateCampaignBtn().click();
    }


    public void createCampaign(String campaignName, String targetSize) {
        setCampaignName(campaignName);
        setTargetSize(targetSize);
        clickCreateCampaignBtn();
    }
}