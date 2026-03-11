
public class Car {
	String brand;
	int price;
	Car(String _brand, int _price){
		brand = _brand;
		price = _price;
		System.out.println("Brand :"+ brand + "\nPrice :" + price);
		System.out.println("main constructor ends here!");
	}
	Car(Car c){
		brand = c.brand;
		price = c.price;
		System.out.println("Brand :"+ brand + "\nPrice :" + price);
		System.out.println("copy constructor ends here!");
		
	}
	
	public static void main(String args[]) {
		Car c1 = new Car("BMW", 45000);
		Car c2 = new Car(c1);
	}
}
