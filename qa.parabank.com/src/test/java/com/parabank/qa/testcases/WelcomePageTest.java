package com.parabank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.WelcomePage;

public class WelcomePageTest extends TestBase {
	WelcomePage welcomePage;
	
	@BeforeMethod
	public void setUp() {
		intialization();
		driver.get(prop.getProperty("url"));
		welcomePage = new WelcomePage();
		welcomePage.costumerLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void userLoginSuccessfullyVerification() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
