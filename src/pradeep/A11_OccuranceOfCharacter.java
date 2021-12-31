package pradeep;

public class A11_OccuranceOfCharacter {
	int charCount;
	//method to return first occurrence of given character from given string.
	int firstOccuranceOfChar(String input, char ch) {
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch) {
				return index; 								
			}
		}
		return -1;
	}
	
	//method to return last occurrence of given character from given string.
	int lastOccuranceOfChar(String input, char ch) {
		for(int index=input.length()-1; index>=0; index--) {
			if(input.charAt(index) == ch) {
				return index; 								
			}
		}
		return -1;
	}
	
	//method to return true if given character is found from given string else return false.
	boolean isCharFound(String input, char ch) {
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch) {
				return true; 								
			}
		}
		return false;
	}
	
	//method to return total occurrence of given character from given string.
	int totalOccuranceOfChar(String input, char ch) {
		charCount=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch) {
				charCount++;								
			}
		}
		return charCount;
	}
	
	public static void main(String[] args) {
		A11_OccuranceOfCharacter a11_OccuranceOfCharacter =new A11_OccuranceOfCharacter();
		
		//call method to return first occurrence of given character from given string.
		int firstCharIndex = a11_OccuranceOfCharacter.firstOccuranceOfChar("pradeep", 'd');
		if(firstCharIndex == -1) 
			System.out.println("character not found in given string");
		else
			System.out.println("first character found at index " + firstCharIndex );
		
		//call method to return last occurrence of given character from given string.
		int lastCharIndex = a11_OccuranceOfCharacter.lastOccuranceOfChar("pradeep", 'd');
		if(lastCharIndex == -1) 
			System.out.println("character not found in given string");
		else
			System.out.println("last character found at index " + lastCharIndex );
		
		//call method to return true if given character is found from given string else return false.
		boolean charAvailable = a11_OccuranceOfCharacter.isCharFound("pradeep", 'f');
		if(charAvailable == true) 
			System.out.println("character  found in given string");
		else
			System.out.println("Character not found in string" );
		
		//call method to return total occurrence of given character from given string.
		int count = a11_OccuranceOfCharacter.totalOccuranceOfChar("pradeep", 'd');
		System.out.println("Total no of times character ocuurs is "+ count);		
	}
}
