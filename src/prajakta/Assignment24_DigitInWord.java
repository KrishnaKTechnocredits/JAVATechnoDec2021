package prajakta;

public class Assignment24_DigitInWord {
	void digitInWord(String data) {
		String collect = " ";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (Character.isDigit(ch))
				collect += ch;
		}
		System.out.print(collect);
	}

	void splitWords(String provide) {
		String[] arr = provide.split(" ");
		for (int i = 0; i < arr.length; i++)
			digitInWord(arr[i]);
	}

	public static void main(String [] args) {
		Assignment24_DigitInWord ass24 = new Assignment24_DigitInWord();
		ass24.splitWords("Te1c2h C94re3");
	}

}