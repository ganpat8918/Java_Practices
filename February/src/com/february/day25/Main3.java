package com.february.day25;
interface AdminOnly{
}

class AdminUser implements AdminOnly{
	public void deleteData() {
		System.out.println("able to delete");
	}
}
class NormalUser {
	public void deleteData() {
		System.out.println("Not able to delete");
	}
}
public class Main3 {

	public static void main(String[] args) {
		Object a = new AdminUser();
		Object b = new AdminUser();
		
		checkAndDelete(a);
		checkAndDelete(b);
	}
	static void checkAndDelete(Object obj) {
		if(obj instanceof AdminOnly) {
			System.out.println("Granted");
			((AdminUser)obj).deleteData();
		}else {
            System.out.println("Access denied ❌ Not an admin.");
        }
	}
}
