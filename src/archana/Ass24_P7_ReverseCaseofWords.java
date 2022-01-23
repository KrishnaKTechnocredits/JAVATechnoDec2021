package archana;

public class Ass24_P7_ReverseCaseofWords {
	String reverseCaseodletterInWord(String input) {
		String reverseCase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch = Character.toLowerCase(ch);
			reverseCase = reverseCase + ch;
		}
		return reverseCase;
	}

	void spiltString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseCaseodletterInWord(arr[index]);
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		Ass24_P7_ReverseCaseofWords ass24 = new Ass24_P7_ReverseCaseofWords();
		ass24.spiltString("TeCHnoCReditS");
	}
}
