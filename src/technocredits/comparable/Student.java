package technocredits.comparable;

public class Student implements Comparable<Student> {

	int roll;
	String name;
	int age;

	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
//		if (this.roll > student.roll)
//			return 45;
//		else if (this.roll < student.roll)
//			return -10;
//		else
//			return 0;
		return this.roll - student.roll;
//		return this.name.compareTo(student.name);
	}

	@Override
	public String toString() {
		return roll + " : " + name + " : " + age;
	}

}
