package com.guru99Bank.qa.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.interfaceclass.IHomePage;
import com.guru99Bank.qa.locators.HomePageLocators;

public class HomePage extends HomePageLocators implements IHomePage {
	Helpers helpers = Helpers.getInstance();
	Logger logger = LogManager.getLogger(HomePage.class);

	public HomePage() {
		super();
	}
	/**
	 * Return the message of welcome message after user login successfully
	 * 
	 * @return
	 */
	public String verifyWelcomeMessage() {
		logger.info("verifyWelcomeMessage() method is executing");
		return helpers.getTextOfWebElement(welcomeMessage);
	}

	/**
	 * 
	 * @return
	 */
	public String verifyManagerId() {
		logger.info("verifyManagerId() method is executing");
		return helpers.getTextOfWebElement(managerId);
	}

	/**
	 * Click on new costumer link available on home page
	 * 
	 * @return Return the object of New Costumer page
	 */
	public NewCostumerPage clickOnNewCostumerLink() {
		logger.info("clickOnNewCostumerLink() method is executing");
		helpers.clickOnElement(newCostumerLink);
		logger.info("Click on new costumer link present on homepage");
		return new NewCostumerPage();
	}

}
