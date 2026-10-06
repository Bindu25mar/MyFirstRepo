package Org.Contacts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ObjectRepository.ContactPage;
import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class Tc002_CreateContactsConfigurationAnnotation2 extends BaseClass{
	
	@Test
	
	public void tc002_verifyuserisabletocreatecontactwithallfields() throws IOException { 
		
		// Expected result 
		String ExpectedResult = ""; 
		
		// Read test data from properties file 
		String FIRSTNAME = futil.readDataFromPropertiesFile("firstname");
		
		String LASTNAME = futil.readDataFromPropertiesFile("lastname"); 
		
		String MOBILENUMBER = futil.readDataFromPropertiesFile("mobilenumber"); 
		
		String EMAIL = futil.readDataFromPropertiesFile("email");
		
		String TITLE = futil.readDataFromPropertiesFile("title"); 
		
		// Generate random data 
		String randomdata = jutil.generateRandomData(); 
		
		// Create POM objects 
		HomePage homepage = new HomePage(driver); 
		ContactPage contactspage = new ContactPage(driver);
		CreateContactPage createcontactpage = new CreateContactPage(driver);
		
		// Click on Contacts module 
		
		// Method calling 
		
		// Click on Create Contact button 
		
		// Enter data into First Name text field 
		
		// Enter data into Last Name text field 
		
		// Enter data into Mobile Number text field 
		
		// Enter data into Email text field
		
		// Enter data into Title text field 
		
		// Click on Save button 
		
		// Verify actual result with expected result
	}

}
