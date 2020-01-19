package com.guru99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;

public class HomePage extends Guru99TestBase {

	int time = 30;
	/**
	 * Web Elements to initialize by page factory
	 */
	@FindBy(xpath = "//marquee[@class = 'heading3']")
	WebElement welcomeMessage;
	
	@FindBy(css = "tr.heading3>td:first-child")
	WebElement managerId;
	
	@FindBy(xpath = "//a[contains(text(), 'New Customer')]")
	WebElement newCostumerLink;

	@FindBy(xpath = "//a[contains(text(), 'Edit Customer')]")
	WebElement editCostumerLink;

	@FindBy(xpath = "//a[text() ='Delete Customer']")
	WebElement deleteCostumerLink;

	@FindBy(xpath = "//a[text() ='New Account']")
	WebElement newAccountLink;

	@FindBy(xpath = "//a[text() ='Edit Account']")
	WebElement editAccountLink;

	@FindBy(xpath = "//a[text() ='Delete Account']")
	WebElement deleteAccountLink;

	@FindBy(xpath = "//a[text() ='Deposit']")
	WebElement depositLink;

	@FindBy(xpath = "//a[text() ='Withdrawal']")
	WebElement withdrawlLink;

	@FindBy(xpath = "//a[text() ='Fund Transfer']")
	WebElement fundTransfer;

	@FindBy(xpath = "//a[text() ='Change Password']")
	WebElement changePasswordLink;

	@FindBy(xpath = "//a[text() ='Balance Enquiry']")
	WebElement balanceEnquariyLink;

	@FindBy(xpath = "//a[text() ='Mini Statement']")
	WebElement miniStatementLink;

	@FindBy(xpath = "//a[text() ='Customised Statement']")
	WebElement costumisedStatementLink;

	@FindBy(xpath = "//a[text() ='Log out']")
	WebElement logOutLink;

	/**
	 * Constructor to initialize web elements using page factory
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 *Return the message of welcome message after user login successfully
	 * @return
	 */
	public String verifyWelcomeMessage() {
		return Helpers.getText(welcomeMessage, time);
	}
	
	/**
	 * 
	 * @return
	 */
	public String verifyManagerId() {
		return Helpers.getText(managerId, time);
	}

	/**
	 * Click on new costumer link available on home page
	 * 
	 * @return Return the object of New Costumer page
	 */
	public NewCostumerPage clickOnNewCostumerLink() {
		Helpers.click(newCostumerLink, time);
		return new NewCostumerPage();
	}

	/**
	 * Click on edit costumer link available on home page
	 * 
	 * @return Return the object on Edit costumer page
	 */
	public EditCostumerPage clickOnEditCostumerLink() {
		Helpers.click(editCostumerLink, time);
		return new EditCostumerPage();
	}

	/**
	 * Click on delete costumer link available on home page
	 * 
	 * @return Return the object of Delete costumer page
	 */
	public DeleteCostumerPage clickOnDeleteCostumerLink() {
		Helpers.click(deleteCostumerLink, time);
		return new DeleteCostumerPage();
	}

	/**
	 * Click on new account link available on home page
	 * 
	 * @return Return the object of New account page
	 */
	public NewAccountPage clickOnNewAccountLink() {
		Helpers.click(newAccountLink, time);
		return new NewAccountPage();
	}

	/**
	 * Click on Edit account link available on home page
	 * 
	 * @return Return the object of Edit account page
	 */
	public EditAccountPage clickOnEditAccountLink() {
		Helpers.click(editAccountLink, time);
		return new EditAccountPage();
	}

	/**
	 * Click on Delete account link available on home page
	 * 
	 * @return Return the object of Delete account page
	 */
	public DeleteAccountPage clickOnDeleteAccountLink() {
		Helpers.click(deleteAccountLink, time);
		return new DeleteAccountPage();
	}

	/**
	 * Click on deposit link available on home page
	 * 
	 * @return Return the object of Deposit page
	 */
	public DepositPage clickOnDepositPageLink() {
		Helpers.click(depositLink, time);
		return new DepositPage();
	}

	/**
	 * Click on withdrawal link available on home page
	 * 
	 * @return Return the object of Withdrawl page
	 */
	public WithdrawlPage clickOnWithDrawlLink() {
		Helpers.click(withdrawlLink, time);
		return new WithdrawlPage();
	}

	/**
	 * Click on the fund transfer link available on home page
	 * 
	 * @return Return the object of Fund Transfer Page
	 */
	public FundTransferPage clickOnFundTransferLink() {
		Helpers.click(fundTransfer, time);
		return new FundTransferPage();
	}

	/**
	 * Click on change password link available on home page
	 * 
	 * @return Return the object of Change password page
	 */
	public ChangePasswordPage clickOnChangePasswordLink() {
		Helpers.click(changePasswordLink, time);
		return new ChangePasswordPage();
	}

	/**
	 * Click on BalanceEnquiry link available on home page
	 * 
	 * @return Return the object of Balance Enquiry Page
	 */
	public BalanceEnquiryPage clickOnBalanceEnquiryLink() {
		Helpers.click(balanceEnquariyLink, time);
		return new BalanceEnquiryPage();
	}

	/**
	 * Click on Ministatement link available on home page
	 * 
	 * @return Return the object of Ministatement page
	 */
	public MiniStatementPage clickOnMiniStatementLink() {
		Helpers.click(miniStatementLink, time);
		return new MiniStatementPage();
	}

	/**
	 * Click on costumised link available on home page
	 * 
	 * @return Return the object of Costumised page
	 */
	public CostumisedPage clickOnCostumisedLink() {
		Helpers.click(costumisedStatementLink, time);
		return new CostumisedPage();
	}

	/**
	 * Click on logout link available on home page
	 * 
	 * @return Return the object of Log out page
	 */
	public LogoutPage clickOnLogoutLink() {
		Helpers.click(logOutLink, time);
		return new LogoutPage();
	}
}
