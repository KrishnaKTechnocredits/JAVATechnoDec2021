package rashmi;

public class Asgnmt11_String_Operation {
	int getFirstOccurenceOfChar(String name, char ch) {
		int charIndex = -1;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				return index;
		}
		return charIndex;
	}

	int getLastOccurenceOfChar(String name, char ch) {
		int charIndex = -1;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				charIndex = index;
		}
		return charIndex;
	}

	boolean isCharPresent(String name, char ch) {

		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				return true;
		}
		return false;
	}

	int getOccurenceOfChar(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Asgnmt11_String_Operation str = new Asgnmt11_String_Operation();
		
		int firstOccIndex = str.getFirstOccurenceOfChar("Rashmi Bante", 'z');
		if (firstOccIndex == -1)
			System.out.println("Searched Character not found");
		else
			System.out.println("The First Occurence of given character in given String is at position : " + firstOccIndex);
		
		int lastOccIndex = str.getLastOccurenceOfChar("Rashmi Bante", 'a');
		if (lastOccIndex == -1)
			System.out.println("Seached Character a not found");
		else
			System.out.println("The Last Occurence of given character in given String is at position  : " + lastOccIndex);
					
		boolean presenceOFChar = str.isCharPresent("Rashmi Bante", 'a');
		System.out.println("Check Presence of character true/false :  " + presenceOFChar);
		
		int totalCount = str.getOccurenceOfChar("Rashmi Bante", 'a');
		System.out.println("Total Occurence of character : " + totalCount);
	}

}
