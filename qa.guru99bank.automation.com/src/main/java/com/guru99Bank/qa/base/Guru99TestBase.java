package com.guru99Bank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99TestBase {
	FileInputStream file;
	public static Properties prop;
	public static WebDriver driver;

	/**
	 * Constructor to load properties file
	 */
	public Guru99TestBase() {
		try {
			file = new FileInputStream(
					"C:\\selenium\\Pom\\PageObjectModel-master\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\config\\Guru99Bank.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will initialize the browser to perform testing.
	 */
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

}
