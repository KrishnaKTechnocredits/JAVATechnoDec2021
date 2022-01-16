package yogiraj;

public class Assignment7 {
	String str = "technocredits";

	public void printCharAtEvenPosition() {
		for (int i = 1; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print("\t" + str.charAt(i));
			}
		}
	}

	public void printVowel() {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.print("\t" + str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Assignment7 a = new Assignment7();

		System.out.println("Characters @ even position");

		a.printCharAtEvenPosition();

		System.out.println("\n \nVowels from the given string are ");

		a.printVowel();
	}

}
