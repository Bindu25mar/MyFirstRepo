package com.GenericUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUtility implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("onStart Executed-STARTED",true);
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("onFinish Executed-ENDED",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("ontestSuccess Executed-PASS",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure Executed-FAILED",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped Executed-SKIPPED",true);
	}
	
	

}
