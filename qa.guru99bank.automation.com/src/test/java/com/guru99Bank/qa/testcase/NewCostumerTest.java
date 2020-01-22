package com.guru99Bank.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.pages.HomePage;
import com.guru99Bank.qa.pages.LoginPage;
import com.guru99Bank.qa.pages.NewCostumerPage;
import com.guru99Bank.qa.util.Guru99BankUtil;

public class NewCostumerTest extends Guru99TestBase {
	LoginPage login;
	HomePage homePage;
	NewCostumerPage newCostumer;

	@BeforeMethod
	public void setUp() {
		initialization();
		driver.get(prop.getProperty("url"));
		login = new LoginPage();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		newCostumer = homePage.clickOnNewCostumerLink();
	}

	@Test(priority = 1)
	public void verifyCostumerNameFieldByEnteringNumber() {
		Assert.assertEquals(newCostumer.costumerNameInvalidCharacterVerify("123456"), "Numbers are not allowed");
	}

	@Test(priority = 2)
	public void verifyCostumerNameFieldByEnteringSpecialCharacter() {
		Assert.assertEquals(newCostumer.costumerNameInvalidCharacterVerify("@#$%^^&"),
				"Special characters are not allowed");
	}

	@Test(priority = 3)
	public void verifyCostumerNameFieldByEnteringSpace() {
		Assert.assertEquals(newCostumer.costumerNameInvalidCharacterVerify("    "),
				"First character can not have space");
	}

	@Test(priority = 4)
	public void verifyCostumerNameFieldLength() {
		Assert.assertEquals(newCostumer.costumerNameFieldMaxCharacterLength("abcdefghijklmnopqrstuvwxyz"), 25,
				"Costumer name field is taking more than 25 characters");
	}

	@DataProvider
	public Object[][] getDataProvider() {
		return Guru99BankUtil.getData("AddNewCostumer");
	}

	@Test(priority = 4, dataProvider = "getDataProvider")
	public void fillNewCostumerForm(String costumerName, String gender, String dob, String address, String city,
			String state, String pin, String mobileNumber, String email, String password) {
		newCostumer.addNewCostumer(costumerName, gender, dob, address, city, state, pin, mobileNumber, email, password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
