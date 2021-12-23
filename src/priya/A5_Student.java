package priya;

public class A5_Student {
	static String start = "Start";
	String name = "Hello Priya";
	int age = 25;

	void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		A5_Student s = new A5_Student();
		System.out.println(start);
		s.display();
		System.out.println("end");
	}
}