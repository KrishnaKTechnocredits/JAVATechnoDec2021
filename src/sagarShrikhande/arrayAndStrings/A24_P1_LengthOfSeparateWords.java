package sagarShrikhande.arrayAndStrings;

public class A24_P1_LengthOfSeparateWords {

	void separateWordsFromStringAndPrintLength(String input) {
		System.out.println(input + "--> " + input.length());

	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			separateWordsFromStringAndPrintLength(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P1_LengthOfSeparateWords a24_P1_LengthOfSeparateWords = new A24_P1_LengthOfSeparateWords();
		a24_P1_LengthOfSeparateWords.spiltWordsInString("Hi Hello");
	}

}
