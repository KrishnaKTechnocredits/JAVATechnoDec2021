package megha;

public class Megha_Assignment_7 {

	void displayEvenChar(String name) {
		System.out.print("The Even Characters in the String are : ");
		for (int index = 0; index < name.length(); index++) {
			if ((index + 1) % 2 == 0) {
				char letter = name.charAt(index);
				System.out.print(letter);
			}
		}
	}

	void displayVowel(String name) {
		System.out.print("The Vowel Letters in the String are : ");
		for (int index = 0; index < name.length(); index++) {
			char letter = name.charAt(index);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
				System.out.print(letter);
		}
	}

	public static void main(String[] args) {
		Megha_Assignment_7 megha_Assignment = new Megha_Assignment_7();
		megha_Assignment.displayEvenChar("technocredits");
		System.out.println();
		megha_Assignment.displayVowel("technocredits");
	}

}
