package com.amazon.order;

public class OrderDetail {
	int orderId;
	String orderStatus;
	String itemName;
	double price;
		
		OrderDetail(int _orderId, String _orderStatus, String _itemName, double _price ) {
			orderId = _orderId;
			orderStatus = _orderStatus;
			itemName = _itemName;
			price = _price;

	}
public void display(){
	System.out.println("order ID : " + orderId);
	System.out.println("order status : "+ orderStatus);
	System.out.println("item name : " + itemName);
	System.out.println("Price: " + price);
}
}
