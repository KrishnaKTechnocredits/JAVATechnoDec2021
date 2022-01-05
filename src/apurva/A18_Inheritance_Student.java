package apurva;

public class A18_Inheritance_Student extends A18_Inheritance_Admin {

	String admission = "Confirmed";
	int rollNo = 1234;
	
	void displayAdmissionStatus() {
		System.out.println("Admission done");
	}
	 void getAddmissionCard() {
		 System.out.println("Addmission Card received");
	 }
}
