package com.february.day13;

public class Papa {
	public static void main(String args[]) {
		Papa p = new Bhulu();
		p.print();
	}
	Papa(){
		System.out.println("Papa's constructor");
	}
	public void print() {
		
		System.out.println("papa's method");
	}
}
class Bhulu extends Papa{
	Bhulu(){
		System.out.println("bhulu's constructor");
	}
	public void print() {
		System.out.println("bhulu's method");
	}
}
