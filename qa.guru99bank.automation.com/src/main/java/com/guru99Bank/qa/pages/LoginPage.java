package com.guru99Bank.qa.pages;

import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.LoginPageLocators;

public class LoginPage extends  LoginPageLocators{
	Helpers helpers = Helpers.getInstance();
	
	public LoginPage() {
		super();
	}

	/**
	 * Enter user name in userid field 
	 * @param userId UserId of the costumer
	 */
	public void setUserName(String userIdcostumer) {
		helpers.enterTextIntoTextBoxWithoutClear(userId, userIdcostumer);
	}
	
	/**
	 * Enter password in password field
	 * @param password Password of the costumer
	 */
	public void setPassword(String passwordCostumer) {
		helpers.enterTextIntoTextBoxWithoutClear(password, passwordCostumer);
	}
	
	/**
	 * Click on login button 
	 */
	public void clickOnLoginButton() {
		helpers.clickOnElement(loginButton);
	}
	
	/**
	 * Click on reset button
	 */
	public void clickOnResetButton() {
		helpers.clickOnElement(resetButton);
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
