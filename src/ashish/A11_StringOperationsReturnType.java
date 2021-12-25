package ashish;

public class A11_StringOperationsReturnType {

	int returnFirstOccurrence(String input, char ch) {
		int indexFound = -1;
		for(int i=0;i< input.length(); i++) {
			if(input.charAt(i) == ch) {
				indexFound = i;
				break;
			}				
		}
		if(indexFound == -1)
			System.out.println(" Character " + ch + " is not found in string " + input);
		else
			System.out.println(" First occurrence of Character " + ch + " is found in string " + input + " at index : " + indexFound);
		return indexFound;
	}
	
	int returnLastOccurrence(String input, char ch) {
		int indexFound = -1;
		for(int i=0;i< input.length(); i++) {
			if(input.charAt(i) == ch)
				indexFound = i;			
		}
		if(indexFound == -1)
			System.out.println(" Character " + ch + " is not found in string " + input);
		else
			System.out.println(" Last occurrence of Character " + ch + " is found in string " + input + " at index : " + indexFound);
		return indexFound;		
	}
	
	boolean isCharPresent(String input, char ch) {
		boolean charFound = false;
		for(int i=0;i< input.length(); i++) {
			if(input.charAt(i) == ch) {
				charFound = true;
				break;
			}				
		}
		if(charFound == false)
			System.out.println(" Character " + ch + " is not found in string " + input);
		else
			System.out.println(" Character " + ch + " is found in string " + input);
		return charFound;
	}
	
	int totalOccurrenceOfChar(String input, char ch) {
		int total = 0;
		for(int i=0;i< input.length(); i++) {
			if(input.charAt(i) == ch)
				total++;			
		}
		System.out.println(" Total occurrences of Character " + ch + " in string " + input + " are : " + total);
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11_StringOperationsReturnType stringOperationsReturnType = new A11_StringOperationsReturnType();
		stringOperationsReturnType.returnFirstOccurrence("ASHISH", 'S');
		System.out.println();
		stringOperationsReturnType.returnLastOccurrence("ASHISH", 'S');
		System.out.println();
		stringOperationsReturnType.isCharPresent("ASHISH", 'I');
		System.out.println();
		stringOperationsReturnType.isCharPresent("ASHISH", 'N');
		System.out.println();
		stringOperationsReturnType.totalOccurrenceOfChar("ASHISH", 'S');
		System.out.println();
		stringOperationsReturnType.totalOccurrenceOfChar("ASHISH", 'N');
	}
}
