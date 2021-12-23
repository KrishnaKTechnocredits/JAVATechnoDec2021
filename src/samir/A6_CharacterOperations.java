package samir;

public class A6_CharacterOperations {

	void printChar(String input) {
		System.out.println("characters in given input");
		for (int index = 0; index < input.length(); index++) {
			System.out.print(input.charAt(index));
			System.out.print(",");
		}
	}

	void printreversChar(String input) {
		System.out.println("\n\ncharacters of given input in revers Order");
		for (int index = input.length() - 1; index >= 0; index--) {
			// System.out.println("check");
			System.out.print(input.charAt(index));
			System.out.print(",");
		}
	}

	void charOccurance(String input, char character) {
		System.out.println("\n\n Occurance of character in given string ");
		input = input.toLowerCase();
		int count=0;
		for (int index = 0; index <= input.length()-1; index++) {
			if (input.charAt(index)== character) {
				count= count+1;
			}
		}
		System.out.print(" 'e' occurs "+count+" times in "+input );
	}

	public static void main(String[] args) {
		A6_CharacterOperations characterOperations = new A6_CharacterOperations();
		characterOperations.printChar("technocredits");
		characterOperations.printreversChar("Techno");
		characterOperations.charOccurance("Sameer",'e');
	}
}

