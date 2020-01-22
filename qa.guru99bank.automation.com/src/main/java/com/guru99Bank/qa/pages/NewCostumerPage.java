package com.guru99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;

public class NewCostumerPage extends Guru99TestBase {

	int time = 30;
	/**
	 * Web elements to be initialized by using page Page Factory
	 */
	@FindBy(name = "name")
	WebElement costumerNameLocator;

	@FindBy(xpath = "//input[@value = 'm']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//input[@value = 'f']")
	WebElement femaleRadioButton;

	@FindBy(name = "dob")
	WebElement dobLocator;

	@FindBy(xpath = "//textarea[@name = 'addr']")
	WebElement addressLocator;

	@FindBy(name = "city")
	WebElement cityLocator;

	@FindBy(name = "state")
	WebElement stateLocator;

	@FindBy(name = "pinno")
	WebElement pinLocator;

	@FindBy(name = "telephoneno")
	WebElement mobileLocator;

	@FindBy(name = "emailid")
	WebElement emailLocator;

	@FindBy(name = "password")
	WebElement passwordLocator;

	@FindBy(xpath = "//input[@value  = \"Submit\"]")
	WebElement submitButton;

	@FindBy(xpath = "//input[@value  = \"Reset\"]")
	WebElement restButton;

	@FindBy(css = "label#message")
	WebElement costumerNameMessage;

	/**
	 * Costructor to initialize page factory
	 */
	public NewCostumerPage() {
		PageFactory.initElements(driver, this);
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
		Helpers.sendKeys(costumerNameLocator, time, costumerName);
		if (gender.equals("Male")) {
			Helpers.click(maleRadioButton, time);
		} else {
			Helpers.click(femaleRadioButton, time);
		}
		Helpers.sendKeys(dobLocator, time, dob);
		Helpers.sendKeys(addressLocator, time, address);
		Helpers.sendKeys(cityLocator, time, city);
		Helpers.sendKeys(stateLocator, time, state);
		Helpers.sendKeys(pinLocator, time, pin);
		Helpers.sendKeys(mobileLocator, time, mobileNumber);
		Helpers.sendKeys(emailLocator, time, email);
		Helpers.sendKeys(passwordLocator, time, password);
		Helpers.click(submitButton, time);
	}

	/**
	 * Verify the name field while entering invalid characters
	 * 
	 * @param invalidCostumerName Invalid characters user wants to enter
	 * @return Return the message while user user enter the invalid characters
	 */
	public String costumerNameInvalidCharacterVerify(String invalidCostumerName) {
		Helpers.sendKeys(costumerNameLocator, time, invalidCostumerName);
		return Helpers.getText(costumerNameMessage, time);
	}

	public int costumerNameFieldMaxCharacterLength(String maxCharacters) {
		Helpers.sendKeys(costumerNameLocator, time, maxCharacters);
		System.out.println(Helpers.getAttribute(costumerNameLocator, time, "value").length());
		return Helpers.getAttribute(costumerNameLocator, time, "value").length();
	}

}
