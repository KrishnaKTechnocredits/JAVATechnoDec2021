package nehaPandey;

public class A11_OccurenceofChar_fromString {

	int firstOccuranceOfCharacter(String name, char ch) {
		return name.indexOf(ch);
	}

	int lastOccuranceOfCharacter(String name, char ch) {
		return name.lastIndexOf(ch);
	}

	boolean isCharExist(String name, char ch) {

		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	int totalOccurance(String name, char ch) {

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		A11_OccurenceofChar_fromString a11_OccurenceofChar_fromString = new A11_OccurenceofChar_fromString();
		int firstCharIndex = a11_OccurenceofChar_fromString.firstOccuranceOfCharacter("Hello", 'o');

		System.out.println("First Char: " + firstCharIndex);

		int lastCharIndex = a11_OccurenceofChar_fromString.lastOccuranceOfCharacter("Hello", 'l');

		System.out.println("Last Char: " + lastCharIndex);

		boolean isExist = a11_OccurenceofChar_fromString.isCharExist("Hello", 'k');

		System.out.println("Is Exist: " + isExist);

		int totalOcc = a11_OccurenceofChar_fromString.totalOccurance("Hello", 'l');
		System.out.println("totalOccurance: " + totalOcc);

	}

}
