package pranoti;

public class A24_P7_ReverseCaseOfEachChar {

	void reverseCase(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					temp = temp + Character.toLowerCase(ch);
				else
					temp = temp + Character.toUpperCase(ch);
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_P7_ReverseCaseOfEachChar p7 = new A24_P7_ReverseCaseOfEachChar();
		p7.reverseCase("TeCHnoC");
	}
}
