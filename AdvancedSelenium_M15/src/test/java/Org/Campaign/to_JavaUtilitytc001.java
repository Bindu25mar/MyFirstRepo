package Org.Campaign;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;

public class to_JavaUtilitytc001 {
	
		@Test
		public void test() throws InterruptedException, IOException{
		

		/*	//create object for FileInputstream class from Java
					//fetching the file
					
					FileInputStream fis= new FileInputStream("./src/test/resources/commonData.properties");
					
					//create object for file type class (properties)
					//open the file
					Properties prop= new Properties();
					
					//load the data into test script
					prop.load(fis);

					
					//read data from the loaded file
					String URL = prop.getProperty("url");
					String USERNAME= prop.getProperty("username");
					String PASSWORD=prop.getProperty("password");
					
				*/	
		//create object for Utility class
			
		FileUtility fileUtil=new FileUtility();
		JavaUtility javaUtil=new JavaUtility();
		
		//Timestamp
		String timestamp=javaUtil.timeStamp();
		Reporter.log(timestamp,true);
		
		
		String URL=fileUtil.readDataFromPropertiesFile("url");
		String USERNAME=fileUtil.readDataFromPropertiesFile("username");
		String PASSWORD=fileUtil.readDataFromPropertiesFile("password");
		

					
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(URL);
			Thread.sleep(2000);
			
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			Thread.sleep(2000);
			
			//enter password into password textfield
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			Thread.sleep(2000);
			
			//click on login button
			
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(2000);
			
			Reporter.log("Login Successful",true);
			
			// click on contacts button	
			driver.findElement(By.linkText("Contacts")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
			
			// enter first name
			new Select(driver.findElement(By.name("salutationtype"))).selectByValue("Mr.");
			Thread.sleep(2000);
			driver.findElement(By.name("firstname")).sendKeys("sita");
			Thread.sleep(2000);
			// enter last name
			driver.findElement(By.name("lastname")).sendKeys("singh");
			
			// select user at assigned to
			//new Select(driver.findElement(By.name("assigntype"))).selectByValue("U");
			Thread.sleep(2000);
			// enter support start date
			
			driver.findElement(By.name("support_start_date")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("support_start_date")).sendKeys("2026-09-05");
			
			Thread.sleep(2000);
			  driver.findElement(By.name("button")).click();
			
			
		}
		}	






