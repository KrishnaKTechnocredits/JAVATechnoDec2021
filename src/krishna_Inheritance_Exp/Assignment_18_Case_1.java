package krishna_Inheritance_Exp;

public class Assignment_18_Case_1 {
	public static void main(String[] arr){
		Assignment_18_Candidate ass18 = new Assignment_18_Candidate();
		ass18.displayDetails();
		ass18.code();
		ass18.branch();
		ass18.address();
		
		/*ass18.city();      //Here we cannot access the city variables as it is not available in this class. 
		(Child class inherit the parent class, but parent class not inherit the child class)
		*/
		
	}

}
