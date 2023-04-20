package com.telus.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
		
		@FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
		WebElement registerLink;
		
		//Re-usable method for above web element 
		public void clickRegisterLink() {
			if(registerLink.isDisplayed()) {
			Reporter.log("Register link is displayed");	
			registerLink.click();	
			Reporter.log("Register link is clicked successfully and User is navigated to Sign-Up Form");
			}
			else {
				Reporter.log("Register Link is not displayed");	
			}
			
		}
		
		
		
		
		
	

}
