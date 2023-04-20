package com.telus.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.webpages.HomePage;
import com.telus.webpages.SignUpPage;
import com.telus.webpages.SuccessfulSignUpMsgPage;

public class ParaBankSignUp {
	
	public WebDriver driver;
	
	//Parameterize all the input value
		String url = "https://parabank.parasoft.com/parabank/index.htm";
		String firstNameValue = "Minhaj";
		String lastNameValue = "Rizvi";
		String addressValue ="Purvanchal Royal Park, Sector 137";
		String cityValue ="Noida";
		String stateValue = "Uttar Pradesh";
		String zipCodeValue ="201305";
		String phoneNumberValue = "9953123499";
		String ssn ="987654311";
		String userName ="rizvi06";
		String password ="March2023";
		String confirmPwd ="March2023";
		String successfulSignUpSbmtMsgText = "Your account was created successfully.";
		
				
	
	
  @Test(priority = 1)
  public void launchApplicaton() {
	  
	//Set system property for chrome browser 
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			//created the instance of chrome drive in Webdriver interface
			driver = new ChromeDriver();

			//Launch the application
			driver.get(url);
			//Maximize the window
			driver.manage().window().maximize();

			Reporter.log("Application Launched Successfully");

			//Implicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @Test(priority = 2)
  public void navigatestoSignUpForm() {
	
	  HomePage home = PageFactory.initElements(driver, HomePage.class);
	  home.clickRegisterLink();
	  
  }
 
  
  @Test(priority = 3)
  public void fillingAndSubmittingSignUpForm() {
	  
	  SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
	  signUp.enterFirstName(firstNameValue);
	  signUp.enterLastName(lastNameValue);
	  signUp.enterAddress(addressValue);
	  signUp.enterCity(cityValue);
	  signUp.enterState(stateValue);
	  signUp.enterZipCode(zipCodeValue);
	  signUp.enterPhoneNo(phoneNumberValue);
	  signUp.enterSSN(ssn);
	  signUp.enterUserName(userName);
	  signUp.enterPassword(password);
	  signUp.enterConfirmPass(confirmPwd);
	  signUp.clickRegisterButton();
	  
	  
  }
  
  @Test(priority = 4)
  public void validatingSuccessfullMsg() {
	  SuccessfulSignUpMsgPage signUpMessage = PageFactory.initElements(driver, SuccessfulSignUpMsgPage.class);
	  signUpMessage.validateSuccesssfulMessage(successfulSignUpSbmtMsgText);
  }
  
  @Test(priority = 5)
  public void closeApplication() {
	  //Close the application
		driver.quit();
		Reporter.log("Application Closed Successfully");

  }
  
}
