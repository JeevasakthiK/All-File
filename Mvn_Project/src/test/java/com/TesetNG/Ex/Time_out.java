package com.TesetNG.Ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Time_out {

	@Test(timeOut = 8000)
	private void one() {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		
	}
}
