package archana;

public class Ass18_Inheritance_Case1 {

	public static void main(String[] args) {

		Ass18_Inheritance_Class1_Student student = new Ass18_Inheritance_Class1_Student();

		// this method is Present in both class but calling from parent class (Student
		// )only even if parent chaild relation
		student.displayname();

		// All bellow methods call from parent class (Student) can't access child class
		// members
		// because college class inherited parent class (students) properties not parent
		// class student
		student.rollno();
		System.out.println("Address :" + student.currCity);
		System.out.println("last College name :" + student.lastcollName);
		student.branch();

	}

}
