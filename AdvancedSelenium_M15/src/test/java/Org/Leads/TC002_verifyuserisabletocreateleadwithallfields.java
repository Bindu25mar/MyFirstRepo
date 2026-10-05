package Org.Leads;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002_verifyuserisabletocreateleadwithallfields {
	
	@Test
	
    public void tc002_verifyuserisabletocreateleadwithallfields() throws InterruptedException, IOException {

        // Fetch common data file
        FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

        // Create object for Properties class to open the file
        Properties prop = new Properties();

        // Load properties file
        prop.load(fis);

        // Read data from properties file
        String URL = prop.getProperty("url");
        String USERNAME = prop.getProperty("username");
        String PASSWORD = prop.getProperty("password");

        Reporter.log(URL, true);

        // Create ChromeDriver object
        ChromeDriver driver = new ChromeDriver();//first mandatory line of code

        // Maximize browser
        driver.manage().window().maximize();//second 

        // Navigate to URL
        driver.get(URL);

        // Enter username
        driver.findElement(By.name("user_name"))
              .sendKeys(USERNAME);

        // Enter password
        driver.findElement(By.name("user_password"))
              .sendKeys(PASSWORD);

        // Click login button
        driver.findElement(By.id("submitButton"))
              .click();

        Thread.sleep(2000);

        Reporter.log("Login Successful", true);

        // Click Leads component
        driver.findElement(By.linkText("Leads"))
              .click();

        Thread.sleep(2000);

        // Click Create Lead
        driver.findElement(
                By.cssSelector("[title='Create Lead...']")
        ).click();

        Thread.sleep(2000);

        // Enter First Name
        driver.findElement(By.name("firstname"))
              .sendKeys("Kumari");

        // Enter Last Name
        driver.findElement(By.name("lastname"))
              .sendKeys("Kri");

        // Enter Company
        driver.findElement(By.name("company"))
              .sendKeys("ABC");

        // Enter Designation
        driver.findElement(By.id("designation"))
              .sendKeys("Engineer");

        // Enter Phone Number
        driver.findElement(By.id("phone"))
              .sendKeys("9876589210");

        // Enter Mobile Number
        driver.findElement(By.id("mobile"))
              .sendKeys("9876589210");

        // Enter Email
        driver.findElement(By.id("email"))
              .sendKeys("kumari@test.com");

        // Enter Website
        driver.findElement(By.name("website"))
              .sendKeys("www.testcompany.com");

        // Enter Number of Employees
        driver.findElement(By.id("noofemployees"))
              .sendKeys("50");

        Thread.sleep(2000);

        // Click Save button
        driver.findElement(By.name("button"))
              .click();

        Thread.sleep(2000);

        Reporter.log("Lead Created Successfully", true);

        // Close browser
        driver.quit();
    }
}


