package vishakha;

public class A11_ReturnMethod {

	int printFirstOccurenceFromString(String name, char ch) {
		System.out.println("Method to return first occurence of given character from provided string");
		int tempIndex = 0;
		for (int index = 0; index < name.length(); index++) {
			if (ch == name.charAt(index)) {
				// System.out.println("First occurence of your character "+ch+" is at no "+
				// index);
				tempIndex = index;
				break;

			}

		}
		return tempIndex;

	}

	int lastOccurenceCharacterFromString(String name, char ch) {
		System.out.println("Method to return last occurence of given character from given String");
		int index = name.length() - 1;
		for (; index > 0; index--) {
			if (ch == name.charAt(index)) {
				System.out.println("Last occurence of your character " + ch + "   is at no " + index);
				break;

			}
		}

		return index;

	}

	boolean isCharacterFound(String name, char ch) {
		System.out.println("Method to return true if given character is found from given string else return false");
		boolean flag = false;
		for (int index = 0; index < name.length(); index++) {
			{
				flag = true;
				break;
			}
		}

		return flag;

	}

	int totalOccurenceFromString(String name, char ch) {
		System.out.println("Method to return total occurence of given character from given string");
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (ch == name.charAt(index)) {
				// System.out.println("First occurence of your character "+ch+" is at no "+
				// index);
				count++;

			}

		}
		System.out.println("Total occurence of " + ch + " is " + count);
		return count;
	}

	public static void main(String[] args) {
		A11_ReturnMethod returnMethod = new A11_ReturnMethod();
		int firstCharposition = returnMethod.printFirstOccurenceFromString("Commondo", 'm');
		if (firstCharposition != 0) {
			System.out.println("First Occurence of your character is at no " + firstCharposition);
		} else

			System.out.println("Characteris not present in given string");

		returnMethod.lastOccurenceCharacterFromString("Commondo", 'm');
		boolean flag = returnMethod.isCharacterFound("Commondo", 'd');
		if (flag == true) {
			System.out.println("We have found the character in String");
		} else
			System.out.println("Character is not found in given string");
		returnMethod.totalOccurenceFromString("Commondo", 'm');
		// System.out.println(no);

	}

}
