package org.SampleJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_Samp {

	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}

	@Test
	public void tc5() {
		System.out.println("Test Case 5");
	}

	@Before
	public void startDate() {
		System.out.println("Start Date...");
	}

	@AfterClass
	public static void close() {
		System.out.println("Close the Browser...");
	}

	@After
	public void endDate() {
		System.out.println("End Date...");
	}

	@BeforeClass
	public static void brow() {
		System.out.println("Browser Launch....");
	}

	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}

	@Ignore
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}

}
