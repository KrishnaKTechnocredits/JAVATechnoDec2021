package garima;

class Student {

	String name = "Ashish";
	int age = 25;

	void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.display();
	}
}
