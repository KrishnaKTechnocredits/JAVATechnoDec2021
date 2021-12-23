package sandip;

public class Assignment07 {

	void evenPosition(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index % 2 != 0)
				System.out.print(input.charAt(index));
		}
	}

	void vowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			char data = input.charAt(index);
			if (data == 'a' || data == 'e' || data == 'i' || data == 'o' || data == 'u') {
				System.out.print(data);
			}
		}
	}

	public static void main(String[] args) {
		Assignment07 assignment07 = new Assignment07();
		assignment07.evenPosition("technocredits");
		System.out.println();
		assignment07.vowels("technocredits");
	}
}
