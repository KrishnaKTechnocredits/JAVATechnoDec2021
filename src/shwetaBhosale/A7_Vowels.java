package shwetaBhosale;

public class A7_Vowels {

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
		
		A7_Vowels assign7_Vowels = new A7_Vowels();
		A7_Vowels.printAtEven("technocredits");
		A7_Vowels.printVowels("technocredits");
	}

}