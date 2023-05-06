package com.overloading;

public class MyInfo {
	// For String and Char datatype
	public void myDetails(String name , char initial) {
		System.out.println("My Name : "+name+"."+initial);
	}
	// For int and string datatype
	public void myDetails(int dNo , String place , int pincode ) {
		System.out.println("My D.No : "+dNo+" | My Native Place : "+place+" | Pincode : "+pincode);
	}
	// For Long
	public void myDetails(long adhaar) {
		System.out.println("My Adhaar No: "+adhaar);
	}
		
	// For Float and double
	public void myDetails(float cgpa, double average) {
		System.out.println("My CGPA : "+cgpa);
		System.out.println("My Average is : "+average);
		}
	// main method
	public static void main(String[] args) {
	//object creation	
		MyInfo J = new MyInfo();
	//method calling
		J.myDetails("JEEVASAKTHI",'K');
		J.myDetails(112, "SALEM",636007);
		J.myDetails(489316106113L);
		J.myDetails(6.48f,64.48888d);
	
	}

}
