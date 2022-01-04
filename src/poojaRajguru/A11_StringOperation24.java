package poojaRajguru;

public class A11_StringOperation24 {

	int returnFirstOccurrence(String str, char ch) {
		int index = -1;
		for(int i=0;i< str.length(); i++) {
			if(str.charAt(i) == ch) {
				index = i;
				break;
			}				
		}
		if(index == -1)
			System.out.println(" Character " + ch + " is not found in string " + str);
		else
			System.out.println(" First occurrence of Character " + ch + " is found in string " + str + " at index : " + index);
		return index;
	}

	int returnLastOccurrence(String str, char ch) {
		int index = -1;
		for(int i=0;i< str.length(); i++) {
			if(str.charAt(i) == ch)
				index = i;			
		}
		if(index == -1)
			System.out.println(" Character " + ch + " is not found in string " + str);
		else
			System.out.println(" Last occurrence of Character " + ch + " is found in string " + str + " at index : " + index);
		return index;		
	}

	boolean isCharPresent(String str, char ch) {
		boolean foundChar = false;
		for(int i=0;i< str.length(); i++) {
			if(str.charAt(i) == ch) {
				foundChar = true;
				break;
			}				
		}
		if(foundChar == false)
			System.out.println(" Character " + ch + " is not found in string " + str);
		else
			System.out.println(" Character " + ch + " is found in string " + str);
		return foundChar;
	}

	int totalOcrOccurrenceOfChar(String str, char ch) {
		int totalOcr = 0;
		for(int i=0;i< str.length(); i++) {
			if(str.charAt(i) == ch)
				totalOcr++;			
		}
		System.out.println(" total occurrence of Character " + ch + " in string " + str + " is : " + totalOcr);
		return totalOcr;
	}

	public static void main(String[] args) {

		A11_StringOperation24 stringOperation24 = new A11_StringOperation24();
		stringOperation24.returnFirstOccurrence("POOJA", 'O');
		System.out.println();
		stringOperation24.returnLastOccurrence("POOJA", 'O');
		System.out.println();
		stringOperation24.isCharPresent("POOJA", 'A');
		System.out.println();
		stringOperation24.isCharPresent("POOJA", 'R');
		System.out.println();
		stringOperation24.totalOcrOccurrenceOfChar("POOJA", 'O');
		System.out.println();
		stringOperation24.totalOcrOccurrenceOfChar("POOJA", 'A');
	}
}

