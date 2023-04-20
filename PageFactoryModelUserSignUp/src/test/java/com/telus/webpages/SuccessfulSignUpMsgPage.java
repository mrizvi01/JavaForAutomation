package com.telus.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SuccessfulSignUpMsgPage {
	
public WebDriver driver;
	
		public SuccessfulSignUpMsgPage(WebDriver driver) {
			this.driver = driver;
}
		//Initialize the web elements locators value using @FindBy class
		@FindBy(xpath = "//div[@id='rightPanel']")
		@CacheLookup
		WebElement successfulSignUpMsg;
		
	
	public void validateSuccesssfulMessage(String successfulSignUpSbmtMsgText) {
		
		// Verifying successful registration message Text
		String actualSuccessfulMsgText = successfulSignUpMsg.getText();
		String expectedSuccessfulMsgText = successfulSignUpSbmtMsgText;

		if(actualSuccessfulMsgText.contains(expectedSuccessfulMsgText)) {
			Reporter.log("The Successful SignUp message text is:  " + actualSuccessfulMsgText);

		}
		else
		{
			Reporter.log("Actual and expected successful sign up message text are not same");
			Reporter.log("Actual Sign Up message text is: " + actualSuccessfulMsgText);
			Reporter.log("Expected Sign Up message text is: " + expectedSuccessfulMsgText);
		}

	}

}
