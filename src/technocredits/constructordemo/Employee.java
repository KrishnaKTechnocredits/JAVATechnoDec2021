package technocredits.constructordemo;

public class Employee {

	Employee(String name){
		this(12121);
		System.out.println(name);
	}
	
	Employee(int empId){
		super();
		System.out.println(empId);
	}
	
	Employee(){
		super();
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Pooja");
	}
}
