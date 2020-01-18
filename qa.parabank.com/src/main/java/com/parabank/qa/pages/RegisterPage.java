package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.helpers.Helpers;

public class RegisterPage extends TestBase{
	 
	int time = 30;
	/**
	 * Initialization of page factory of register page
	 */
	@FindBy(id = "customer.firstName")
	WebElement costumerFirstName;
	
	@FindBy(id = "customer.lastName")
	WebElement costumerLastName;
	
	@FindBy(id = "customer.address.street")
	WebElement costumerAddress;
	
	@FindBy(id = "customer.address.city")
	WebElement costumerCity;
	
	@FindBy(id = "customer.address.state")
	WebElement costumerState;
	
	@FindBy(id = "customer.address.zipCode")
	WebElement costumerZipCode;
	
	@FindBy(id = "customer.phoneNumber")
	WebElement costumerPhoneNumber;
	
	@FindBy(id = "customer.ssn")
	WebElement costumerSsn;
	
	@FindBy(id = "customer.username")
	WebElement costumerUserName;
	
	@FindBy(id = "customer.password")
	WebElement costumerPassWord;
	
	@FindBy(id = "repeatedPassword")
	WebElement repeatPassWord;
	
	@FindBy(xpath = "//input[@value = 'Register']")
	WebElement registerButton;
	
	/**
	 * Constructor to Initialize the page factory
	 */
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Enter the personal details to register a new costumer
	 * @param firstName First Name of the costumer
	 * @param lastName Last Name of the costumer
	 * @param address Address of the costumer
	 * @param city City of the costumer
	 * @param state State of the costumer
	 * @param zipCode  Zip code of the costumer
	 * @param phoneNumber Phone number of the costumer
	 * @param ssn Security number of the costumer
	 * @param costumeruserName User name costume wants to login after registration
	 * @param costumerPassword Password costumer wants to login 
	 * @param repeatedPasword  Password for the confirmation
	 */
	public void registerCostumer(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String ssn, String costumeruserName, String costumerPassword, String repeatedPasword) {
		Helpers.sendKeys(costumerFirstName, time, firstName);
		Helpers.sendKeys(costumerLastName, time, lastName);
		Helpers.sendKeys(costumerAddress, time, address);
		Helpers.sendKeys(costumerCity, time, city);
		Helpers.sendKeys(costumerState, time, state);
		Helpers.sendKeys(costumerZipCode, time, zipCode);
		Helpers.sendKeys(costumerPhoneNumber, time, phoneNumber);
		Helpers.sendKeys(costumerSsn, time, ssn);
		Helpers.sendKeys(costumerUserName, time, costumeruserName);
		Helpers.sendKeys(costumerPassWord, time, costumerPassword);
		Helpers.sendKeys(repeatPassWord, time, repeatedPasword);
		Helpers.click(registerButton, time);
	}

}
