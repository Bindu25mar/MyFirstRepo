package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// Declaration

    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "Leads")
    private WebElement leadsLink;

    @FindBy(linkText = "Organizations")
    private WebElement organizationsLink;

    @FindBy(linkText = "Contacts")
    private WebElement contactsLink;

    @FindBy(linkText = "Opportunities")
    private WebElement opportunitiesLink;

    @FindBy(linkText = "Products")
    private WebElement productsLink;

    @FindBy(linkText = "Documents")
    private WebElement documentsLink;

    @FindBy(linkText = "Email")
    private WebElement emailLink;

    @FindBy(linkText = "Trouble Tickets")
    private WebElement troubleTicketsLink;

    @FindBy(linkText = "Dashboard")
    private WebElement dashboardLink;

    @FindBy(linkText = "More")
    private WebElement moreLink;


    // Initialization

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        
        //getters

    }


	public void clickContacts() {
		// TODO Auto-generated method stub
		
	}


}
