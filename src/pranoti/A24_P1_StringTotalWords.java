package pranoti;

public class A24_P1_StringTotalWords {

	void wordWithlen(String input) {
		String[] arr = input.split(" ");
		System.out.println("Total " + arr.length + " Words");
		for (String word : arr) {
			System.out.println(word + "-->" + word.length());
		}
	}

	public static void main(String[] args) {
		A24_P1_StringTotalWords a24_P1_StringTotalWords = new A24_P1_StringTotalWords();
		a24_P1_StringTotalWords.wordWithlen("Hi Hello");
	}
}
