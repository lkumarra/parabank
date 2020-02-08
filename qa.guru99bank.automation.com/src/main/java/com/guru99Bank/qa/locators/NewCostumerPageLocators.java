package com.guru99Bank.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;

public class NewCostumerPageLocators extends Guru99TestBase {

	/**
	 * Web elements to be initialized by using page Page Factory
	 */
	@FindBy(name = "name")
	public static WebElement costumerNameLocator;

	@FindBy(xpath = "//input[@value = 'm']")
	public static WebElement maleRadioButton;

	@FindBy(xpath = "//input[@value = 'f']")
	public static WebElement femaleRadioButton;

	@FindBy(name = "dob")
	public static WebElement dobLocator;

	@FindBy(xpath = "//textarea[@name = 'addr']")
	public static WebElement addressLocator;

	@FindBy(name = "city")
	public static WebElement cityLocator;

	@FindBy(name = "state")
	public static WebElement stateLocator;

	@FindBy(name = "pinno")
	public static WebElement pinLocator;

	@FindBy(name = "telephoneno")
	public static WebElement mobileLocator;

	@FindBy(name = "emailid")
	public static WebElement emailLocator;

	@FindBy(name = "password")
	public static WebElement passwordLocator;

	@FindBy(xpath = "//input[@value  = \"Submit\"]")
	public static WebElement submitLocator;

	@FindBy(xpath = "//input[@value  = \"Reset\"]")
	public static WebElement restButtonLocator;

	@FindBy(css = "label#message")
	public static WebElement costumerNameMessageLocator;

	/**
	 * Costructor to initialize page factory
	 */
	public NewCostumerPageLocators() {
		PageFactory.initElements(driver, this);
	}

}
