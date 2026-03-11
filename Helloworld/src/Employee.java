
public class Employee {
	int id;
	String name;
	Employee(int _id,String _name){
		id = _id;
		name = _name;
		System.out.println("ID : "+ id + " name : " + name);
	}
	public static void main(String[] args) {
		Employee e = new Employee(124, "BHULU");
	}

}
