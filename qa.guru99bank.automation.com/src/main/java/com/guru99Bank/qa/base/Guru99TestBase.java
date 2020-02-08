package com.guru99Bank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\config\\Guru99Bank.properties");
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
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
