package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.helpers.Helpers;

public class HomePage extends TestBase {
	int time = 30;
	/**
	 * Page factory initialization of Home Page
	 */
	@FindBy(xpath = "//a[contains(text() , 'New Account')]")
	WebElement openNewAccount;
	
	@FindBy(xpath = "//a[contains(text() , 'Accounts Overview')]")
	WebElement accountOverview;
	
	@FindBy(xpath = "//a[contains(text() , 'Transfer Funds')]")
	WebElement transferFunds;
	
	@FindBy(xpath = "//a[contains(text() , 'Bill Pay')]")
	WebElement billPay;
	
	@FindBy(xpath = "//a[contains(text() , 'Find Transactions')]")
	WebElement findTransactions;
	
	@FindBy(xpath = "//a[contains(text() , 'Update Contact Info')]")
	WebElement updateContactInfo;
	
	@FindBy(xpath = "//a[contains(text() , 'Request Loan')]")
	WebElement requestLoan;
	
	@FindBy(xpath = "//a[contains(text() , 'Log Out')]")
	WebElement logOut;
	
	/**
	 * Constructor to initialize the Page Factory
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Click on open new account link
	 * @return Return the object of open new account page
	 */
	public OpenNewAccount clickOnOpenNewAccount() {
		Helpers.click(openNewAccount, time);
		return new OpenNewAccount();
	}
	
	/**
	 * Click on account overview link
	 * @return Return the object on Account Overview Page
	 */
	public AccountOverview clickOnAccountOverView() {
		Helpers.click(accountOverview, time);
		return new AccountOverview();
	}
	
	/**
	 * Click on transfer funds link
	 * @return Return the object of Transfer page
	 */
	public TransferFunds clickOnTransferFunds() {
		Helpers.click(transferFunds, time);
		return new TransferFunds();
	}

}
