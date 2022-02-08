package monikaArkade;

public class Assignment33 {
	static void getAsciiOfChar(char ch) {
		int x = ch;
		System.out.println(ch + "->" + (int) ch);
	}

	static void printAsciiOfAtoZ() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			getAsciiOfChar(ch);
			// System.out.println(" "+ch);
		}
	}

	static void getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		System.out.println(asciiValue + "->" + ch);
	}

	static void printAsciiOfNumbers(int num) {
		char ch = (char) num;
		System.out.println(num + "->" + ch);
	}

	public static void main(String[] args) {
		getAsciiOfChar('M');
		System.out.println("\nAscii of A to Z");
		printAsciiOfAtoZ();
		System.out.println("\n Ascii value of given char");
		getAsciiOfChar(90);
		System.out.println("\nAscii values of 97 to 122");
		for (int num = 97; num <= 122; num++) {
			printAsciiOfNumbers(num);
		}
	}
}
