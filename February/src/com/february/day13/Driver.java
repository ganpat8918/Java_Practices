package com.february.day13;
 class Employee{
	 public void doTask() {
		 System.out.println("Employee.doTask()");
	 }
}
 class Manager extends Employee{
	 @Override
	 public void doTask() {
		 System.out.println("Manager.doTask()");
	 }
}
 public class Driver {
	    public static void main(String[] args) {
	        Employee e = new Manager();   // Upcasting
	        e.doTask();                   // Prints: Manager.doTask()

	        Manager mgr = new Manager();  // Direct object
	        mgr.doTask();                 // Prints: Manager.doTask()
	    }
	}
