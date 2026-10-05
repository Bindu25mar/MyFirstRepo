package Org.Campaign;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.ObjectRepository.loginPage;

public class Tc001_CampaignConfigurationAnnotation {
	
	//driver Initialization
	WebDriver driver=null;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("BeforeSuite-database connectivity established",true);
	}
	@AfterSuite
	public void afterSuite(){
		Reporter.log("AfterSuite-database connectivity terminated",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("BeforeTest-report starts",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("AfterTest-report backup",true);
	}
	@BeforeClass
	public void BeforeClass() {
		Reporter.log("BeforeClass-launch browser",true);
	    
		//create object for chromedriver class
		driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass
	public void afterClass() {
		//print
		Reporter.log("AfterClass-close broswer",true);
		//close browser
		driver.quit();
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		Reporter.log("BeforeMthod-login to application",true);
		//create object for Utility Classes
		FileUtility fileUtil=new FileUtility();
		
		//Read data from Properties file
		String URL= fileUtil.readDataFromPropertiesFile("url");
		String USERNAME= fileUtil.readDataFromPropertiesFile("username");
		String PASSWORD= fileUtil.readDataFromPropertiesFile("password");
		
		//navigate to URL
		driver.get(URL);
		//create object for POM class
		loginPage loginpage= new loginPage(driver);
		loginpage.login(USERNAME, PASSWORD);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Aftermethod-logout from the application",true);
	}
	
	@Test
	public void tc001_CampaignConfigurationAnnotation() {
		Reporter.log("test-testcases executed",true);
		
	
	}

}
