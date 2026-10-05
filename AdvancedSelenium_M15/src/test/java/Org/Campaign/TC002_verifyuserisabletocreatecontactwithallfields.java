package Org.Campaign;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;

public class TC002_verifyuserisabletocreatecontactwithallfields {

	@Test
	
	public void tc002_verifyuserisabletocreatecampaignwithallfields () throws InterruptedException, IOException{
		
		
	//create object for FileInputStream class form java
		//fetching the file
		
		//FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
		
		//create object for file type class (Properties)
		//open the file
		
		//Properties prop= new Properties();
		
		//load the data into test script
		
	//	prop.load(fis);
		
		//read data from the loaded file
		
		//String URL= prop.getProperty("url");
		//String USERNAME= prop.getProperty("username");
		//String PASSWORD= prop.getProperty("password");
		
		
		FileUtility fileUtil= new FileUtility();
		
		String URL= fileUtil.readDataFromPropertiesFile("url");
		String USERNAME= fileUtil.readDataFromPropertiesFile("username");
		String PASSWORD= fileUtil.readDataFromPropertiesFile("password");
		
		Reporter.log(URL,true);
		
		
		//create object for ChromeDriver class
		
				ChromeDriver driver= new ChromeDriver();
				
				//maximize browser
				
				driver.manage().window().maximize();
				
				//navigate to URL
				
				driver.get(URL);
				
				//enter UserName into user name text field
				
						driver.findElement(By.name("user_name")).sendKeys(USERNAME);
						
						//enter password into password text field
						
						driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
						
						//click on login button
						driver.findElement(By.id("submitButton")).click();
						
						//hard wait
						
						Thread.sleep(2000);
						
						//click on More
				
						driver.findElement(By.linkText("More")).click();
						
						//hard wait
						
						Thread.sleep(2000);
						
						//click on campaign module
						
						driver.findElement(By.name("Campaign")).click();
						
						
						//hard wait
						Thread.sleep(2000);
						
						//click on title and name it
						
						driver.findElement(By.cssSelector("[title ='Create Campaign']")).click();
						
						
						//hard wait
						Thread.sleep(2000);
						
						//name the campaign name
						
						driver.findElement(By.name("campaignname")).sendKeys("Camp_o2");
						
						//hard wait
						Thread.sleep(2000);
						
						//clear the data text field
						driver.findElement(By.id("jscal_field_closingdate")).clear();
						
						//hard wait
						Thread.sleep(2000);
						
						//enter closing date
						
						driver.findElement(By.id("jscal_field_closingdate")).sendKeys("2026-09-15");
						
						//hard wait
						
						Thread.sleep(2000);
						
						//enter target audience
						
						driver.findElement(By.id("targetaudience")).sendKeys("18+ aged boys and girls");
						
						//hard wait
						
						Thread.sleep(2000);
						
						//click on save button
						
						driver.findElement(By.name("button")).click();
						
	}
}
		
		
		