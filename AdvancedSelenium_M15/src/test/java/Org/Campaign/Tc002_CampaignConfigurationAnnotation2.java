package Org.Campaign;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateCampaignPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class Tc002_CampaignConfigurationAnnotation2 extends BaseClass{
	
	@Test
	
	
	public void tc002_verifyuserisabletocreatecampaignwithallfields() throws IOException { 
		
		// Expected result 
		String ExpectedResult = ""; 
		
		// Read test data from properties file 
		String CAMPAIGNNAME = futil.readDataFromPropertiesFile("campaignname"); 
		String EXPECTEDCLOSINGDATE = futil.readDataFromPropertiesFile("expectedclosingdate");
		
		String TARGETAUDIENCE = futil.readDataFromPropertiesFile("targetaudience"); 
		
		// Generate random data 
		String randomdata = jutil.generateRandomData(); 
		
		// Create POM objects 
		HomePage homepage = new HomePage(driver);
		
		CampaignPage campaignpage = new CampaignPage(driver); 
		
		CreateCampaignPage createcampaignpage = new CreateCampaignPage(driver);
		
		// Click on More 
		
		// Click on Campaign module 
		
		// Click on Create Campaign icon 
		
		// Enter data into Campaign Name text field 
		
		// Clear Expected Closing Date field 
		
		// Enter Expected Closing Date 
		
		// Enter Target Audience 
		
		// Click on Save button 
		
		// Verify actual result with expected result
	}
	

}
