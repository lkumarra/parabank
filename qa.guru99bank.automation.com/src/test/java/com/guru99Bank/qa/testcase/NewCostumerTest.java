package com.guru99Bank.qa.testcase;

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

	@DataProvider
	public Object[][] getDataProvider() {
		return Guru99BankUtil.getData("AddNewCostumer");
	}

	@Test(dataProvider = "getDataProvider")
	public void fillNewCostumerForm(String costumerName, String gender, String dob, String address, String city,
			String state, String pin, String mobileNumber, String email, String password) {
		newCostumer.addNewCostumer(costumerName, gender, dob, address, city, state, pin, mobileNumber, email, password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
