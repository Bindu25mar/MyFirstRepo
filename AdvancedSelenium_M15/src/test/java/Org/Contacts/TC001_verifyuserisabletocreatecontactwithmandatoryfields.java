package Org.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_verifyuserisabletocreatecontactwithmandatoryfields {
	
	@Test
	
    public void tc001_verifyuserisabletocreatecontactwithmandatoryfields()
            throws InterruptedException {

        // Create object for ChromeDriver class
        ChromeDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Navigate to URL
        driver.get("http://localhost:8888/");

        Thread.sleep(2000);

        // Enter username into username text field
        driver.findElement(By.name("user_name"))
              .sendKeys("admin");

        // Enter password into password text field
        driver.findElement(By.name("user_password"))
              .sendKeys("admin");

        // Click on login button
        driver.findElement(By.id("submitButton"))
              .click();

        Thread.sleep(2000);

        Reporter.log("Login Successful", true);

        // Click on Contacts component
        driver.findElement(By.linkText("Contacts"))
              .click();

        Thread.sleep(2000);

        // Click on Create Contact button
        driver.findElement(
                By.cssSelector("[title='Create Contact...']")
        ).click();

        Thread.sleep(2000);

        // Enter Last Name - mandatory field
        driver.findElement(By.name("lastname"))
              .sendKeys("Nath");

        Thread.sleep(1000);

        // Click on Save button
        driver.findElement(By.name("button"))
              .click();

        Thread.sleep(2000);

        Reporter.log("Contact Created Successfully", true);

        // Close browser
        driver.quit();
    }
}


