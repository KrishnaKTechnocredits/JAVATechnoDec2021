/*1.Print all characters at even position from given string.
input : technocredits
output : ehordt

2. Print only vowels from given string.
input : technocredits
output : eoei*/
package shwetaDharmadhikari;

public class Assign7_String_FindVowels {

	void displayCharacters(String input) {
		System.out.print("Output: ");
		for (int index = 1; index < input.length(); index += 2) {
			System.out.print(input.charAt(index));
		}
		System.out.println(" ");
	}

	void printVowels(String input) {

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
		// TODO Auto-generated method stub
		Assign7_String_FindVowels assign7_String_FindVowels = new Assign7_String_FindVowels();
		assign7_String_FindVowels.displayCharacters("technocredits");
		assign7_String_FindVowels.printVowels("Eclipse");
	}

}
