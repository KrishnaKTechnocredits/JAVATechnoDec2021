package naquibalam;

import java.util.Scanner;

public class A12_3_Scanner {

	char getFirstNonRepeatingChar(String input) {
		char returnChar = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			boolean repeatingFound = false;
			for (int j = 0; j <= input.length() - 1; j++) {
				if ((input.charAt(i) == input.charAt(j)) && (i != j)) {
					repeatingFound = true;				
				} 
			}
			if (repeatingFound == false) {
				returnChar = input.charAt(i);
				break;
			}
		}
		return returnChar;
	}
	
	char getFirstRepeatingChar(String input) {
		char returnChar = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			boolean repeatingFound = false;
			for (int j = 0; j <= input.length() - 1; j++) {
				if ((input.charAt(i) == input.charAt(j)) && (i != j)) {
					repeatingFound = true;				
				} 
			}
			if (repeatingFound == true) {
				returnChar = input.charAt(i);
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
		A12_3_Scanner a12_3_Scanner = new A12_3_Scanner();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input - Please enter the string in which first non-repeating character is to be found");
		String stringNonRepeate = scanner.next();
		char firstNonRepeatingChar= a12_3_Scanner.getFirstNonRepeatingChar(stringNonRepeate);
		System.out.println("Output - First non-repeating character in string '" + stringNonRepeate + "' is '" + firstNonRepeatingChar + "'");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Input - Please enter the string in which first repeating character is to be found");
		String stringRepeate = scanner.next();
		char firstRepeatingChar= a12_3_Scanner.getFirstRepeatingChar(stringRepeate);
		System.out.println("Output - First repeating character in string '" + stringRepeate + "' is '" + firstRepeatingChar + "'");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Input - Please enter the string which has to be reversed");
		String stringReverse = scanner.next();
		String reverseStringOut = a12_3_Scanner.getReverseString(stringReverse);
		System.out.println("Output - Reverse of string '" + stringReverse + "' is '" + reverseStringOut + "'");
	}
}
