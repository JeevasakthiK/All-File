package org.col;

public class DepartmentInfo {
	private void ug(String depName,char block) {
		System.out.println("Department : "+ depName);
		System.out.println("Block      : "+ block);
		
	}
	private void ug(int count,float Average) {
		System.out.println("Total Count: "+ count);
		System.out.println("Average    : "+ Average);
	}
	public static void main(String[] args) {
		DepartmentInfo d =new DepartmentInfo();
		d.ug("Information Technology", 'A');
		d.ug(58, 64.48f);
	}

}
