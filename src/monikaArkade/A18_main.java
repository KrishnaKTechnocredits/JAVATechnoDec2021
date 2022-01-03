package monikaArkade;

public class A18_main {
	public static void main(String[] args) {
		A18_Student student = new A18_Student();
		student.getData(); // case 1

		A18_College inherianceexample = new A18_College();
		inherianceexample.getData(); // case 2

		/*
		 * A18_Student student = new A18_College(); student.getData(); // case 3
		 */

		// A18_College college = new A18_Student(); //case 4

		/*
		 * A18_Student student = new A18_Student(); A18_College college = new
		 * A18_College(); student=college; student.getData();// case 5
		 */

		/*
		 * A18_Student student = new A18_College(); A18_College college = new
		 * A18_College(); college = (A18_College)student; college.getData();//case 6
		 */

	}

}
