package technocredits.exceptiondemo.throwsdemo;

public class Employee {

	void m1() {
		System.out.println(1);
		Manager mng = new Manager();
		try {
			mng.m2();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("in catch");
		}
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		try {
			new Employee().m1();
		}catch(RuntimeException re) {
			System.out.println("Techno");
		}
		System.out.println("end");
	}
}
