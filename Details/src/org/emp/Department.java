package org.emp;

public class Department extends Employee {

	@Override
	void employeeDesignation() {
		System.out.println("Designation : Software Tester");
	}

	@Override
	public void employeeName() {
		System.out.println("Employee Name : JEEVA");
	}
	private void departmentName() {
		System.out.println("Department: Testing");
	}
	public static void main(String[] args) {
		Department d = new Department();
		d.employeeName();
		d.employeeDesignation();
		d.departmentName();
	}
}
