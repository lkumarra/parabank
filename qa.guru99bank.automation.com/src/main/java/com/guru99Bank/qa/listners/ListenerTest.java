package com.guru99Bank.qa.listners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.guru99Bank.qa.base.Guru99TestBase;

public class ListenerTest extends Guru99TestBase implements ITestListener {
	
	Logger logger = LogManager.getLogger(ListenerTest.class);

	@Override
	public void onFinish(ITestContext Result) {
		logger.info("Execution compeleted on " + new Date());
	}

	@Override
	public void onStart(ITestContext Result) {
		logger.info("Execution start on " + new Date());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		logger.error(Result.getName() + " is failed on : " + new Date());
		try {
			File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Src, new File(
					"C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\guru99bankscreenshots\\"
							+ Result.getName() + ".png"));
		} catch (IOException e) {

		}
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		logger.warn(Result.getName() + " is skipped on : " + new Date());
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		logger.info(Result.getName() + " is started on : " + new Date());
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		logger.info(Result.getName() + " is passed on : " + new Date());
		System.out.println(Result.getName() + " is passed on : " + new Date());
	}

}