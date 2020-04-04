package com.guru99Bank.qa.testcase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.pages.LoginPage;

public class LoginPageTest extends Guru99TestBase {
	LoginPage login;
	Logger logger = LogManager.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		logger.info("******************************Set up started**********************");
		initialization();
		login = new LoginPage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		logger .info("Login with username "+prop.getProperty("username")+ "and password " +  prop.getProperty("password"));
		logger.info("*******************************Setup Completed************************");
	}

	@Test
	public void verifyUserLoginSuccessfully() {
		logger.info("*******************************Test case started*************************");
		logger.info("********************************verifyUserLoginSuccessfully()***********************");
		String title = driver.getTitle();
		logger.info("The title of page is "+ title);
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
		logger.info("************************************Test case completed**********************");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("Chrome is close successfully");
	}
}
