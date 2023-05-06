package org.test;

import java.awt.AWTException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_5 extends BaseClass {
	@Test
	private void tc2() {
		System.out.println("Test Case 2  ");
	}
	@DataProvider(name = "Amazon Data")
	private Object data() {
		
		return new Object[][] {
			{"mens tshirt"},
			{"mens shirt"},
			{"mens jeans"},
			{"Dresses For Womens"}	
			};

	}
	
	@Test(dataProvider = "Amazon Data")
	private void tc1(String s) throws AWTException {
	
		launchUrl("https://www.amazon.in/");
		maxi();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		value(search, s);
		//WebElement serBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//serBtn.click();
		enter();
	}
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	private void browser() {
		System.out.println("Launch The Browser....");
		launchBrowser();
	}

	@AfterClass
	private void close() {
		System.out.println("Close The Browser....");
		crunt_tab();
	}
	
	@BeforeTest
	
	private void bt() {
		System.out.println("_______Before Test______");
	}
	
	@AfterTest
	private void at() {
		System.out.println("_______After Test______");

	}
	
}
