package com.guru99Bank.qa.testcase;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.interfaceclass.IHomePage;
import com.guru99Bank.qa.pages.HomePage;
import com.guru99Bank.qa.pages.LoginPage;

public class HomePageTest extends Guru99TestBase {
	LoginPage login;
	IHomePage homePage;
	Logger logger = LogManager.getLogger(HomePageTest.class);
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		logger.info("********************************Setup started*************************");
		initialization();
		login = new LoginPage();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		logger .info("Login with username "+prop.getProperty("username")+ "and password " +  prop.getProperty("password"));
		logger.info("*******************************Setup Completed************************");
	}

	@Test(priority = 1)
	public void verifyWelcomePage() {
		logger.info("*******************************Test case started*************************");
		logger.info("********************************verifyWelcomePage()***********************");
		Assert.assertEquals(homePage.verifyWelcomeMessage(), "Welcome To Manager's Page of Guru99 Bank");
		logger.info("*********************************Test case completed*********************");
	}

	@Test(priority = 2)
	public void verifyManagerId() {
		logger.info("*********************************Test case started**********************");
		logger.info("**************************************verifyManagerId()******************");
		Assert.assertEquals(homePage.verifyManagerId(), "Manger Id : mngr242402");
		logger.info("*****************************************Test case completed***************");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("*****************************Chrome is closed****************************");
	}

}
