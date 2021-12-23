package priyankaKamble.assignment_7;

/*********
 * Assignment - 7 : 19th Dec'2021 Create only one program having following 2
 * methods.
 * 
 * 1.Print all characters at even position from given string. input :
 * technocredits output : ehordt
 * 
 * 2. Print only vowels from given string. input : technocredits output : eoei
 ************/

public class StringOperation {

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
		StringOperation stringOperation = new StringOperation();
		stringOperation.charAtEvenPose("technocredits");
		stringOperation.vowes("technocredits");
	}
}
