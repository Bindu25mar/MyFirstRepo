package com.GenericUtility;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	
	/**
	 * this method is user to maximize
	 * @param driver
	 */
	
	public void toMaximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
    
	public void toMinimize(WebDriver driver) {
		
		driver.manage().window().minimize();
		
	}
	
	public void toFullscreen(WebDriver driver) {
		
		driver.manage().window().fullscreen();
	}
	
	public void toback(WebDriver driver) {
		
		driver.navigate().back();
	}
	
	public  void toForward(WebDriver driver) {
		
		driver.navigate().forward();
	}
	
	public void toRefresh(WebDriver driver) {
		
		driver.navigate().refresh();
	}
	
	public void toTo(WebDriver driver) {
		
		driver.navigate().to("Name, https://horizonpublicschool.in/index.php/admissions/");
	}
	
	public void toToURLurl(WebDriver driver) {
		
		driver.navigate().to("https://horizonpublicschool.in/index.php/admissions/");
		
	}
}



