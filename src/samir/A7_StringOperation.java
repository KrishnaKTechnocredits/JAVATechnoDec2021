package samir;

public class A7_StringOperation {

	void charAtEvenPose(String inputString) {
		System.out.println("Characters presents at even position in given String are  - ");
		for (int index = 0; index < inputString.length(); index++) {
			if ((index + 1) % 2 == 0) {
				System.out.print(inputString.charAt(index));
				System.out.print(",");
			}
		}
	}

	void vowes(String inputString) {
		System.out.println("\n\nVowels present in a given strings are  - ");
		for (int index = 0; index < inputString.length(); index++) {
			char character = inputString.charAt(index);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				System.out.print(inputString.charAt(index));
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		A7_StringOperation stringOperation = new A7_StringOperation();
		stringOperation.charAtEvenPose("technocredits");
		stringOperation.vowes("technocredits");
	}
}

