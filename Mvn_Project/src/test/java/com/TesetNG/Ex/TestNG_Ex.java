package com.TesetNG.Ex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Ex {
	@BeforeSuite
	private void bs() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	private void bt() {
		System.out.println("Before Test");
	}

	@BeforeClass
	private void bc() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void bm() {
		System.out.println("Before Method");
	}

	@Test
	public void one() {
		System.out.println("Test One");
	}

	@Test
	private void two() {
		System.out.println("Test Two");
	}

	@Test
	private void and() {
		System.out.println("Test And");
	}

	@AfterMethod
	private void am() {
		System.out.println("After Method");
	}

	@AfterClass
	private void ac() {
		System.out.println("After Class");
	}

	@AfterTest
	private void at() {
		System.out.println("After Test");
	}

	@AfterSuite
	private void as() {
		System.out.println("After Suite");
	}
}
