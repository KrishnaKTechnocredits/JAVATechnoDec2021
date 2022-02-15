package pranoti;

public class A24_P4_ReverseWord {

	String reverseWord(String input) {
		String revStr = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			revStr = revStr + input.charAt(index);
		}
		return revStr;
	}

	void reverseWordAtSameIndex(String input) {
		String[] word = input.split(" ");
		String temp = "";
		for (int index = 0; index < word.length; index++) {
			temp = temp + reverseWord(word[index]) + " ";
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P4_ReverseWord a24_P4_ReverseWord = new A24_P4_ReverseWord();
		a24_P4_ReverseWord.reverseWordAtSameIndex("Hi techno hello");
	}
}
