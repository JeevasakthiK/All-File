package com.Constructor1;

public class Constructor {
	public Constructor() {
		System.out.println("Welcome To Greens");
		System.out.println("========================");
	}
	String Name ;
	char Initial ;
	long MobileNo;

	public Constructor(String name , char initial,long number) {
		this.Name = name;
		this.Initial = initial;
		this.MobileNo = number;
		
	}
	public static void main(String[] args) {
		Constructor a = new Constructor();
		Constructor b = new  Constructor("JEEVASAKTHI",'K',9677783073L);
		System.out.println("NAME   : "+b.Name);
		System.out.println("Initial: "+b.Initial);
		System.out.println("Mobile : "+b.MobileNo);
	}
	
	
	
}
