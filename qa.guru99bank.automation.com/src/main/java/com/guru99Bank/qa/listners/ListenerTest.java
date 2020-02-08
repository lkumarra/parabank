package com.guru99Bank.qa.listners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Colors;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.guru99Bank.qa.base.Guru99TestBase;

public class ListenerTest extends Guru99TestBase implements ITestListener {

	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("Execution compeleted on " + new Date());
	}

	@Override
	public void onStart(ITestContext Result) {
		System.out.println("Execution start on " + new Date());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println(Result.getName() + " is failed on : " + new Date());
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
		System.out.println(Result.getName() + " is skipped on : " + new Date());
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " is started on : " + new Date());
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println(Result.getName() + " is passed on : " + new Date());
	}

}