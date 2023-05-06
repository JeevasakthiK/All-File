package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Pro {

	@Test
	private void tc1() {
		System.out.println("TEST CASE : 1");
	}

	@Test
	private void tc2() {
		System.out.println("TEST CASE : 6");
	}

	@Test
	private void tc3() {
		System.out.println("TEST CASE : 4");
	}

	@BeforeMethod
	private void startDate() {
		System.out.println("*** Start Date ***");
	}

	@AfterMethod
	private void endDate() {
		System.out.println("*** End Date ****");
	}

	@BeforeClass
	private void browser() {
		System.out.println("Launch The Browser....");
	}

	@AfterClass
	private void close() {
		System.out.println("Close The Browser....");
	}
	
	@BeforeTest
	
	private void bt() {
		System.out.println("_______Before Test______");
	}
	
	@AfterTest
	private void at() {
		System.out.println("_______After Test______");

	}
	
	@BeforeSuite
	private void beforeSuit() {
		System.out.println(":::::Before Suite:::::");
	}
	
	@AfterSuite
	private void afterSuit() {
		System.out.println(":::::After Suite:::::");

	}
	

}
