package anvit;
import java.util.Scanner;

public class A12_Scanner_char {
	
	char getFirstNonRepeatingChar(String input) {
		char returnChar = 0;
		for (int index = 0; index < input.length(); index++) {
			boolean repeatingFound = false;
			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(index) == input.charAt(i)) && (index != i)) {
					repeatingFound = true;				
				} 
			}
			if (repeatingFound == false) {
				returnChar = input.charAt(index);
				break;
			}
		}
		return returnChar;
	}

	char getFirstRepeatingChar(String input) {
		char returnChar = 0;
		for (int index = 0; index < input.length() ; index++) {
			boolean repeatingFound = false;
			for (int i = 0; i < input.length(); i++) {
				if ((input.charAt(index) == input.charAt(i)) && (index != i)) {
					repeatingFound = true;				
				} 
			}
			if (repeatingFound == true) {
				returnChar = input.charAt(index);
				break;
			}
		}
		return returnChar;
	}

	String getReverseString(String input) {
		char eachChar = 0;
		String returnValue = "";
		for (int i = input.length() - 1; i >= 0; i--){
			eachChar = input.charAt(i);
			returnValue = returnValue + eachChar;
		}
		return returnValue;
	}

	public static void main(String[] args) {
		A12_Scanner_char a12_Scanner_char = new A12_Scanner_char();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string for first non-repeating character ");
		String stringNonRepeate = scanner.next();
		char firstNonRepeatingChar= a12_Scanner_char.getFirstNonRepeatingChar(stringNonRepeate);
		System.out.println("First non-repeating character in string '" + stringNonRepeate + "' is '" + firstNonRepeatingChar + "'");
		System.out.println();
		System.out.println("Enter the string for first repeating character ");
		String stringRepeate = scanner.next();
		char firstRepeatingChar= a12_Scanner_char.getFirstRepeatingChar(stringRepeate);
		System.out.println("First repeating character in string '" + stringRepeate + "' is '" + firstRepeatingChar + "'");
		System.out.println();
		System.out.println("Enter the string which has to be reversed");
		String stringReverse = scanner.next();
		String reverseStringOut = a12_Scanner_char.getReverseString(stringReverse);
		System.out.println("Reverse of string '" + stringReverse + "' is '" + reverseStringOut + "'");
	}
}
