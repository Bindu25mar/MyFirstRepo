package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	// 1. Declare elements using @FindBy annotation
	@FindBy(name = "user_name")
	private WebElement usernameTextField;
	
	@FindBy(name = "user_password")
    private WebElement passwordTextField;

    @FindBy(id = "submitButton")
    private WebElement loginButton;
    
    // 2. Initialize elements inside a constructor using PageFactory
    public loginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    // 3. Provide getter methods to access these elements safely (Encapsulation)
    public WebElement getUserNameTextfield() {
        return usernameTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    /**
     * this method is used to login to the application
     * @param USERNAME
     * @param PASSWORD
     */
    
    //create scenario based methods - (objects)
    public void login(String USERNAME, String PASSWORD) {
    	
    	//call UserNameTextField
    	usernameTextField.sendKeys(USERNAME);
    	//call PasswordTextField
    	passwordTextField.sendKeys(PASSWORD);
    	//call LoginButton
    	loginButton.click();
    }
}