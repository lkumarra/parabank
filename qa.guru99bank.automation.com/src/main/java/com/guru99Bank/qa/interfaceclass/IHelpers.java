package com.guru99Bank.qa.interfaceclass;

import org.openqa.selenium.WebElement;

public interface IHelpers {

	public void clickOnElement(WebElement element);

	public void clearText(WebElement element);

	public void enterTextIntoTextBox(WebElement element, String text);

	public void enterTextIntoTextBoxWithoutClear(WebElement element, String text);

	public String getTextOfWebElement(WebElement element);

	public String getAttributeOfWebElement(WebElement element, String attribute);

	public void moveToElement(WebElement element);

	public String getAlertText();

	public void acceptAlert();

	public void dismissAlert();

	public boolean isDisplayed(WebElement element);

}
