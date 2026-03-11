package com.fundtransfer.user;

import com.fundtransfer.transfer.Transfer;

public class User {
	static String name = "Bhulu";
	
	public static void main(String[] args) {
		System.out.println("username: " + name);
		Transfer.display();
		Transfer.bankDetails();
	}

}
