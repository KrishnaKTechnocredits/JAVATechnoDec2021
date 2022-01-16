package apurva;

//creation of object of child class which inherits the all properties from Parent class
public class A18_Inheritance_Case2 {
	public static void main(String[] args) {
		A18_Inheritance_Student student = new A18_Inheritance_Student();
		System.out.println(student.admission);
		System.out.println(student.rollNo);
		System.out.println(student.enrollmentId);

		student.displayAdmissionStatus();
		student.getAddmissionCard();
		student.displayEnrollmentId();

	}

}
