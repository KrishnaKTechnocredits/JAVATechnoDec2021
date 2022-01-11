package krishna_Inheritance_Exp;

public class Assignment_18_Case_6 {
	public static void main(String[] args) {
		Assignment_18_Institution candidate = new Assignment_18_Institution();
		Assignment_18_Candidate institute = new Assignment_18_Institution();
		// institute = candidate; We cannot directly access this, here we need casting
		// (institute).

		institute = (Assignment_18_Candidate) candidate; // Here we are casting the child class.

		// As at last it result into a type of case_2, where Assignment_18_Institution
		// ass18ins = new Assignment_18_Institution();
		institute.address();
		institute.code();
		institute.displayDetails();
	}

}
