package com.guru99Bank.qa.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.interfaceclass.ILoginPage;
import com.guru99Bank.qa.locators.LoginPageLocators;

public class LoginPage extends  LoginPageLocators implements ILoginPage{
	Helpers helpers = Helpers.getInstance();
	Logger logger =  LogManager.getLogger(LoginPage.class);
	
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
		logger.info("login is started" );
		this.setUserName(userId);
		logger.info("Username " + userId + "is entered");
		this.setPassword(password);
		logger.info("Password "+password+ "is entered");
		this.clickOnLoginButton();
		logger.info("Clicked on login Button");
		return new HomePage();
	}
}
