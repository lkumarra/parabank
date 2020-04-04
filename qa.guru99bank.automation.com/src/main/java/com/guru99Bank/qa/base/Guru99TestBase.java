package com.guru99Bank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99TestBase {
	FileInputStream file;
	public static Properties prop;
	public static WebDriver driver;
	static Logger logger = LogManager.getLogger(Guru99TestBase.class);

	/**
	 * Constructor to load properties file
	 */
	public Guru99TestBase() {
		try {
			file = new FileInputStream(
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\config\\Guru99Bank.properties");
			prop = new Properties();
			prop.load(file);
			logger.info("The Guru99Bank.properties file loaded successfullly");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			logger.error("The Guru99Bank.properties file can not be loaded file not found exception occured");
		} catch (Exception e) {
			logger.error("The Guru99Bank.properties file can not be loaded  occured");
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
			logger.info("Chrome driver launched successfully");
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Firefox driver is launched successfully");
		}
		driver.manage().window().maximize();
		logger.info("Window is maximized ");
		driver.manage().deleteAllCookies();
		logger.info("Cookies are deleted successfully");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		logger.info(prop.getProperty("url")+"is launched successfully");
	}

}
