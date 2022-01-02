package archana;

public class Ass18_Inheritance_Case5 {
	public static void main(String[] args) {

		Ass18_Inheritance_Class1_Student student = new Ass18_Inheritance_Class1_Student();// Copy left side
		Ass18_Inheritance_Class2_College college = new Ass18_Inheritance_Class2_College();// copy right side

		student = college; // its Like case 3 : ==> Ass18_Inheritance_Class1_Student student = new
							// Ass18_Inheritance_Class2_College();

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
