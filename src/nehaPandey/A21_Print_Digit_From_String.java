package nehaPandey;

public class A21_Print_Digit_From_String {
	String temp = "";

	void printDigitAsAStringFromAGivenString(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		System.out.println("Digit from given string: " + temp);

	}

	public static void main(String[] args) {
		A21_Print_Digit_From_String a21 = new A21_Print_Digit_From_String();
		a21.printDigitAsAStringFromAGivenString("T1e3h45n9o");
	}

}
