package megha;

public class Megha_Assignment_11 {

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
		Megha_Assignment_11 megha_Assignment = new Megha_Assignment_11();
		int firstOccIndex = megha_Assignment.getFirstOccurenceOfChar("Megha Saha", 'a');
		if (firstOccIndex == -1)
			System.out.println("Searched Character a not found");
		else
			System.out.println(
					"The First Occurence of given character in given String is at position : " + firstOccIndex);
		int lastOccIndex = megha_Assignment.getLastOccurenceOfChar("Megha Saha", 'a');
		if (lastOccIndex == -1)
			System.out.println("Seached Character a not found");
		else
			System.out.println(
					"The Last Occurence of given character in given String is at position :  : " + lastOccIndex);
		boolean presenceOFChar = megha_Assignment.isCharPresent("Megha Saha", 'a');
		System.out.println("Is Searched Character present? :  " + presenceOFChar);
		int totalCount = megha_Assignment.getOccurenceOfChar("Megha Saha", 'a');
		System.out.println("Total Occurence of character is : " + totalCount);
	}

}
