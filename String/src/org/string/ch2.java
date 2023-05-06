package org.string;

public class ch2 {
	public static void main(String[] args) {
		String s1 = "InmakesInfotech";
		// to find the last index of 'o'
		int last = s1.lastIndexOf("o");
		System.out.println("S1 last index of 'o'   : " + last);

		// to find the first index of 'o'
		String s2 = "SeleniumAutomationTool";
		int first = s2.indexOf("o");
		System.out.println("S2 first Index of 'o'  : " + first);

		// to find index of 'k'
		String s3 = "Jeevasakthi";
		int mid = s3.indexOf("k");
		System.out.println("S3 index of 'k'        : " + mid);

		// to find the last index of space
		String s4 = " j a v a p r o g r a m ";
		int last1 = s4.lastIndexOf(" ");
		System.out.println("S4 last index of space : " + last1);

		// to find index of '0'
		String s5 = "9677783073";
		int num = s5.indexOf("0");
		System.out.println("S5 index of '0'        : " + num);

	}

}
