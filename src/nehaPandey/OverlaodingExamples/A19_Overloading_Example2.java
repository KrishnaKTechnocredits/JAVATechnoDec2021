package nehaPandey.OverlaodingExamples;

public class A19_Overloading_Example2 {

	void sumofDigitFromGivenString(String name) {
		int sum = 0;
		for (int x = 0; x < name.length(); x++) {
			char ch = name.charAt(x);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}

		}
		System.out.println("Sum of Digit in given String : " + sum);
	}

	public static void main(String[] args) {
		A19_Overloading_Example2 A19 = new A19_Overloading_Example2();
		A19.sumofDigitFromGivenString("TE1ch2noC2red9iTs");

	}

}
