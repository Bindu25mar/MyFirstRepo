package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	// Declaration

    @FindBy(css = "[title='Create Campaign']")
    private WebElement createCampaignButton;

    @FindBy(name = "campaignname")
    private WebElement campaignNameTextField;

    @FindBy(id = "jscal_field_closingdate")
    private WebElement closingDateTextField;

    @FindBy(id = "targetaudience")
    private WebElement targetAudienceTextField;

    @FindBy(name = "button")
    private WebElement saveButton;
    
 // Initialization

    public CreateCampaignPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Getters

    public WebElement getCreateCampaignButton() {
        return createCampaignButton;
    }

    public WebElement getCampaignNameTextField() {
        return campaignNameTextField;
    }

    public WebElement getClosingDateTextField() {
        return closingDateTextField;
        
    }

    public WebElement getTargetAudienceTextField() {
        return targetAudienceTextField;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}


