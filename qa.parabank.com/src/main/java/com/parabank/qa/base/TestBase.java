package com.parabank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	/**
	 * Constructor to initialize the properties file
	 */
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\selenium\\Pom\\PageObjectModel-master\\qa.parabank.com\\src\\main\\java\\com\\parabank\\qa\\config\\config.properties");
			prop.load(file);		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Initialize the webdriver on the basis of data from user and performing some basic operations before starting testing
	 */
	
	public static void intialization() {
		if (prop.getProperty("Browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(prop.getProperty("Browser").equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

}
