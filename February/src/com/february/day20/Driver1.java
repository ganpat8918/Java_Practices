package com.february.day20;
class Payment implements Cloneable{
	public String name;
	public int amount;
	public Payment(String _name, int _amount) {
		this.name = _name;
		this.amount = _amount;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
public class Driver1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Payment pay1 = new Payment("Ganesh", 10000);
		Payment pay2 = (Payment) pay1.clone();
		System.out.println(pay2.name +" "+ pay2.amount);
	}
}
