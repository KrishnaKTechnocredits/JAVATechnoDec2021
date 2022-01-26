package sandip.Assignment_24;

public class Changing_case {

	void reverseCase(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
				} else {
					ch = Character.toUpperCase(ch);
				}
			}
			temp = temp + ch;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Changing_case c1 = new Changing_case();
		c1.reverseCase("teCHnOCreditS is BeST");
	}
}
