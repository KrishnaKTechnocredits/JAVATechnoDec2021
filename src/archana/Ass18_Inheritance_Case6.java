package archana;

public class Ass18_Inheritance_Case6 {
	public static void main(String[] args) {
		Ass18_Inheritance_Class1_Student student = new Ass18_Inheritance_Class2_College();
		Ass18_Inheritance_Class2_College college = new Ass18_Inheritance_Class2_College();

		// college = student; //Compile Error ==> Parent to child not possiblr

		college = (Ass18_Inheritance_Class2_College) student; // Type casting student(parent refrence) should be like
																// child class type

		// Ultimately its like case 2 Ass18_Inheritance_Class2_College college new
		// Ass18_Inheritance_Class2_College();

		college.displayname(); // Exixt in both class but ==> inherite from child class (college)
		college.rollno(); // Parent class student
		college.branch(); // Parent class student
		System.out.println("Current address city name  : " + college.currCity); // child class college
		String result = college.avrageMarksResult(70, 80, 90); // child class college
		System.out.println(result);
	}
}
