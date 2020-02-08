package com.guru99Bank.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.pages.HomePage;
import com.guru99Bank.qa.pages.LoginPage;

public class HomePageTest extends Guru99TestBase {
	LoginPage login;
	HomePage homePage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		login = new LoginPage();
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyWelcomePage() {
		Assert.assertEquals(homePage.verifyWelcomeMessage(), "Welcome To Manager's Page of Guru99 Bank");
	}
	
	@Test(priority = 2)
	public void verifyManagerId() {
		Assert.assertEquals(homePage.verifyManagerId(), "Manger Id : mngr242402");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
