package com.order;

public class Order {
	int orderId;
	int customerId;
	String customerName;
	String productName;
	int quantity;
	String orderStatus;
	Order(int _orderId, int _customerId,String _customerName, String _productName, int _quantity, String _orderStatus){
		orderId = _orderId;
		customerId = _customerId;
		customerName = _customerName;
		productName = _productName;
		quantity = _quantity;
		orderStatus = _orderStatus;
		System.out.println("Order ID :" + orderId + "\nCustomer ID : " + customerId + "\nName :" + customerName + "\nProduct Name :"+ productName + "\nQuantity :" + quantity + "\nOrder Status :" + orderStatus );
		System.out.println("_______________________________");
	}
	public static void main(String args[]) {
		Order o1 = new Order(1, 101,"Rahul", "Biscuit", 5, "Dispatched");
		Order o2 = new Order(2, 102,"Ganesh", "Soap", 8, "Processed");
		Order o3 = new Order(3, 103,"Bishal", "Biscuit", 5, "Dispatched");
		Order o4 = new Order(4, 104,"Piyush", "cake", 6, "Dispatched");
		Order o5 = new Order(5, 105,"Ankit", "Colddrink", 11, "Dispatched");
		Order o6 = new Order(6, 106,"Raj", "Chay", 54, "Dispatched");
		Order o7 = new Order(7, 107,"Abhishek", "Detergent", 20, "Dispatched");
		Order o8 = new Order(8, 108,"Sahu", "Shampoo", 10, "Dispatched");
	}
}
