package Org.Contacts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002_verifyuserisabletocreatecontactwithallfields {
	
	 @Test
	 
	    public void tc002_verifyuserisabletocreatecontactwithallfields()
	            throws InterruptedException, IOException {

	        // create object for FileInputStream class from java
	        // fetching the file
	        FileInputStream fis =
	                new FileInputStream("./src/test/resources/commondata.properties");

	        // create object for Properties class
	        Properties prop = new Properties();

	        // load the data into test script
	        prop.load(fis);

	        // read data from the loaded file
	        String URL = prop.getProperty("url");
	        String USERNAME = prop.getProperty("username");
	        String PASSWORD = prop.getProperty("password");

	        Reporter.log(URL, true);

	        // create object for ChromeDriver class
	        ChromeDriver driver = new ChromeDriver();

	        // maximize browser
	        driver.manage().window().maximize();

	        // navigate to URL
	        driver.get(URL);

	        // enter username into username text field
	        driver.findElement(By.name("user_name"))
	              .sendKeys(USERNAME);

	        // enter password into password text field
	        driver.findElement(By.name("user_password"))
	              .sendKeys(PASSWORD);

	        // click on login button
	        driver.findElement(By.id("submitButton"))
	              .click();

	        // hard wait
	        Thread.sleep(2000);

	        Reporter.log("Login Successful", true);

	        // click on Contacts component
	        driver.findElement(By.linkText("Contacts"))
	              .click();

	        // hard wait
	        Thread.sleep(2000);

	        // click on Create Contact button
	        driver.findElement(
	                By.cssSelector("[title='Create Contact...']")
	        ).click();

	        // hard wait
	        Thread.sleep(2000);

	        // enter First Name
	        driver.findElement(By.name("firstname"))
	              .sendKeys("Kumari");

	        // hard wait
	        Thread.sleep(1000);

	        // enter Last Name
	        driver.findElement(By.name("lastname")).sendKeys("kri");

	        // hard wait
	        Thread.sleep(1000);

	        // enter Mobile Number
	        driver.findElement(By.id("mobile"))
	              .sendKeys("9876829210");

	        // hard wait
	        Thread.sleep(1000);

	        // enter Email
	        driver.findElement(By.id("email")).sendKeys("kumari@test.com");

	        // hard wait
	        Thread.sleep(1000);

	        // enter Title
	        driver.findElement(By.id("title"))
	              .sendKeys("Engineer");

	        // hard wait
	        Thread.sleep(1000);

	        // click on Save button
	        driver.findElement(By.name("button"))
	              .click();

	        // hard wait
	        Thread.sleep(2000);

	        Reporter.log("Contact Created Successfully", true);

	        // close browser
	        driver.quit();
	    }
	}


