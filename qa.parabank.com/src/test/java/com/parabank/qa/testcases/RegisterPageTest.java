package com.parabank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.RegisterPage;
import com.parabank.qa.pages.WelcomePage;
import com.parabank.qa.utils.TestUtils;

public class RegisterPageTest extends TestBase{
	 WelcomePage welcomePage;
	 RegisterPage register ;
	 
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		driver.get(prop.getProperty("url"));
		welcomePage = new WelcomePage();
		register = welcomePage.clickOnRegister();
	}
	
	@DataProvider
	public  Object [][] dataProvider() {
		return TestUtils.getData("ParaBankCostumerRegistration");
	}
	
	@Test(dataProvider = "dataProvider")
	public void differentCostumerRegistration(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String ssn, String costumeruserName, String costumerPassword,String repeatedPasword){
		register.registerCostumer(firstName, lastName, address, city, state, zipCode, phoneNumber, ssn, costumeruserName, costumerPassword, repeatedPasword);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
