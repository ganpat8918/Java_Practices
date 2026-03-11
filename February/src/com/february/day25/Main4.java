package com.february.day25;
class Employee implements Cloneable{
	public String name;
	public int age;
	public Employee(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
}
}
public class Main4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Ganesh", 45);
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1.name + " " + e1.age);
	}

}

