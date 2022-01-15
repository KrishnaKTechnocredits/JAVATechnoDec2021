package krishna_Inheritance_Exp;

public class Assignment_21_Digit {
	
	void findDigit(String provide) {
		for (int index = 0; index < provide.length(); index++) {
			char ch = provide.charAt(index);
			if (Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] arr) {
		Assignment_21_Digit ass21 = new Assignment_21_Digit();
		ass21.findDigit("Tech1no2c6re4d9its");
	}
}
