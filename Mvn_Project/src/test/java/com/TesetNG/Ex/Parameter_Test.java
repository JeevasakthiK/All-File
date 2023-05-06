package com.TesetNG.Ex;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	@Test
	@Parameters({"username","pass"})
	private void Para_Test(String s, int i) {
		System.out.println(s);
		System.out.println(i);
		

	}

}
