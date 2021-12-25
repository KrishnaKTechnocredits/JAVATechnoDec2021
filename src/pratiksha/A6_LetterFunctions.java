package pratiksha;

public class A6_LetterFunctions {

	void display(String input) {

		for (int index = 0; index < input.length(); index++) {

			System.out.println(input.charAt(index));
		}
	}

	void reverse(String input) {

		for (int index = input.length() - 1; index >= 0; index--) {

			System.out.println(input.charAt(index));

		}
	}

	void occurence(String input, char ch) {

		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A6_LetterFunctions letter = new A6_LetterFunctions();
		letter.display("Technocredits");
		letter.reverse("Techno");
		letter.occurence("pratiksha", 'a');
	}

}
