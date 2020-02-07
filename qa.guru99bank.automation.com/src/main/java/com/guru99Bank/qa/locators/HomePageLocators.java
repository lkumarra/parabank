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
	private WebElement welcomeMessage;

	@FindBy(css = "tr.heading3>td:first-child")
	private WebElement managerId;

	@FindBy(xpath = "//a[contains(text(), 'New Customer')]")
	private WebElement newCostumerLink;

	@FindBy(xpath = "//a[contains(text(), 'Edit Customer')]")
	private WebElement editCostumerLink;

	@FindBy(xpath = "//a[text() ='Delete Customer']")
	private WebElement deleteCostumerLink;

	@FindBy(xpath = "//a[text() ='New Account']")
	private WebElement newAccountLink;

	@FindBy(xpath = "//a[text() ='Edit Account']")
	private WebElement editAccountLink;

	@FindBy(xpath = "//a[text() ='Delete Account']")
	private WebElement deleteAccountLink;

	@FindBy(xpath = "//a[text() ='Deposit']")
	private WebElement depositLink;

	@FindBy(xpath = "//a[text() ='Withdrawal']")
	private WebElement withdrawlLink;

	@FindBy(xpath = "//a[text() ='Fund Transfer']")
	private WebElement fundTransfer;

	@FindBy(xpath = "//a[text() ='Change Password']")
	private WebElement changePasswordLink;

	@FindBy(xpath = "//a[text() ='Balance Enquiry']")
	private WebElement balanceEnquariyLink;

	@FindBy(xpath = "//a[text() ='Mini Statement']")
	private WebElement miniStatementLink;

	@FindBy(xpath = "//a[text() ='Customised Statement']")
	private WebElement costumisedStatementLink;

	@FindBy(xpath = "//a[text() ='Log out']")
	private WebElement logOutLink;

	/**
	 * Constructor to initialize web elements using page factory
	 */
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Return the locator of welcome message on homepage.
	 * 
	 * @return Welcomemessage locator.
	 */
	public WebElement welcomeMessageLocator() {
		return this.welcomeMessage;
	}

	/**
	 * Return the locator of manager id
	 * 
	 * @return ManagerID Locator.
	 */
	public WebElement managerIDLocator() {
		return this.managerId;
	}

	/**
	 * Return the locator of new costumer link
	 * 
	 * @return New Costumer Link Locator
	 */
	public WebElement newCostumerLinkLocator() {
		return this.newCostumerLink;
	}

	/**
	 * Return the locator of edit costumer link
	 * 
	 * @return Edit costumer Link Locator
	 */
	public WebElement editCostumerLinkLocator() {
		return this.editCostumerLink;
	}

	/**
	 * 
	 * @return
	 */
	public WebElement deleteCostumerLinkLocator() {
		return this.deleteCostumerLink;
	}

	/**
	 * Return new account link locator
	 * 
	 * @return New account link locator
	 */
	public WebElement newAccountLinkLocator() {
		return this.newAccountLink;
	}

	/**
	 * Return edit account link locator
	 * 
	 * @return Edit Account Locator
	 */
	public WebElement editAccountLinkLocator() {
		return this.editAccountLink;
	}

	/**
	 * Return delete account link locator
	 * 
	 * @return Delete account locator
	 */
	public WebElement deleteAccountLinkLocator() {
		return this.deleteAccountLink;
	}

	/**
	 * Return Deposit link locator
	 * 
	 * @return Deposit locator
	 */
	public WebElement depositLinkLocator() {
		return this.depositLink;
	}

	/**
	 * Return withdrawl link locator
	 * 
	 * @return Withdrawl link locator
	 */
	public WebElement withdrawlLinkLocator() {
		return this.withdrawlLink;
	}

	/**
	 * Return Fund Transfer Link Locator
	 * 
	 * @return Fund Transfer Locator
	 */
	public WebElement fundTransferLinkLocator() {
		return this.fundTransfer;
	}

	/**
	 * Return Change Password Link Locator
	 * 
	 * @return Change Password Locator
	 */
	public WebElement changePasswordLinkLocator() {
		return this.changePasswordLink;
	}

	/**
	 * Return Balance Enquiry Locator
	 * 
	 * @return Balance Enquiry Locator
	 */
	public WebElement balanceEnquariyLinkLocator() {
		return this.balanceEnquariyLink;
	}

	/**
	 * Retrun Mini Statement Link Locator
	 * 
	 * @return Mini Statement Locator
	 */
	public WebElement miniStatementLinkLocator() {
		return this.miniStatementLink;
	}

	/**
	 * Return Costumized Link Locator
	 * 
	 * @return Costumized Locator
	 */
	public WebElement costumisedStatementLinkLocator() {
		return this.costumisedStatementLink;
	}

	/**
	 * Return LogOut Link Locator
	 * 
	 * @return Logout locator
	 */
	public WebElement logOutLinkLocator() {
		return this.logOutLink;
	}
}
