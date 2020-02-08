package com.guru99Bank.qa.pages;

import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.NewCostumerPageLocators;

public class NewCostumerPage extends NewCostumerPageLocators {

	Helpers helpers = Helpers.getInstance();

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
		this.setCostumerName(costumerName);
		if (gender.equals("Male")) {
			this.selectMale();
		} else {
			this.selectMale();
		}
		this.setDateOfBirth(dob);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
		this.setPinCode(pin);
		this.setMobilenumber(mobileNumber);
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnSubmitButton();
	}

	/**
	 * Verify the name field while entering invalid characters
	 * 
	 * @param invalidCostumerName Invalid characters user wants to enter
	 * @return Return the message while user user enter the invalid characters
	 */
	public String costumerNameInvalidCharacterVerify(String invalidCostumerName) {
		this.setCostumerName(invalidCostumerName);
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
