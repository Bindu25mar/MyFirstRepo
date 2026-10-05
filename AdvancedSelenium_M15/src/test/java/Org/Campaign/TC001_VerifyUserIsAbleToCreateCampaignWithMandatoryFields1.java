package Org.Campaign;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.loginPage;

public class TC001_VerifyUserIsAbleToCreateCampaignWithMandatoryFields1 {

	@Test
	public void tC001_VerifyUserIsAbleToCreateCampaignWithMandatoryFields1() throws InterruptedException, IOException {
		
		FileUtility fileutil = new FileUtility();
		String URL = fileutil.readDataFromPropertiesFile("url");
		String USERNAME = fileutil.readDataFromPropertiesFile("username");
		String PASSWORD = fileutil.readDataFromPropertiesFile("password");
		
		//create object for chromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//Implipcit wait cmd
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get(URL);
		
		//create object for POM class
		loginPage loginpage = new loginPage(driver);
		//Enter user name into user-name Text-Field
		//loginpage.getUserNameTextfield().sendKeys(USERNAME);
		
		//Enter Password
		//loginpage.getPasswordTextField().sendKeys(PASSWORD);
		
		//loginpage.getLoginButton().click();
		
		
		//important line
		loginpage.login(USERNAME, PASSWORD);
		
		Reporter.log("Login Successful", true);
		
		Actions ac = new Actions(driver);
		
		//Mouse Hover to more options
		ac.moveByOffset(910, 60).perform();
		
		//Create object for POM class
		CampaignPage campaignpage = new CampaignPage(driver);
		
		//hard wait
		Thread.sleep(3000);
		// Click on title and name it
					//driver.findElement(By.cssSelector("[title='Create Campaign...']")).click();
		
		//Click on campaign option
		campaignpage.getCampaignPageButton().click();
		//Reporter.log("Buttton is working", true);
		// Click on title and name it
		driver.findElement(By.cssSelector("[title='Create Campaign...']")).click();
		//Reporter.log("2nd method Buttton is working", true);
		//Implipcit wait cmd
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Enter details in mandatory fields
		//Enter campaign name in CampaignName TextField
		//driver.findElement(By.name("campaignname")).sendKeys("camp_002");
		//driver.findElement(By.name("campaignname")).sendKeys("camp_002");////input[@class='detailedViewTextBox']
		//driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("camp_002");
		driver.findElement(By.name("campaignname")).sendKeys("camp_002");
		
		driver.findElement(By.name("closingdate")).clear();
		//Enter closing date
		driver.findElement(By.name("closingdate")).sendKeys("2026/09/12");
		
		//click on save button to create the new campaign
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		//driver.findElement(By.xpath("//input[@class='crmButton small save']");
				//("//input[@class='crmButton small save']")).click();
		
		
	}
}