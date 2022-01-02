package archana;

public class Ass18_Inheritance_Case3 {

	public static void main(String[] args) {

		// Case 3 : Student is refrence veriable of class Student(Parent Class) and
		// Object created of Class College (Child class)
		Ass18_Inheritance_Class1_Student student = new Ass18_Inheritance_Class2_College();

		// ==>Compile Error : univercityName variable not exist in Student class
		// System.out.print("Univercity name : "+ student.univercityName );

		System.out.println("Last college name : " + student.lastcollName);

		// variable fixed see left side even if both class contain same variable name
		System.out.println("Current address city name  : " + student.currCity);

		// student.grade(); //==>compile error : this Method not exist in left side
		// class student

		student.displayname(); // compile to Runtime behaviour change class College displayname will call

	}

}
