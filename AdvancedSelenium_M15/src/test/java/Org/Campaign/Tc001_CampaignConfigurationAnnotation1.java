package Org.Campaign;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateCampaignPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class Tc001_CampaignConfigurationAnnotation1 extends BaseClass {

    @Test
    public void Tc001_CampaignConfigurationAnnotation() throws IOException {

        // Expected result
    	 String ExpectedResult = "";

    	//create object for utility classes
         String CAMPAIGNNAME = futil.readDataFromPropertiesFile("campaignname");

         String EXPECTEDCLOSINGDATE = futil.readDataFromPropertiesFile("expectedclosingdate");

         // Generate random data
         String randomdata = jutil.generateRandomData();
         
      // Create POM objects
         HomePage homepage = new HomePage(driver);

         CampaignPage campaignpage = new CampaignPage(driver);

         CreateCampaignPage createcampaignpage = new CreateCampaignPage(driver);

       //click on campaign module
 		//method calling
 		
 		//click on create campaign name text field
 		
 		//enter data into campaign name text field
 		
 		//enter data into expected closing date
 		
 		//click on save button
 		
 		//verify actual result with expected result
     }
 }