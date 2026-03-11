package com.orders;

public class ControlFloww {

	public static void main(String[] args) {
		ControlFloww control = new ControlFloww();
		String customerType ="gold";
		switch(customerType) {
		case "gold":
			control.sendRewards(customerType);
			System.out.println("gold type customer");
			break;
		case "silver":
			control.sendRewards(customerType);
			break;
			default:
				break;
		}

	}
	public void sendRewards(String type) {
		System.out.println("Sending rewards to "+type +"customer");
	}

}
