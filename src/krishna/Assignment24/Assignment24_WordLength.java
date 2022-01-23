package krishna.Assignment24;

public class Assignment24_WordLength {
	void separateWordsLength(String input) {
		System.out.println(input + "--> " + input.length());
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			separateWordsLength(arr[index]);
		}
	}

	public static void main(String[] args) {
		Assignment24_WordLength ass24 = new Assignment24_WordLength();
		ass24.spiltWordsInString("Hi Hello");
	}
}
