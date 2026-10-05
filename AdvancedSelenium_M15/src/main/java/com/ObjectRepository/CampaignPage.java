package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	
	// Declaration

    @FindBy(name = "Campaigns")
    private WebElement campaignPageButton;
  
  
    // Initialization

    public CampaignPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    
        public void campaign(String CAMPAIGNS) {
        	
        	
        	
        }

    
    
    public WebElement getCampaignPageButton() {
    	return getCampaignPageButton();
    	
    }

}
