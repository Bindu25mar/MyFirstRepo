package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	// Declaration

    @FindBy(linkText = "Leads")
    private WebElement leadsPageButton;

    // Initialization

    public LeadsPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }

    // Getter

    public WebElement getLeadsPageButton() {
        return leadsPageButton;
    }

}
