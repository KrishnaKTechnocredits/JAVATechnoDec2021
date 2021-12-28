package vishakha;

public class A13_Index {

	void getDuplicateChar(String name) {
		char ch = ' ';
		System.out.println("Duplicate characters in the String are");
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) != name.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	void getNotRepeatingChar(String name) {
		char ch = ' ';
		System.out.println("Not repeating characters in the String are");
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	void getFirstNonRepeatingChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println("First non repeating character is " + ch);
				break;
			}
		}
	}

	void getFirstRepeatingChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) != name.lastIndexOf(ch)) {
				System.out.println("First repeating character is " + ch);
				break;
			}
		}

	}

	public static void main(String[] args) {
		A13_Index strOperations = new A13_Index();
		strOperations.getDuplicateChar("technocredits");
		System.out.println("--------------------------");
		strOperations.getNotRepeatingChar("technocredits");
		System.out.println("---------------------");
		strOperations.getFirstNonRepeatingChar("technocredits");
		System.out.println("---------------------");
		strOperations.getFirstRepeatingChar("technocredits");
	}

}
