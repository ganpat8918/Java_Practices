package com.students.classtest;

public class EmployeeDetails {
	String name;
	int empId;
	String address;
	float salary;
	EmployeeDetails(String _name, int _empId, String _address, float _salary) {
		name = _name;
		empId = _empId;
		address = _address;
		salary = _salary;
	}
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Employee : " + empId);
		System.out.println("Address :" + address);
		System.out.println("Salary :" + salary);
	}
}
