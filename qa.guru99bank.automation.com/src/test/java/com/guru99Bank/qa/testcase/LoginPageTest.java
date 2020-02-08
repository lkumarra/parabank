package com.guru99Bank.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.pages.LoginPage;

public class LoginPageTest extends Guru99TestBase {
	LoginPage login;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void verifyUserLoginSuccessfully() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
