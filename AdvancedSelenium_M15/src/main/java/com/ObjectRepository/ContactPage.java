package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	
	 // Declaration

    @FindBy(linkText = "Contacts")
    private WebElement contactsPageButton;

    // Getter

    public ContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getContactsPageButton() {
        return contactsPageButton;
    }

	public void clickCreateContact1() {
		// TODO Auto-generated method stub
		
	}

	public void clickCreateContact() {
		// TODO Auto-generated method stub
		
	}
}

