package com.orders;
class Name{
	Name(){
		System.out.println("piyush");
		System.out.println("Inside super constructor");
		}
	}
public class Test extends Name {
	String name;

	Test(){
		this("Bhulu");
		}
		Test(String _name){
			super();
			this.name = _name;
			System.out.println("Inside constructor 1"+ name);
		}
public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println("Inside main");
		}
}
