package apurva;

public class A18_Inheritance_Case5 {

	public static void main(String[] args) {
		A18_Inheritance_Admin admin = new A18_Inheritance_Admin();
		A18_Inheritance_Student student = new A18_Inheritance_Student();
		admin = student; // this is the same case as that of case3

		System.out.println("Enrollment Id of Admin: " + admin.enrollmentId);// property remains same at the time of
		// compilation
		System.out.println("Addmission status of admin: " + admin.admission);
		// System.out.println(admin.rollNo);// CE complier always look onto the right
		// side i.e reference variable, it will not inherit properties from child class
		admin.displayEnrollmentId();
		admin.displayAdmissionStatus(); // it will look for the similar method in child class i.e behavior changes from
		// compile time to runtime and then it oveerides the method of child class
		// admin.getAddmissionCard(); //admin can call all the eligible member from
		// A18_Inheritance_Admin class and similar methods from A18_Inheritance_Student
		// class
	}

}
