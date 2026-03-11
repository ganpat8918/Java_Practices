package com.march.day09;

public class Driver {

	public static void main(String[] args) {
		
		try
		{
		    String name = null; 
		    int length = name.length(); 

		    System.out.println(" legth is " + length);
		    		}

		catch (Exception e)
		{
		    e.printStackTrace();
		    System.out.println(" unknown error!");
		}

}
}
