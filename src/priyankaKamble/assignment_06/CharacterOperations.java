package priyankaKamble.assignment_06;

/*********
 * Assignment - 6 : 18th Dec'21 Create a single program for following
 * requirements. 1. Create a method to print all characters of given input.
 * input : techno output : t e c h n o Hint : void display(String input){ } 2.
 * Create a method to print all characters of given input in reverse order.
 * input : techno output : o n h c e t Hint: void reverse(String input){
 * 
 * }
 * 
 * 3. Create a method to find occurance of given character from input string.
 * input : akanksha 'a' output : a -> 3 Hint : void findCharFreq(String input,
 * char ch){
 * 
 * }
 *******/

public class CharacterOperations {

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
		System.out.print(" 'a' occurs "+count+" times in "+input );
	}

	public static void main(String[] args) {
		CharacterOperations characterOperations = new CharacterOperations();
		characterOperations.printChar("technocredits");
		characterOperations.printreversChar("Techno");
		characterOperations.charOccurance("Aakaksha",'a');
	}
}
