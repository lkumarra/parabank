package com.guru99Bank.qa.pages;


import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.HomePageLocators;

public class HomePage extends HomePageLocators {
	Helpers helpers = Helpers.getInstance();

	public HomePage() {
		super();
	}
	/**
	 * Return the message of welcome message after user login successfully
	 * 
	 * @return
	 */
	public String verifyWelcomeMessage() {
		return helpers.getTextOfWebElement(welcomeMessage);
	}

	/**
	 * 
	 * @return
	 */
	public String verifyManagerId() {
		return helpers.getTextOfWebElement(managerId);
	}

	/**
	 * Click on new costumer link available on home page
	 * 
	 * @return Return the object of New Costumer page
	 */
	public NewCostumerPage clickOnNewCostumerLink() {
		helpers.clickOnElement(newCostumerLink);
		return new NewCostumerPage();
	}

	/**
	 * Click on edit costumer link available on home page
	 * 
	 * @return Return the object on Edit costumer page
	 */
	public EditCostumerPage clickOnEditCostumerLink() {
		helpers.clickOnElement(editCostumerLink);
		return new EditCostumerPage();
	}

	/**
	 * Click on delete costumer link available on home page
	 * 
	 * @return Return the object of Delete costumer page
	 */
	public DeleteCostumerPage clickOnDeleteCostumerLink() {
		helpers.clickOnElement(deleteCostumerLink);
		return new DeleteCostumerPage();
	}

	/**
	 * Click on new account link available on home page
	 * 
	 * @return Return the object of New account page
	 */
	public NewAccountPage clickOnNewAccountLink() {
		helpers.clickOnElement(newAccountLink);
		return new NewAccountPage();
	}

	/**
	 * Click on Edit account link available on home page
	 * 
	 * @return Return the object of Edit account page
	 */
	public EditAccountPage clickOnEditAccountLink() {
		helpers.clickOnElement(editAccountLink);
		return new EditAccountPage();
	}

	/**
	 * Click on Delete account link available on home page
	 * 
	 * @return Return the object of Delete account page
	 */
	public DeleteAccountPage clickOnDeleteAccountLink() {
		helpers.clickOnElement(deleteAccountLink);
		return new DeleteAccountPage();
	}

	/**
	 * Click on deposit link available on home page
	 * 
	 * @return Return the object of Deposit page
	 */
	public DepositPage clickOnDepositPageLink() {
		helpers.clickOnElement(depositLink);
		return new DepositPage();
	}

	/**
	 * Click on withdrawal link available on home page
	 * 
	 * @return Return the object of Withdrawl page
	 */
	public WithdrawlPage clickOnWithDrawlLink() {
		helpers.clickOnElement(withdrawlLink);
		return new WithdrawlPage();
	}

	/**
	 * Click on the fund transfer link available on home page
	 * 
	 * @return Return the object of Fund Transfer Page
	 */
	public FundTransferPage clickOnFundTransferLink() {
		helpers.clickOnElement(fundTransfer);
		return new FundTransferPage();
	}

	/**
	 * Click on change password link available on home page
	 * 
	 * @return Return the object of Change password page
	 */
	public ChangePasswordPage clickOnChangePasswordLink() {
		helpers.clickOnElement(changePasswordLink);
		return new ChangePasswordPage();
	}

	/**
	 * Click on BalanceEnquiry link available on home page
	 * 
	 * @return Return the object of Balance Enquiry Page
	 */
	public BalanceEnquiryPage clickOnBalanceEnquiryLink() {
		helpers.clickOnElement(balanceEnquariyLink);
		return new BalanceEnquiryPage();
	}

	/**
	 * Click on Ministatement link available on home page
	 * 
	 * @return Return the object of Ministatement page
	 */
	public MiniStatementPage clickOnMiniStatementLink() {
		helpers.clickOnElement(miniStatementLink);
		return new MiniStatementPage();
	}

	/**
	 * Click on costumised link available on home page
	 * 
	 * @return Return the object of Costumised page
	 */
	public CostumisedPage clickOnCostumisedLink() {
		helpers.clickOnElement(costumisedStatementLink);
		return new CostumisedPage();
	}

	/**
	 * Click on logout link available on home page
	 * 
	 * @return Return the object of Log out page
	 */
	public LogoutPage clickOnLogoutLink() {
		helpers.clickOnElement(logOutLink);
		return new LogoutPage();
	}
}
