package apurva;

public class A18_Inheritance_Case6 {

	public static void main(String[] args) {
		A18_Inheritance_Admin admin = new A18_Inheritance_Student();
		A18_Inheritance_Student student = new A18_Inheritance_Student();
		student = (A18_Inheritance_Student) admin;
		System.out.println(student.admission);
		System.out.println(student.rollNo);
		System.out.println(student.enrollmentId);// from parent class

		student.displayAdmissionStatus();
		student.getAddmissionCard();
		student.displayEnrollmentId();// from parent class
	}

}
