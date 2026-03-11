package com.amazon.order;

public class AmazonOrder{

	public static void main(String[] args){
		OrderDetail o1 = new OrderDetail(123, "Shipped", "pencil", 145);
			o1.display();
			OrderDetail o2 = new OrderDetail(456, "processing", "Book", 699);
			o2.display();
	}
}
