package ashish;

import java.util.Scanner;

public class A12_StringOperations {

	void firstNonRepeatingChar(String str) {
		int count = 0, j = 0;
		boolean nonRepeatingCharFound = false;
		for(int i=0; i<str.length(); i++) {
			count = 0;
			for(j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
			if(count == 1) {
				nonRepeatingCharFound = true;
				System.out.println(" First non repeating char from string " + str + " is : " +str.charAt(i));
				break;
			}
		}
		if(nonRepeatingCharFound == false)
			System.out.println(" All characters are repeating in string " + str);
		
	}
	
	void firstRepeatingChar(String str) {
		int count = 0, j = 0;
		boolean repeatingCharFound = false;
		for(int i=0; i<str.length(); i++) {
			count = 0;
			for(j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
			if(count > 1) {
				repeatingCharFound = true;
				System.out.println(" First repeating char from string " + str + " is : " +str.charAt(i));
				break;
			}
		}
		if(repeatingCharFound == false)
			System.out.println(" None of the characters are repeating in string " + str);
	}
	
	String returnReverseString(String str) {
		String reverseString = "";
		for(int i = str.length()-1; i>=0; i--)
			reverseString = reverseString + str.charAt(i);
		return reverseString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_StringOperations stringOperations = new A12_StringOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Please enter the input string : ");
		String str = scanner.next();
		System.out.println();
		stringOperations.firstNonRepeatingChar(str);
		System.out.println();
		stringOperations.firstRepeatingChar(str);
		System.out.println();
		System.out.println(" Reverse of " + str + " is : "+ stringOperations.returnReverseString(str));
		scanner.close();
	}
}