package com.parabank.qa.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parabank.qa.base.TestBase;

public class Helpers extends TestBase {
	static WebDriverWait wait;
	static Actions action;
	/**
	 * 
	 * @param element
	 * @param time
	 */
	public static void elementToBeClickaleWait(WebElement element,int time) {
		wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 */
	public static void elementToBeVisibleWait(WebElement element,int time) {
		wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	 
	/**
	 * 
	 * @param element
	 * @param time
	 */
	public static void click(WebElement element,int time) {
		elementToBeClickaleWait(element,time);
		element.click();
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 * @param text
	 */
	public static void sendKeys(WebElement element,int time,String text) {
		elementToBeClickaleWait(element,time);
		element.sendKeys(text);
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 * @return
	 */
	public static String getText(WebElement element,int time) {
		elementToBeVisibleWait(element,time);
		return element.getText();
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 * @param attribute
	 * @return
	 */
	public static String getAttribute(WebElement element,int time,String attribute) {
		elementToBeVisibleWait(element,time);
		return element.getAttribute(attribute);
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 */
	public static void moveToElement(WebElement element,int time) {
		elementToBeVisibleWait(element,time);
		action.moveToElement(element).build().perform();
	}
	
	/**
	 * 
	 * @param element
	 * @param time
	 * @return
	 */
	public static boolean isDisplayed(WebElement element,int time) {
			elementToBeVisibleWait(element,time);
			return element.isDisplayed();
	}


}
