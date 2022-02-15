package krishna;

public class KrishnaShaw_Test_6 {
	void nonRepeatingCaps_Char(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				if (Character.isUpperCase(ch)) {
					System.out.println("The first non repeating Capital character --> " + ch);
				}
		}
	}

	void findMaxLen(String str1) {
		String[] word = str1.split(" ");
		String maxlenWord = "";
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() >= maxlenWord.length()) {
				maxlenWord = word[i];
			}
		}
		System.out.println("maximum word length from a given statement  --> " + maxlenWord);

	}

	void sum(String str) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (temp.length() > 0) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals("")) {
			sum += Integer.parseInt(temp);
		}
		System.out.println("The sum of Number is : " + sum);
	}

	public static void main(String[] args) {
		KrishnaShaw_Test_6 tst = new KrishnaShaw_Test_6();
		tst.nonRepeatingCaps_Char("tEChNoCrEdits");

		tst.findMaxLen("good morning technocredits hi hello");

		tst.sum("10 10 20 30");
	}
}
