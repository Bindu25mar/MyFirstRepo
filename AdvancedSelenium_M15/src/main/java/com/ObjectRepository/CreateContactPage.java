package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	// Declaration

    @FindBy(css = "[title='Create Contact...']")
    private WebElement createContactButton;

    @FindBy(name = "firstname")
    private WebElement firstNameTextField;

    @FindBy(name = "lastname")
    private WebElement lastNameTextField;

    @FindBy(name = "mobile")
    private WebElement mobileTextField;

    @FindBy(name = "email")
    private WebElement emailTextField;

    @FindBy(name = "button")
    private WebElement saveButton;
    
 // Initialization

    public CreateContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Getters

    public WebElement getCreateContactButton() {
        return createContactButton;
    }

    public WebElement getFirstNameTextField() {
        return firstNameTextField;
    }

    public WebElement getLastNameTextField() {
        return lastNameTextField;
        
    }

    public WebElement getMobileTextField() {
        return mobileTextField;
    }

    public WebElement getEmailTextField() {
        return emailTextField;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

	public void createContact(String string) {
		// TODO Auto-generated method stub
		
	}
}


