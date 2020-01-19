package com.guru99Bank.qa.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99Bank.qa.base.Guru99TestBase;

public class Helpers extends Guru99TestBase {
	static WebDriverWait wait;
	static Actions action;
	
	public static void elementToBeClickaleWait(WebElement element,int time) {
		wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void elementToBeVisibleWait(WebElement element,int time) {
		wait =new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	 
	public static void click(WebElement element,int time) {
		elementToBeClickaleWait(element,time);
		element.click();
	}
	
	public static void sendKeys(WebElement element,int time,String text) {
		elementToBeClickaleWait(element,time);
		element.sendKeys(text);
	}
	
	public static String getText(WebElement element,int time) {
		elementToBeVisibleWait(element,time);
		return element.getText();
	}
	
	
	public static String getAttribute(WebElement element,int time,String attribute) {
		elementToBeVisibleWait(element,time);
		return element.getAttribute(attribute);
	}
	
	public static void moveToElement(WebElement element,int time) {
		elementToBeVisibleWait(element,time);
		action.moveToElement(element).build().perform();
	}
	
	public static boolean isDisplayed(WebElement element,int time) {
			elementToBeVisibleWait(element,time);
			return element.isDisplayed();
	}


}
