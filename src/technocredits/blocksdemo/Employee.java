package technocredits.blocksdemo;

public class Employee extends Manager{

	static {
		System.out.println(4);
	}
	
	{
		System.out.println(5);
	}
	
	public Employee() {
		super();
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
	}
}
