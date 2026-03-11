
public class OrderDetails {
	
	public static void main(String args[]) {
		 String itemName = args[0];
		 int itemPrice = Integer.parseInt(args[1]);
		 int quantity = Integer.parseInt(args[2]);
		 int gst = Integer.parseInt(args[3]);
		System.out.println("item name : " + itemName + "item price : "+ itemPrice + "item quantity : " + quantity + "gst is: " + gst );

	}

}
