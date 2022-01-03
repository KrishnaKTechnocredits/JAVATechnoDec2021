/*Write a program with following methods. 
1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.*/


package vrushali;

public class A11_OccurrenceOfCharacter {

	int printFirstOccurrenceOfChar(String input, char ch) {
		int charIndex = -1;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch)
				return index;
		}
		return charIndex;
	}

	int printLastOccurrenceOfChar(String input, char ch) {
		int charIndex = -1;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch)
				charIndex = index;

		}
		return charIndex;
	}

	boolean isCharPresentInGivenString(String input, char ch) {
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)== ch)
				return true;
		}
		return false;
	}

	int totalOccurrenceOfCharacter(String input, char ch) {
		int count = 0;

		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		A11_OccurrenceOfCharacter occurrenceOfCharacter = new A11_OccurrenceOfCharacter();

		int firtsIndex = occurrenceOfCharacter.printFirstOccurrenceOfChar("Technocredits", 'c');
		if(firtsIndex == -1) 
			System.out.println("First Chracter which your are seraching is not found");
		else
			System.out.println("The first Occurrence of Character c is at index "+ firtsIndex);

		int lastIndex = occurrenceOfCharacter.printLastOccurrenceOfChar("Technocredits", 'c');
		if(lastIndex == -1)
			System.out.println("Last Chracter which your are seraching is not found");
		else
			System.out.println("Last occurrence of character c is: " +lastIndex);

		boolean charOcc = occurrenceOfCharacter.isCharPresentInGivenString("Technocredits", 'r');
		System.out.println("is serached character r present in given String Technocredits?-> " + charOcc);

		int totalCharCount = occurrenceOfCharacter.totalOccurrenceOfCharacter("Technocredits", 'c');
		System.out.println("Total count of character c in Technocredits string is "+ totalCharCount);

	}

}
