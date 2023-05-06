package org.sof;

public class ApiTesting implements Manual {

	@Override
	public void framework() {
		System.out.println("Automation Testing Method");
	}

	@Override
	public void TestCase() {
		System.out.println("Manual Testing Method");
	}
	private void restAssured() {
		System.out.println("API Testing Method");
	}
	public static void main(String[] args) {
		ApiTesting a = new ApiTesting();
		a.framework();
		a.restAssured();
		a.TestCase();
	}
}
