package com.TesetNG.Ex;

import org.testng.annotations.Test;

public class Retry_Test {
	
	@Test(retryAnalyzer = My_Retry.class)
	private void one() {
		System.out.println("Retry Test");
		System.out.println(1/0);
	}

}
