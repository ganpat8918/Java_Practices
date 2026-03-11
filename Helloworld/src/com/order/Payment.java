package com.order;

public class Payment extends Person{
	String name;
	int age;
	String gender;
	Payment(String _name, int _age, String _gender){
		this(_name, _age, _gender, "defaultcode");
		}
	Payment(String _name, int _age, String _gender, String code){
		super();
		this.name = _name;
		this.age = _age;
		this.gender = _gender;
		System.out.println(code);
	}
	public static void main(String args[]) {
		Payment p1 = new Payment("Ganesh", 22, "male");
		System.out.println(p1.name + "\n "+ p1.age + "\n " + p1.gender);
	}
}