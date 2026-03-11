package com.february.day25;
interface VIP{
	
}
class Customer implements VIP{
	
}
public class Main1 {

	public static void main(String[] args) {
		Object c = new Customer();
		if(c instanceof VIP) {
			System.out.println("Eligible for discount");
		}else {
			System.out.println("Not Eligible for Discount");
		}
	}

}
