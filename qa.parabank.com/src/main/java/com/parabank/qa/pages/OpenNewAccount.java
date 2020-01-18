package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.helpers.Helpers;

public class OpenNewAccount extends TestBase{
	Select select;
	int time = 30;
	/**
	 * Web element initialization using page factory
	 */ 
	@FindBy(css = "select#type")
	WebElement accountType;
	
	@FindBy(css = "select#fromAccountId")
	WebElement selectAcconut;
	
	@FindBy(css = "selectAcconut")
	WebElement openAccountButton;
	
	/**
	 * Constructor to initialize page factory
	 */
	public OpenNewAccount() {
		PageFactory.initElements(driver, this);
	}
	
	/***
	 * Select the account type and account number while opening account
	 * @param selectAccontType Account type to select 
	 * @param selectAccountNumber Account number to select
	 */
	public void selectAccountToOpenAccount(String selectAccontType, String selectAccountNumber) {
		select = new Select(accountType);
		select.selectByVisibleText(selectAccontType);
		select = new Select(selectAcconut);
		select.selectByVisibleText(selectAccountNumber);
		Helpers.click(openAccountButton, time);
	}

	
}
