package com.guru99Bank.qa.pages;


import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.helper.Helpers;
import com.guru99Bank.qa.locators.HomePageLocators;

public class HomePage extends Guru99TestBase {
	HomePageLocators homePageLocators = HomePageLocators.getInstance();
	Helpers helpers = Helpers.getInstance();

	/**
	 * Return the message of welcome message after user login successfully
	 * 
	 * @return
	 */
	public String verifyWelcomeMessage() {
		return helpers.getTextOfWebElement(homePageLocators.welcomeMessageLocator());
	}

	/**
	 * 
	 * @return
	 */
	public String verifyManagerId() {
		return helpers.getTextOfWebElement(homePageLocators.managerIDLocator());
	}

	/**
	 * Click on new costumer link available on home page
	 * 
	 * @return Return the object of New Costumer page
	 */
	public NewCostumerPage clickOnNewCostumerLink() {
		helpers.clickOnElement(homePageLocators.newCostumerLinkLocator());
		return new NewCostumerPage();
	}

	/**
	 * Click on edit costumer link available on home page
	 * 
	 * @return Return the object on Edit costumer page
	 */
	public EditCostumerPage clickOnEditCostumerLink() {
		helpers.clickOnElement(homePageLocators.editCostumerLinkLocator());
		return new EditCostumerPage();
	}

	/**
	 * Click on delete costumer link available on home page
	 * 
	 * @return Return the object of Delete costumer page
	 */
	public DeleteCostumerPage clickOnDeleteCostumerLink() {
		helpers.clickOnElement(homePageLocators.deleteCostumerLinkLocator());
		return new DeleteCostumerPage();
	}

	/**
	 * Click on new account link available on home page
	 * 
	 * @return Return the object of New account page
	 */
	public NewAccountPage clickOnNewAccountLink() {
		helpers.clickOnElement(homePageLocators.newAccountLinkLocator());
		return new NewAccountPage();
	}

	/**
	 * Click on Edit account link available on home page
	 * 
	 * @return Return the object of Edit account page
	 */
	public EditAccountPage clickOnEditAccountLink() {
		helpers.clickOnElement(homePageLocators.editAccountLinkLocator());
		return new EditAccountPage();
	}

	/**
	 * Click on Delete account link available on home page
	 * 
	 * @return Return the object of Delete account page
	 */
	public DeleteAccountPage clickOnDeleteAccountLink() {
		helpers.clickOnElement(homePageLocators.deleteAccountLinkLocator());
		return new DeleteAccountPage();
	}

	/**
	 * Click on deposit link available on home page
	 * 
	 * @return Return the object of Deposit page
	 */
	public DepositPage clickOnDepositPageLink() {
		helpers.clickOnElement(homePageLocators.depositLinkLocator());
		return new DepositPage();
	}

	/**
	 * Click on withdrawal link available on home page
	 * 
	 * @return Return the object of Withdrawl page
	 */
	public WithdrawlPage clickOnWithDrawlLink() {
		helpers.clickOnElement(homePageLocators.withdrawlLinkLocator());
		return new WithdrawlPage();
	}

	/**
	 * Click on the fund transfer link available on home page
	 * 
	 * @return Return the object of Fund Transfer Page
	 */
	public FundTransferPage clickOnFundTransferLink() {
		helpers.clickOnElement(homePageLocators.fundTransferLinkLocator());
		return new FundTransferPage();
	}

	/**
	 * Click on change password link available on home page
	 * 
	 * @return Return the object of Change password page
	 */
	public ChangePasswordPage clickOnChangePasswordLink() {
		helpers.clickOnElement(homePageLocators.changePasswordLinkLocator());
		return new ChangePasswordPage();
	}

	/**
	 * Click on BalanceEnquiry link available on home page
	 * 
	 * @return Return the object of Balance Enquiry Page
	 */
	public BalanceEnquiryPage clickOnBalanceEnquiryLink() {
		helpers.clickOnElement(homePageLocators.balanceEnquariyLinkLocator());
		return new BalanceEnquiryPage();
	}

	/**
	 * Click on Ministatement link available on home page
	 * 
	 * @return Return the object of Ministatement page
	 */
	public MiniStatementPage clickOnMiniStatementLink() {
		helpers.clickOnElement(homePageLocators.miniStatementLinkLocator());
		return new MiniStatementPage();
	}

	/**
	 * Click on costumised link available on home page
	 * 
	 * @return Return the object of Costumised page
	 */
	public CostumisedPage clickOnCostumisedLink() {
		helpers.clickOnElement(homePageLocators.costumisedStatementLinkLocator());
		return new CostumisedPage();
	}

	/**
	 * Click on logout link available on home page
	 * 
	 * @return Return the object of Log out page
	 */
	public LogoutPage clickOnLogoutLink() {
		helpers.clickOnElement(homePageLocators.logOutLinkLocator());
		return new LogoutPage();
	}
}
