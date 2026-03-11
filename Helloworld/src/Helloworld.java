
public class Helloworld {
	int balance = 100;
public static void main(String args[]) {
	System.out.println("inside main....START");
	doSomething();
	System.out.println("Inside main...END");
}
static void doSomething() {
	System.out.println("Helloworld.doSomething()....START");
	System.out.println("Doing something");
	Helloworld hello = new Helloworld();
	hello.balance = 230;
	System.out.println("Helloworld.doSomething()....END");
}
}
