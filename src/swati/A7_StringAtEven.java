package swati;

public class A7_StringAtEven {

	void printString(String name) {
		for (int i = 0; i < name.length(); i++) {

			if (i % 2 == 0) {
				System.out.println("Character at even position is " + name.charAt(i));
			}

		}
		System.out.println("----------------");

	}

	void printVowels(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println("word with vowels " + name.charAt(i));
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7_StringAtEven str = new A7_StringAtEven();
		str.printString("technocredit");
		str.printVowels("aeon");
	}

}
