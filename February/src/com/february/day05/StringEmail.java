package com.february.day05;

public class StringEmail {

	public static void main(String[] args) {
		String firstName = "Ganesh";
		int orderNo = 101;
		String status = "Shipped";
		String company = "Kodewala";
		StringBuilder sb = new StringBuilder("Dear " + firstName);
		sb.append("\nThank you for reaching out. ");
		sb.append("Your order " + orderNo + " has been successfully placed ");
		sb.append("and current status is :" +status );
		sb.append("\nThanks ");
		sb.append(company);
		System.out.println(sb);
	}

}
