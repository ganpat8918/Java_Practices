package com.rapido.bookingdetails;

public class RapidoBooking {
	String source;
	String destination;
	double fare;
	String bookingType;
	
	RapidoBooking(String _source, String _destination, double _fare){
		source = _source;
		destination = _destination;
		fare = _fare;
		System.out.println("Source : "+source + "\nDestination :"+ destination + "\nFare :" + fare);
		System.out.println("_______________________________________________");
        }
	
	RapidoBooking(String _source, String _bookingType ){
		source = _source;
		bookingType = _bookingType;
		System.out.println("Source : "+source + "\nBooking Type :"+ bookingType);
		System.out.println("_______________________________________________");
        }

	public static void main(String[] args) {
		RapidoBooking user1  = new RapidoBooking("Silk board", "BTM layout", 400);
		RapidoBooking user2 = new RapidoBooking("Whitefield", "Corporate" );

       }

}
