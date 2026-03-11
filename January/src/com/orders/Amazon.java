package com.orders;
        class Order{
        	Order(){
        		System.out.println("1st Line");
        	}
        }

   public class Amazon extends Order {
	   Amazon(){
		   this(1);
		   System.out.println("3rd Line");
	   }
	   Amazon(int x){
		     super();
	   System.out.println("2nd Line" + x);
	   }
   
   public static void main(String args[]) {
	   Amazon a1 = new Amazon();
	   System.out.println("4th line");
   }
   }


