package com.guru99Bank.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;

public class LoginPageLocators extends Guru99TestBase {
	
	static LoginPageLocators loginPageLocators;
	
	/**
	 * 
	 * @return
	 */
	public static LoginPageLocators getInstance() {
		if(loginPageLocators == null) {
			loginPageLocators = new LoginPageLocators();
		}
		return loginPageLocators;
	}
	
	/**
	 * Webelement to initialize by page factory
	 */
	@FindBy(name = "uid")
	private WebElement userId;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "btnLogin")
	private WebElement loginButton;
	
	@FindBy(name = "btnReset")
	private WebElement resetButton;
	
	/**
	 * Constructor to initialize the page factory
	 */
	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Return user id locator
	 * @return user id locator
	 */
	public WebElement userIDLocator() {
		return this.userId;
	}
	
	/**
	 * Return password locator
	 * @return password locator
	 */
	public WebElement passwordLocator() {
		return this.password;
	}
	
	/**
	 * Return loginbutton locator
	 * @return Login Button Locator
	 */
	public WebElement loginButtonLocator() {
		return this.loginButton;
	}
	
	/**
	 * Return reset button locator
	 * @return Reset button locator
	 */
	public WebElement resetButtonLocator() {
		return this.resetButton;
	}
	

}
