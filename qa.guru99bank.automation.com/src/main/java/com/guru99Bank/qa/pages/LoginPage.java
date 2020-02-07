package com.guru99Bank.qa.pages;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.LoginPageLocators;

public class LoginPage extends Guru99TestBase{
	
	LoginPageLocators loginPageLocators = LoginPageLocators.getInstance();
	Helpers helpers = Helpers.getInstance();

	/**
	 * Enter user name in userid field 
	 * @param userId UserId of the costumer
	 */
	public void setUserName(String userId) {
		helpers.enterTextIntoTextBoxWithoutClear(loginPageLocators.userIDLocator(), userId);
	}
	
	/**
	 * Enter password in password field
	 * @param password Password of the costumer
	 */
	public void setPassword(String password) {
		helpers.enterTextIntoTextBoxWithoutClear(loginPageLocators.passwordLocator(), password);
	}
	
	/**
	 * Click on login button 
	 */
	public void clickOnLoginButton() {
		helpers.clickOnElement(loginPageLocators.loginButtonLocator());
	}
	
	/**
	 * Click on reset button
	 */
	public void clickOnResetButton() {
		helpers.clickOnElement(loginPageLocators.resetButtonLocator());
	}
	/**
	 * 
	 * @param userId UserId of the costumer
	 * @param password Password of the costumer
	 * @return
	 */
	public HomePage login(String userId, String password) {
		this.setUserName(userId);
		this.setPassword(password);
		this.clickOnLoginButton();
		return new HomePage();
	}
}
