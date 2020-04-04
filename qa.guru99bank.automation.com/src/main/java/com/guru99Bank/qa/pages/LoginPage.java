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
		logger.info("setUserName() method is executing");
		helpers.enterTextIntoTextBoxWithoutClear(userId, userIdcostumer);
		logger.info("costumer id "+userIdcostumer+"is filled ");
	}
	
	/**
	 * Enter password in password field
	 * @param password Password of the costumer
	 */
	public void setPassword(String passwordCostumer) {
		logger.info("setPassword() method is executing ");
		helpers.enterTextIntoTextBoxWithoutClear(password, passwordCostumer);
		logger.info("Password "+ passwordCostumer+ "is filled");
	}
	
	/**
	 * Click on login button 
	 */
	public void clickOnLoginButton() {
		logger.info("clickOnLoginButton() method is executing " );
		helpers.clickOnElement(loginButton);
		logger.info("Click on login button");
	}
	
	/**
	 * Click on reset button
	 */
	public void clickOnResetButton() {
		logger.info("clickOnResetButton() method is executing ");
		helpers.clickOnElement(resetButton);
		logger.info("Click on reset button");
	}
	/**
	 * 
	 * @param userId UserId of the costumer
	 * @param password Password of the costumer
	 * @return
	 */
	public HomePage login(String userId, String password) {
		logger.info("login() method is executing " );
		this.setUserName(userId);
		logger.info("User id "+userId+ "is filled");
		this.setPassword(password);
		logger.info("User id "+password+ "is filled");
		this.clickOnLoginButton();
		return new HomePage();
	}
}
