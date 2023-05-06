package com.TesetNG.Ex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	@Test(dataProvider = "data")
	private void login(String user, int pass) {
		System.out.println(user);
		System.out.println(pass);
	}

	@DataProvider
	private Object[][] data() {
		return new Object[][] {
			{ "abc@gmail.com", 12345 },
			{ "xyz@gmail.com", 98765 } 
			};
	}
}
