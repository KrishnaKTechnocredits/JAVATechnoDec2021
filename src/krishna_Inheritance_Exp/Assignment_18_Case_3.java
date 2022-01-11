package krishna_Inheritance_Exp;

public class Assignment_18_Case_3 {
	public static void main(String[] args) {
		Assignment_18_Candidate ass18cand = new Assignment_18_Institution();
		/*
		 * //ass18cand.city(); Here city() is not visible to Candidate class, as here we
		 * are creating the object for Candidate class so it only access the things
		 * which are available in Candidate class.
		 */
		ass18cand.code();
		ass18cand.branch();
	}
}
