package nehaPandey;

public class Assignment_7 {
	void evenCharacter(String name) {
		for (int a = 0; a <= name.length() - 1; a++) {

			if (a % 2 == 0) {
				char x = name.charAt(a);
				System.out.println("Characters at even position are: " + x);

			}

		}
		System.out.println();

	}

	void vowelsCharacter(String name) {
		for (int a = 0; a <= name.length() - 1; a++) {
			char x = name.charAt(a);

			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				System.out.println("Vowels are: " + x);

			}
		}

	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.evenCharacter("Technocredits");
		assignment_7.vowelsCharacter("Technocredits");
	}
}
