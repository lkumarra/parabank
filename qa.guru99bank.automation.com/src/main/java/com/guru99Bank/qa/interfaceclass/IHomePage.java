package com.guru99Bank.qa.interfaceclass;

import com.guru99Bank.qa.pages.NewCostumerPage;

public interface IHomePage {

	/**
	 * Return the message of welcome message after user login successfully
	 */
	public String verifyWelcomeMessage();

	/**
	 * 
	 */
	public String verifyManagerId();

	/**
	 * Click on new costumer link available on home page
	 */
	public NewCostumerPage clickOnNewCostumerLink();

}
