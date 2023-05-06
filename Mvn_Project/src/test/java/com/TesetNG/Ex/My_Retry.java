package com.TesetNG.Ex;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class My_Retry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		return true;
	}

}
