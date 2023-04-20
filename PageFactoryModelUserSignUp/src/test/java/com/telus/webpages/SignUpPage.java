package com.telus.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignUpPage {
	
	public WebDriver driver;
	
	//creating Constructor
		public SignUpPage(WebDriver driver) {
			this.driver = driver;

}
		
		//Initialize all the locators value using @FindBy Annotation
		
		@FindBy(id = "customer.firstName")
		@CacheLookup
		WebElement firstName;

		@FindBy(id="customer.lastName")
		WebElement lastName;

		@FindBy(name="customer.address.street") 
		WebElement address;

		@FindBy(id="customer.address.city")
		WebElement city;

		@FindBy(id="customer.address.state")
		WebElement state;

		@FindBy(name="customer.address.zipCode")
		WebElement zipCode;

		@FindBy(id="customer.phoneNumber")
		WebElement phoneNumber;
		
		@FindBy(xpath="//*[@id=\"customer.ssn\"]")
		WebElement ssn;
		
		@FindBy(id="customer.username")
		WebElement userName;
		
		@FindBy(id="customer.password")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"repeatedPassword\"]")
		WebElement confirm;
		
		@FindBy(xpath="//input[@value='Register']")
		WebElement registerButton;
		
		
		//Reusable methods for each webelement 
		
		//Verifying first name is displayed or not
		
		public void enterFirstName(String fName) {
			if(firstName.isDisplayed()) {
				Reporter.log("First Name field is displayed ");
				//Enter first name
				firstName.sendKeys(fName);
				Reporter.log("First Name is "+fName);
			}
			else {
				Reporter.log("First Name is Field not displayed");
			}


		}
		
		public void enterLastName(String lName) {

			//verifying last name is displayed or not
			if(lastName.isDisplayed()) {
				Reporter.log("Last Name field is displayed ");

				//Enter the Last Name
				lastName.sendKeys(lName);
				Reporter.log("The Last Name is " + lName);

			}
			else {
				Reporter.log("Last Name Field is not displayed");
			}



		}
		
		public void enterAddress(String add) {

			//Verifying Street Address is displayed or not
			if(address.isDisplayed()) {
				Reporter.log("Address Field is displayed ");

				//Enter the Street Address
				address.sendKeys(add);
				Reporter.log("Address is " + add);

			}
			else {
				Reporter.log("Street Address Field is Not displayed ");
			}

		}
		
		public void enterCity(String cityName) {

			//Verifying City Text Box is displayed or not 
			if(city.isDisplayed()) {
				Reporter.log("City Text Box is displayed");
				//Enter the City name
				city.sendKeys(cityName);
				Reporter.log("The City Name is "+cityName);

			}
			else {
				Reporter.log("City Text Box is Not displayed");
			}
		}
		
		
		
		public void enterState(String stateName) {

			//Verifying State Text Box is displayed or not 
			if(state.isDisplayed()) {
				Reporter.log("State Text Box is displayed");
				//Enter the State Name
				state.sendKeys(stateName);
				Reporter.log("The State Name is "+stateName);

			}
			else {
				Reporter.log("State Text Box is Not displayed");
			}
		}
		
		public void enterZipCode(String postalCode) {

			//Verifying Postal / Zip Code text field is displayed or not
			if(zipCode.isDisplayed()) {
				Reporter.log("Postal / Zip Code Text Box is displayed");
				//Enter Postal Code
				zipCode.sendKeys(postalCode);
				Reporter.log("The Postal / Zip Code is "+postalCode);

			}
			else {
				Reporter.log("Postal / Zip Code Text Box is Not displayed");
			}
		}
		
		public void enterPhoneNo(String mobNumber) {
			//Verifying the Mobile number Text Box is displayed or not 
			if(phoneNumber.isDisplayed()) {
				Reporter.log("Mobile Number Text field is displayed");
				//Enter mobile number
				phoneNumber.sendKeys(mobNumber);
				Reporter.log("The Mobile Number is " +mobNumber);
			}

			else {
				Reporter.log("Mobile Number Text is not displayed");
			}
		}
		
		public void enterSSN(String ssnNo) {
			//Verifying the SSN number Text Box is displayed or not
			if(ssn.isDisplayed()) {
				Reporter.log("SSN Field is displayed");
				//Enter SSN number
				ssn.sendKeys(ssnNo);
				Reporter.log("The SSN Number is " +ssnNo);
			}

			else {
				Reporter.log("SSN Number Text is not displayed");
			}
		}
		
		public void enterUserName(String uName) {
			//Verifying the User Name Text Box is displayed or not 
			if(userName.isDisplayed()) {
				Reporter.log("User Name Field is displayed");
				//Enter User Name
				userName.sendKeys(uName);
				Reporter.log("The User Name is " +uName);
			}

			else {
				Reporter.log("User Name Text is not displayed");
			}
		}
		
		public void enterPassword(String pass) {
			//Verifying the Password Text Box is displayed or not 
			if(password.isDisplayed()) {
				Reporter.log("Password Field is displayed");
				//Enter Password
				password.sendKeys(pass);
				Reporter.log("Password is " +pass);
			}

			else {
				Reporter.log("Password Text is not displayed");
			}
		}
		
		public void enterConfirmPass(String confirmPWD) {
			//Verifying the Confirm Password Text Box is displayed or not 
			if(confirm.isDisplayed()) {
				Reporter.log("Confirm Password Field is displayed");
				//Enter confirm password
				confirm.sendKeys(confirmPWD);
				Reporter.log("Password is " +confirmPWD);
			}

			else {
				Reporter.log("Confirm Password Text is not displayed");
			}
		}
		
		
		public void clickRegisterButton() {
			if(registerButton.isEnabled()) {
				Reporter.log("The Register Button is Enabled");
				//click on submit button
				registerButton.click();
				Reporter.log("Register Button is clicked");
			}
			else {
				Reporter.log("The Register Button is not Enabled");
			}
		}
			
}

