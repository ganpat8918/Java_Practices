package com.orders;

public class CustomerRewards {
	String customerType;
	void rewards(String _customerType) {
		this.customerType = _customerType;
		switch(customerType){
		case "gold":
			System.out.println("Eligible for 10% Discount");
			break;
		case "silver":
			System.out.println("Eligible for 5% Discount");
			break;
		case "platinum":
			System.out.println("Eligible for 5% Discount");
			break;
			default:
				System.out.println("Not eligible for diascount");
				break;
			
		}
	}

	public static void main(String[] args) {
		CustomerRewards c1 = new CustomerRewards();
		c1.rewards("silver");
	}

}
