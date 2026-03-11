package com.february.day09;

public class Mobile {
	private static String brand;
	private static int price;
	public void setPrice(int price)
	{
		if(price<0) {
			this.price = 0;
		}else {
			this.price = price;
		}
     }
	public int getPrice() {
		return price;
	}
	public static void main(String args[]) {
		Mobile m1 = new Mobile();
		m1.setPrice(-1);
		System.out.println("Price is: " + m1.getPrice());
	}
}
