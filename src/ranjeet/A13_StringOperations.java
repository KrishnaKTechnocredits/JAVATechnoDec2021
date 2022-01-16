package ranjeet;

public class A13_StringOperations {

	int findFirstOcc(String fString, char ch) {
		int j = 0;
		for (int i = 0; i <= fString.length(); i++) {
			if (fString.charAt(i) == ch) {
				System.out.println(i);
				j = i;
				break;
			}
		}
		return j;
	}

	int findLastOcc(String fString, char ch) {
		int j = 0;
		for (int i = fString.length() - 1; i >= 0; i--) {
			if (fString.charAt(i) == ch) {
				System.out.println(i);
				j = i;
				break;
			}
		}
		return j;
	}

	boolean isCharacterFound(String str, char ch) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void totalOccOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		A13_StringOperations stringOperations = new A13_StringOperations();
		stringOperations.totalOccOfChar("Technocredits", 'e');
		stringOperations.findFirstOcc("Teachno", 'a');
		stringOperations.findLastOcc("xxyyzzzz", 'z');
		boolean d = stringOperations.isCharacterFound("Teachno", 'v');
		if (d) {
			System.out.println("Charcter found in given string");
		} else
			System.out.println("Charcter not found in given string");
	}
}
