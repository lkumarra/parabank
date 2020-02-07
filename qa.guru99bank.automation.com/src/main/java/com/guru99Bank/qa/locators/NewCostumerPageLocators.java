package com.guru99Bank.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;

public class NewCostumerPageLocators extends Guru99TestBase {
	
	static NewCostumerPageLocators newCostumerPageLocators;
	
	/**
	 * 
	 * @return
	 */
	public static NewCostumerPageLocators getInstance() {
		if(newCostumerPageLocators == null) {
			newCostumerPageLocators = new NewCostumerPageLocators();
		}
		return newCostumerPageLocators;
	}
	
	/**
	 * Web elements to be initialized by using page Page Factory
	 */
	@FindBy(name = "name")
	private WebElement costumerName;

	@FindBy(xpath = "//input[@value = 'm']")
	private WebElement maleRadioButton;

	@FindBy(xpath = "//input[@value = 'f']")
	private WebElement femaleRadioButton;

	@FindBy(name = "dob")
	private WebElement dob;

	@FindBy(xpath = "//textarea[@name = 'addr']")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "pinno")
	private WebElement pin;

	@FindBy(name = "telephoneno")
	private WebElement mobile;

	@FindBy(name = "emailid")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@value  = \"Submit\"]")
	private WebElement submit;

	@FindBy(xpath = "//input[@value  = \"Reset\"]")
	private WebElement restButton;

	@FindBy(css = "label#message")
	private WebElement costumerNameMessage;

	/**
	 * Costructor to initialize page factory
	 */
	public NewCostumerPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement costumerNameLocator() {
		return this.costumerName;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement maleRadioButton() {
		return this.maleRadioButton;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement femaleRadioButton() {
		return this.femaleRadioButton;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement dobLocator() {
		return this.dob;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement addressLocator() {
		return this.address;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement cityLocator() {
		return this.city;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement stateLocator() {
		return this.state;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement pinLocator() {
		return this.pin;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement mobileLocator() {
		return this.mobile;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement emailLocator() {
		return this.email;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement passwordLocator() {
		return this.password;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement submitButtonLocator() {
		return this.submit;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement restButtonLocator() {
		return this.restButton;
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement costumerNameMessageLocator() {
		return this.costumerNameMessage;
	}

}
