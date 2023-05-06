package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_4 extends BaseClass {
	@Test(priority = 3)
	private void tc1() {
		System.out.println("test case 1");
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S302253897%3A1682489251179993&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AQMjQ7RPlrHCEoNbVzGZ4vJa67Yh7oQ44qyqkT4Ha4USGpQFp4jI1S4LPU5G1GCyqRkwWpJbDplI&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		maxi();
	}

	@Test(priority = 2)
	private void tc2() {
		System.out.println("test case 2");

		launchUrl("https://inmakes.com/");
		maxi();
	
	}

	@Test(priority = 1)
	private void tc3() {
		System.out.println("test case 3");

		launchUrl("https://www.redbus.in/");
		maxi();
		String currentUrl = currentUrl();
		System.out.println(currentUrl);
	}
	
	@Test
	private void tc4() {
		System.out.println("test case 4");

		launchUrl("https://www.flipkart.com/");
		maxi();
	}
	
	@Test(priority = -1)
	private void tc5() {
		System.out.println("test case 5");

		launchUrl("https://www.amazon.in/");
		maxi();
	}
	
	@Test(priority = -2)
	private void tc6() {
		System.out.println("test case 6");

		launchUrl("https://www.facebook.com/");
		maxi();
		String title = title();
		System.out.println(title);
	}
	
	@Test(priority = -3)
	private void tc7() {
		System.out.println("test case 7");

		launchUrl("https://www.youtube.com/");
		maxi();
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
	
	@BeforeSuite
	private void beforeSuit() {
		System.out.println(":::::Before Suite:::::");
	}
	
	@AfterSuite
	private void afterSuit() {
		System.out.println(":::::After Suite:::::");

	}
	
}
