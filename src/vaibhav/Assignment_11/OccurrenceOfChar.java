/*
Assignment - 11 : 24rd Dec'2021 
Write a program with following methods. 
1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.

*/

package vaibhav.Assignment_11;

public class OccurrenceOfChar {

	int getfirstOccurrenceOfChar(String str, char ch) {
		int charIndex = -1;
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch) {
				charIndex = index;
				break;
			}
		}
		return charIndex;
	}

	int getLastOccurrenceOfChar(String str, char ch) {
		int charIndex = -1;
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch) {
				charIndex = index;
			}
		}
		return charIndex;
	}

	boolean isCharPresent(String input, char ch) {
		boolean flag = false;

		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) == ch)
				flag = true;
		}
		return flag;
	}

	int getTotalOccurrenceOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void printFirstOccurrenceOfChar(String input, char ch) {
		int firstCharIndex = getfirstOccurrenceOfChar(input, ch);
		if (firstCharIndex != -1)
			System.out.println(
					"First occurrence of char '" + ch + "' in the input string '" + input + "' is : " + firstCharIndex);
		else
			System.out.println("Given charater '" + ch + "' is not present in the input string '" + input + "'");
	}

	void printLastOccurrenceOfChar(String input, char ch) {
		int lastCharIndex = getLastOccurrenceOfChar(input, ch);
		if (lastCharIndex != -1)
			System.out.println(
					"Last occurrence of char '" + ch + "' in the input string '" + input + "' is : " + lastCharIndex);
		else
			System.out.println("Given charater '" + ch + "' is not present in the input string '" + input + "'");
	}
	
	

	public static void main(String[] args) {
		OccurrenceOfChar occurrenceOfChar = new OccurrenceOfChar();
		
		// 1. create a method to return first occurrence of given character from given string.
		occurrenceOfChar.printFirstOccurrenceOfChar("vaibhav", 'v');
		
		// 2. create a method to return last occurrence of given character from given string.
		occurrenceOfChar.printLastOccurrenceOfChar("vaibhav", 'v');
		
		// 3. create a method to return true if given character is found from given string else return false.
		boolean isCharFound = occurrenceOfChar.isCharPresent("vaibhav", 'v');
		System.out.println("Is character present in the given string : "+ isCharFound);
		
		// 4. create a method to return total occurrence of given character from given string.
		int totalOccOfChar = occurrenceOfChar.getTotalOccurrenceOfChar("technocredits", 'c');
		System.out.println("Occurrance of 'c' in 'technocredits' is : "+ totalOccOfChar);

	}
}
