package com.overridding;

public class NewRidding1 extends NewRidding {
	@Override
		public void myDetails(String name, char initial) {
			// TODO Auto-generated method stub
			super.myDetails(name, initial);
		}
@Override
public void myDetails(long adhaar) {
		super.myDetails(adhaar);
}
private void myDetails1(int dNo,String place,int pincode) {
	System.out.println("My D.No :"+dNo);
	System.out.println("My Native Place :"+place);
	System.out.println("Pincode:"+pincode);

}
public static void main(String[] args) {
	NewRidding1 N =new NewRidding1();
	
	N.myDetails("JEEVASAKTHI",'K');
	N.myDetails(489316106113L);
	N.myDetails1(12,"SALEM",636007);
	
}
}