package com.february.day09;

public class Student {
	private String name;
	private String address;
	
	public void setValues(String _name, String _address) {
		name = _name;
		address = _address;
	}
	public String getName() {
		return address;
	}
	
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.setValues("Ganesh", "BLR");
		System.out.println("name is :"+ s1.getName());
		
	}
}
	
