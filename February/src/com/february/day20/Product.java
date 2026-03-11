package com.february.day20;

abstract class Productt {
	 public void displayGrocery() {
		 System.out.println("Groceries below");
	 }
	 public void displayElectronics() {
		 System.out.println("Electronics below");
	 }
	 abstract void itemName(String name);
	 abstract void totalPrice(int MRP, int num);
}
class Electronics extends Productt{
	public void itemName(String name) {
		System.out.println("item name: " + name);
	}
	public void totalPrice(int MRP, int num) {
		int total = MRP*num;
		System.out.println("Total price: " + total);
	}
}
class Grocery extends Productt{
	public void itemName(String name) {
		System.out.println("item name: " + name);
	}
	public void totalPrice(int MRP, int num) {
		int total = MRP*num;
		System.out.println("Total price: " + total);
	}
}
public class Product{
	public static void main(String[] args) {
		Electronics e = new Electronics();
		//e.displayGrocery();
		e.itemName("WATCH");
		e.totalPrice(100, 5);
		System.out.println("____________________");
		Grocery g = new Grocery();
		//g.displayElectronics();
		g.itemName("TV");
		g.totalPrice(7000, 6);
		
	}
}