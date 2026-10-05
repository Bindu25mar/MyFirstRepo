package Org.Contacts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ObjectRepository.ContactPage;
import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class Tc001_CreateContactsConfigurationAnnotation1 extends BaseClass {

	@Test
	public void Tc001_CreateContactsConfigurationAnnotation() throws IOException{
		
		
		// Expected result 
		String ExpectedResult = ""; 
		
		// Read test data from properties file 
		String LASTNAME = futil.readDataFromPropertiesFile("lastname"); 
		
		// Generate random data 
		String randomdata = jutil.generateRandomData(); 
		
		// Create POM objects 
		HomePage homepage = new HomePage(driver); 
		ContactPage contactspage = new ContactPage(driver);
		CreateContactPage createcontactpage = new CreateContactPage(driver);
		
		// Click on Contacts module 
		
		// Method calling 
		
		// Click on Create Contact button 
		
		// Enter data into Last Name text field 
		
		// Click on Save button 
		
		// Verify actual result with expected result
	}
}