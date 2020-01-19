package com.guru99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;

public class LoginPage extends Guru99TestBase{
	
	int time = 30;
	/**
	 * Webelement to initialize by page factory
	 */
	@FindBy(name = "uid")
	WebElement userIdLocator;
	
	@FindBy(name = "password")
	WebElement passwordLocator;
	
	@FindBy(name = "btnLogin")
	WebElement loginButton;
	
	@FindBy(name = "btnReset")
	WebElement resetButton;
	
	/**
	 * Constructor to initialize the page factory
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	public HomePage login(String userId, String password) {
		Helpers.sendKeys(userIdLocator, time, userId);
		Helpers.sendKeys(passwordLocator, time, password);
		Helpers.click(loginButton, time);
		return new HomePage();
	}
}
