
public class sum {
	static int num1 = 100;
	static int num2 = 500;
public static void main(String args[]) {
	getSum();
	getProduct();
}
static int getSum() {
	int sum = num1+num2;
	System.out.println("Sum of two nos are: " + sum);
	return sum;
}
static int getProduct() {
	int multiply = num1*num2;
	System.out.println("product of two nos are: " + multiply);
	return multiply;
}
}
