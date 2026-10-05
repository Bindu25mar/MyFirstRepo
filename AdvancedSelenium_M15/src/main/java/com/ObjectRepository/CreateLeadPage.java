package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	
	  // Declaration

    @FindBy(css = "[title='Create Lead...']")
    private WebElement createLeadButton;

    @FindBy(name = "firstname")
    private WebElement firstNameTextField;

    @FindBy(name = "lastname")
    private WebElement lastNameTextField;

    @FindBy(name = "company")
    private WebElement companyTextField;

    @FindBy(name = "phone")
    private WebElement phoneTextField;

    @FindBy(name = "email")
    private WebElement emailTextField;
    
    @FindBy(name = "button")
    private WebElement saveButton;

    // Initialization

    public CreateLeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Getters

    public WebElement getCreateLeadButton() {
        return createLeadButton;
    }

    public WebElement getFirstNameTextField() {
        return firstNameTextField;
        
    }

    public WebElement getLastNameTextField() {
        return lastNameTextField;
    }

    public WebElement getCompanyTextField() {
        return companyTextField;
    }

    public WebElement getPhoneTextField() {
        return phoneTextField;
    }

    public WebElement getEmailTextField() {
        return emailTextField;
        
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}


