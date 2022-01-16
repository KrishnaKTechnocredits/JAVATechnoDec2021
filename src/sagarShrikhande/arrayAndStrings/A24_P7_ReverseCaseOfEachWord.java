package sagarShrikhande.arrayAndStrings;

public class A24_P7_ReverseCaseOfEachWord {

	String reverseCaseOfCharsInWord(String input) {
		String reverseCase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch= Character.toLowerCase(ch);
			reverseCase += ch;
		}
		return reverseCase;
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseCaseOfCharsInWord(arr[index]);
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P7_ReverseCaseOfEachWord a24_P7_ReverseCaseOfEachWord = new A24_P7_ReverseCaseOfEachWord();
		a24_P7_ReverseCaseOfEachWord.spiltWordsInString("TeCHnoCReditS");
	}
}
