package com.amazon.order;

public class Management extends ManagementSuper {
	int employeeId;
	String name;
	int salary;
	Management(int _employeeId, String _name){
		this(_employeeId,_name, 4578);
	}
	Management(int _employeeId, String _name, int _salary){
		super();
		this.employeeId = _employeeId;
		this.name = _name;
		this.salary = _salary;
	}
	public static void main(String args[]) {
		Management m1 = new Management(111, "Ganesh");
		System.out.println(m1.employeeId + "\n " + m1.name + "\n" + m1.salary);
		Management m2 = new Management(123, "Rahul", 8954);
		System.out.println(m2.employeeId + "\n" + m2.name + "\n" + m2.salary);
	}
}
