package com.guru99Bank.qa.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.NewCostumerPageLocators;

public class NewCostumerPage extends NewCostumerPageLocators {

	Helpers helpers = Helpers.getInstance();
	Logger logger = LogManager.getLogger(NewCostumerPage.class);

	public NewCostumerPage() {
		super();
	}

	/**
	 * 
	 * @param costumerName
	 */
	public void setCostumerName(String costumerName) {
		helpers.enterTextIntoTextBoxWithoutClear(costumerNameLocator, costumerName);
	}
	/**
	 * 
	 */
	public void selectMale() {
		helpers.clickOnElement(maleRadioButton);
	}

	/**
	 * 
	 */
	public void selectFemale() {
		helpers.clickOnElement(femaleRadioButton);
	}

	/**
	 * 
	 * @param dob
	 */
	public void setDateOfBirth(String dob) {
		helpers.enterTextIntoTextBoxWithoutClear(dobLocator, dob);
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		helpers.enterTextIntoTextBoxWithoutClear(addressLocator, address);
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		helpers.enterTextIntoTextBoxWithoutClear(stateLocator, state);
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		helpers.enterTextIntoTextBoxWithoutClear(cityLocator, city);
	}

	/**
	 * 
	 * @param pin
	 */
	public void setPinCode(String pin) {
		helpers.enterTextIntoTextBoxWithoutClear(pinLocator, pin);
	}

	/**
	 * 
	 * @param mobileNumber
	 */
	public void setMobilenumber(String mobileNumber) {
		helpers.enterTextIntoTextBoxWithoutClear(mobileLocator, mobileNumber);
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		helpers.enterTextIntoTextBoxWithoutClear(emailLocator, email);
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		helpers.enterTextIntoTextBoxWithoutClear(passwordLocator, password);
	}

	/**
	 * 
	 */
	public void clickOnSubmitButton() {
		helpers.clickOnElement(submitLocator);
	}

	/**
	 * Add the details in add new costumer form
	 * 
	 * @param costumerName Name of the costumer
	 * @param gender       Gender of the costumer
	 * @param dob          Date of the birth of the costumer
	 * @param address      Address of the costumer
	 * @param city         City of the costumer
	 * @param state        State of the costumer
	 * @param pin          Pin code of the costumer
	 * @param mobileNumber Mobile Number of the costumer
	 * @param email        Email id if the costumer
	 * @param password     Password of the costumer
	 */
	public void addNewCostumer(String costumerName, String gender, String dob, String address, String city,
			String state, String pin, String mobileNumber, String email, String password) {
		logger.info("Adding new costumer");
		this.setCostumerName(costumerName);
		logger.info("Costumer name " + costumerName + "is entered");
		if (gender.equals("Male")) {
			this.selectMale();
		logger.info("Male is selected");
		} else {
			this.selectMale();
		logger.info("Female is selected");
		}
		this.setDateOfBirth(dob);
		logger.info("Date of birth"+ dob+ "is entered");
		this.setAddress(address);
		logger.info("Address " + address + "is entered");
		this.setCity(city);
		logger.info("City " + city + " is entered");
		this.setState(state);
		logger.info("State " + state +" is entered");
		this.setPinCode(pin);
		logger.info("PIN " + pin + "is entered");
		this.setMobilenumber(mobileNumber);
		logger.info("Mobile number "+ mobileNumber + "is entered");
		this.setEmail(email);
		logger.info("Email " + email + " is enterd" );
		this.setPassword(password);
		logger.info("Password " + password + "is entered");
		this.clickOnSubmitButton();
		logger.info("Clicked on submit button ");
	}

	/**
	 * Verify the name field while entering invalid characters
	 * 
	 * @param invalidCostumerName Invalid characters user wants to enter
	 * @return Return the message while user user enter the invalid characters
	 */
	public String costumerNameInvalidCharacterVerify(String invalidCostumerName) {
		this.setCostumerName(invalidCostumerName);
		logger.info(invalidCostumerName + "is entered");
		logger.info(helpers.getTextOfWebElement(costumerNameMessageLocator)+ "message on costumer name field");
		return helpers.getTextOfWebElement(costumerNameMessageLocator);
	}

	/**
	 * 
	 * @param maxCharacters
	 * @return
	 */
	public int costumerNameFieldMaxCharacterLength(String maxCharacters) {
		this.setCostumerName(maxCharacters);
		return helpers.getAttributeOfWebElement(costumerNameLocator, "Value").length();
	}

}
