package com.february.day13;

public class Registration {
	public static void main(String args[]) {
		Registration reg = new Registration();
		reg.doRegister(4, "BHULU");
		reg.doRegister("4586-1254", "8521-741-9654");
		reg.doRegister("4586-1254", "8521-741-9654", 777);
	}
	public void doRegister(int otp, String mobile) {
		System.out.println("Registration.doRegistr(int otp, String mobile)");
	}
	public void doRegister(String pan, String passport) {
		System.out.println("Registration.doRegistr(String pan, String passport)");
	}
	public void doRegister(String mobile, String aadhar, int otp) {
		System.out.println("Registration.doRegistr(String mobile, String aadhar, int otp)");
	}
}
