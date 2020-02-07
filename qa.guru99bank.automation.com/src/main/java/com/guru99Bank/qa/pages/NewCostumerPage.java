package com.guru99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.NewCostumerPageLocators;

public class NewCostumerPage extends Guru99TestBase {
	
	NewCostumerPageLocators newCostumerPageLocators = NewCostumerPageLocators.getInstance();
	Helpers helpers = Helpers.getInstance();
	
	/**
	 * 
	 * @param costumerName
	 */
	public void setCostumerName(String costumerName) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.costumerNameLocator(), costumerName);
	}
	
	/**
	 * 
	 */
	public void selectMale() {
		helpers.clickOnElement(newCostumerPageLocators.maleRadioButton());
	}
	
	/**
	 * 
	 */
	public void selectFemale() {
		helpers.clickOnElement(newCostumerPageLocators.femaleRadioButton());
	}
	
	/**
	 * 
	 * @param dob
	 */
	public void setDateOfBirth(String dob) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.dobLocator(), dob);
	}
	
	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.addressLocator(), address);
	}
	
	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.stateLocator(), state);
	}
	
	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.cityLocator(), city);
	}
	
	/**
	 * 
	 * @param pin
	 */
	public void setPinCode(String pin) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.pinLocator(), pin);
	}
	
	/**
	 * 
	 * @param mobileNumber
	 */
	public void setMobilenumber(String mobileNumber) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.mobileLocator(), mobileNumber);
	}
	
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.emailLocator(), email);
	}
	
	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		helpers.enterTextIntoTextBoxWithoutClear(newCostumerPageLocators.passwordLocator(), password);
	}
	
	/**
	 * 
	 */
	public void clickOnSubmitButton() {
		helpers.clickOnElement(newCostumerPageLocators.submitButtonLocator());
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
		return helpers.getTextOfWebElement(newCostumerPageLocators.costumerNameMessageLocator());
	}

	/**
	 * 
	 * @param maxCharacters
	 * @return
	 */
	public int costumerNameFieldMaxCharacterLength(String maxCharacters) {
		this.setCostumerName(maxCharacters);
		return helpers.getAttributeOfWebElement(newCostumerPageLocators.costumerNameLocator(), "Value").length();
	}

}
