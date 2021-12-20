package shwetaBhosale;

public class Assign7_Vowels {

	static void printAtEven(String input) {
		System.out.print("Output: ");
		for (int index = 1; index < input.length(); index += 2) {
			System.out.print(input.charAt(index));
		}
		System.out.println(" ");
	}

	static void printVowels(String input) {

		System.out.print("Vowels from given string: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		
		Assign7_Vowels assign7_Vowels = new Assign7_Vowels();
		Assign7_Vowels.printAtEven("technocredits");
		Assign7_Vowels.printVowels("technocredits");
	}

}