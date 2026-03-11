package com.fundtransfer.transfer;

import com.studentdetails.StudentInfo;

public class Transfer {

	public static void main(String[] args) {
		Transfer.display();
		Transfer.bankDetails();
		StudentInfo.info();
	}
	 private static void bankDetails() {
		 System.out.println("A/c no: 38387643665");
		 System.out.println("IFSC: SBIN0002098");
	 }
	public static void display() {
		System.out.println("Amount is:1000");
		
	}
}
