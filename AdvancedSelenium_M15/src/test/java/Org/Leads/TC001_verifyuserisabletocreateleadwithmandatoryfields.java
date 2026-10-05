package Org.Leads;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_verifyuserisabletocreateleadwithmandatoryfields {
	
	@Test
	
    public void tc001_verifyuserisabletocreateleadwithmandatoryfields()
            throws InterruptedException, IOException {

        // create object for FileInputStream class
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

        // enter username
        driver.findElement(By.name("user_name"))
              .sendKeys(USERNAME);

        // enter password
        driver.findElement(By.name("user_password"))
              .sendKeys(PASSWORD);

        // click on login button
        driver.findElement(By.id("submitButton"))
              .click();

        // hard wait
        Thread.sleep(2000);

        Reporter.log("Login Successful", true);

        // click on Leads component
        driver.findElement(By.linkText("Leads"))
              .click();

        // hard wait
        Thread.sleep(2000);

        // click on Create Lead button
        driver.findElement(
                By.cssSelector("[title='Create Lead...']")
        ).click();

        // hard wait
        Thread.sleep(2000);

        // enter Last Name - mandatory field
        driver.findElement(By.name("lastname"))
              .sendKeys("kri");

        // hard wait
        Thread.sleep(1000);

        // enter Company - mandatory field
        driver.findElement(By.name("company"))
              .sendKeys("Test Company");

        // hard wait
        Thread.sleep(1000);

        // click on Save button
        driver.findElement(By.name("button"))
              .click();

        // hard wait
        Thread.sleep(2000);

        Reporter.log("Lead Created Successfully", true);

        // close browser
        driver.quit();
    }
}


