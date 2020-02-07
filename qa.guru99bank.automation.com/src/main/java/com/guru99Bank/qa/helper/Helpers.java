package com.guru99Bank.qa.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99Bank.qa.base.Guru99TestBase;
import com.guru99Bank.qa.interfaceclass.IHelpers;

public class Helpers extends Guru99TestBase implements IHelpers {
	static WebDriverWait wait;
	static Actions action;
	static int time = 30;
	static Helpers helpers;

	/**
	 * 
	 * @return
	 */
	public static Helpers getInstance() {
		if (helpers == null) {
			helpers = new Helpers();
		}
		return helpers;
	}

	/**
	 * 
	 * @param element
	 */
	public static void elementToBeClickaleWait(WebElement element) {
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * 
	 * @param element
	 */
	public static void elementToBeVisibleWait(WebElement element) {
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * 
	 * @param element
	 */
	public void clickOnElement(WebElement element) {
		elementToBeClickaleWait(element);
		element.click();
	}

	/**
	 * 
	 * @param element
	 */
	public void clearText(WebElement element) {
		elementToBeClickaleWait(element);
		element.clear();
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void enterTextIntoTextBox(WebElement element, String text) {
		elementToBeClickaleWait(element);
		this.clearText(element);
		element.sendKeys(text);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void enterTextIntoTextBoxWithoutClear(WebElement element, String text) {
		elementToBeClickaleWait(element);
		element.sendKeys(text);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public String getTextOfWebElement(WebElement element) {
		elementToBeVisibleWait(element);
		return element.getText();
	}

	/**
	 * 
	 * @param element
	 * @param attribute
	 * @return
	 */
	public String getAttributeOfWebElement(WebElement element, String attribute) {
		elementToBeVisibleWait(element);
		return element.getAttribute(attribute);
	}

	/**
	 * 
	 * @param element
	 */
	public void moveToElement(WebElement element) {
		elementToBeVisibleWait(element);
		action.moveToElement(element).build().perform();
	}

	/**
	 * 
	 * @return
	 */
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	/**
	 * 
	 */
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	/**
	 * 
	 */
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean isDisplayed(WebElement element) {
		elementToBeVisibleWait(element);
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
}
