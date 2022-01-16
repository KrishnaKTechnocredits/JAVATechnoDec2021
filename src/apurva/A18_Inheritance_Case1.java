package apurva;

public class A18_Inheritance_Case1 {

	public static void main(String[] args) {
		A18_Inheritance_Admin admin = new A18_Inheritance_Admin();
		System.out.println(admin.enrollmentId);
		System.out.println(admin.admission);
		// System.out.println(admin.rollNo); parent class cannot inherit properties from
		// child class
		admin.displayEnrollmentId();
		admin.displayAdmissionStatus();
		// admin.getAddmissionCard();//CE as the behavior cannot be inherited from child
		// class
	}

}
