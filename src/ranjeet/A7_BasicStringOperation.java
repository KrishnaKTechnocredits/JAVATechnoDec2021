package ranjeet;

public class A7_BasicStringOperation {

	void printEvenChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				System.out.println(str.charAt(i));
			}
		}
	}

	void printVowelsFromString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i') {
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		A7_BasicStringOperation basicStringOperation = new A7_BasicStringOperation();
		basicStringOperation.printEvenChar("technocredits");
		basicStringOperation.printVowelsFromString("technocredits");
	}
}
