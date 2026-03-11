package com.orders;

public class NullCheck {
	public static void main(String args[]) {
		String [] electronicProducts = {"Laptop","Smartphone", null, "smartwatch", "Bluetooth speaker", "wireless headphone","power bank", null};
		for(int index = 0; index<electronicProducts.length; index++) {
			System.out.println("Executing loop...." + index + "time");
				String currentProduct = electronicProducts[index];
				if(currentProduct == null) {
					System.out.println("found null product");
					continue;
				}
		}
	}
}
