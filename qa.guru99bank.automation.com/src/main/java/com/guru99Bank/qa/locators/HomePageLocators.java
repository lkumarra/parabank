package com.guru99Bank.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;

public class HomePageLocators extends Guru99TestBase {

	static HomePageLocators homePageLocators;

	/**
	 * 
	 * @return
	 */
	public static HomePageLocators getInstance() {
		if (homePageLocators == null) {
			homePageLocators = new HomePageLocators();
		}
		return homePageLocators;
	}

	/**
	 * Web Elements to initialize by page factory
	 */
	@FindBy(xpath = "//marquee[@class = 'heading3']")
	public static WebElement welcomeMessage;

	@FindBy(css = "tr.heading3>td:first-child")
	public static WebElement managerId;

	@FindBy(xpath = "//a[contains(text(), 'New Customer')]")
	public static WebElement newCostumerLink;

	@FindBy(xpath = "//a[contains(text(), 'Edit Customer')]")
	public static WebElement editCostumerLink;

	@FindBy(xpath = "//a[text() ='Delete Customer']")
	public static WebElement deleteCostumerLink;

	@FindBy(xpath = "//a[text() ='New Account']")
	public static WebElement newAccountLink;

	@FindBy(xpath = "//a[text() ='Edit Account']")
	public static WebElement editAccountLink;

	@FindBy(xpath = "//a[text() ='Delete Account']")
	public static WebElement deleteAccountLink;

	@FindBy(xpath = "//a[text() ='Deposit']")
	public static WebElement depositLink;

	@FindBy(xpath = "//a[text() ='Withdrawal']")
	public static WebElement withdrawlLink;

	@FindBy(xpath = "//a[text() ='Fund Transfer']")
	public static WebElement fundTransfer;

	@FindBy(xpath = "//a[text() ='Change Password']")
	public static WebElement changePasswordLink;

	@FindBy(xpath = "//a[text() ='Balance Enquiry']")
	public static WebElement balanceEnquariyLink;

	@FindBy(xpath = "//a[text() ='Mini Statement']")
	public static WebElement miniStatementLink;

	@FindBy(xpath = "//a[text() ='Customised Statement']")
	public static WebElement costumisedStatementLink;

	@FindBy(xpath = "//a[text() ='Log out']")
	public static WebElement logOutLink;

	/**
	 * Constructor to initialize web elements using page factory
	 */
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}
}
