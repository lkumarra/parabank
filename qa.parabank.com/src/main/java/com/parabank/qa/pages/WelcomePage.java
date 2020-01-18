package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.helpers.Helpers;

public class WelcomePage extends TestBase{
	int time=30;
	/**
	 * Page Factory Element Initialization
	 */
	
	@FindBy(css = "li.Solutions")
	WebElement solutions;
	
	@FindBy(xpath = "//li[@class='Solutions']//following-sibling::li[1]")
	WebElement aboutus;
	
	@FindBy(xpath = "//li[@class='Solutions']//following-sibling::li[2]")
	WebElement services;
	
	@FindBy(xpath = "//li[@class='Solutions']//following-sibling::li[3]")
	WebElement products;
	
	@FindBy(xpath = "//li[@class='Solutions']//following-sibling::li[4]")
	WebElement locations;
	
	@FindBy(xpath = "//li[@class='Solutions']//following-sibling::li[5]")
	WebElement adminPage;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text() = 'Forgot login info?']")
	WebElement forgotLoginInfo;
	
	@FindBy(xpath = "//a[text() = 'Register']")
	WebElement register;
	
	/**
	 * welcome page constructor will initialize the page factory
	 */
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * click on forgot login info link present on welcome page
	 * @return object of forgot login info page
	 */
	public ForgotLoginInfo clickOnForgotLoginInfo() {
		Helpers.click(forgotLoginInfo, time);
		return new ForgotLoginInfo();
	}
	
	/**
	 * Click on register link present on welcome page 
	 * @return Return the object of register page
	 */
	public RegisterPage clickOnRegister() {
		Helpers.click(register, time);
		return new RegisterPage();
	}
	/***
	 * enter the login credentials for login 
	 * @param userName User name of the login person
	 * @param userPassword password of the login person
	 * @return Return the object of home page
	 */
	public HomePage costumerLogin(String userName, String userPassword) {
		Helpers.sendKeys(username, time, userName);
		Helpers.sendKeys(password, time, userPassword);
		Helpers.click(loginButton, time);
		return new HomePage();
	}

	
}
