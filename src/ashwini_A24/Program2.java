package ashwini_A24;

public class Program2 {
	void vowelsInWords(String str) {
		String[] output = str.split(" ");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " --> " + getVowelsInWord(output[index]));
		}

	}

	int getVowelsInWord(String str) {
		char ch;
		int vowelCount = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public static void main(String[] args) {
		Program2 vowelsInWord = new Program2();
		String inputString = "aashvi technocredits";
		vowelsInWord.vowelsInWords(inputString);
	}

}
