package com.actitme.genriclib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * @author Vikraman
 */

public class ListenerImpClass implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String failedTestName=result.getMethod().getMethodName();
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		/* create a newFile inside the frameWork */
		File dstFile = new File("./screen/" + failedTestName + ".png");
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException e) {
		}
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
