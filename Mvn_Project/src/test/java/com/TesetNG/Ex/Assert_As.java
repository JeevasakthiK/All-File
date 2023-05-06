package com.TesetNG.Ex;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_As {
	//Hard assert - validation
	//soft assert - verification
	@Test
	private void hard_assert() {
		Assert.assertEquals("Hard", "Hard");
		System.out.println("both are same");
	}
	@Test
	private void soft_assert() {
		SoftAssert s = new SoftAssert();
		s.assertEquals("Hard", "Soft");
		System.out.println("Both are Same");
	}

}
