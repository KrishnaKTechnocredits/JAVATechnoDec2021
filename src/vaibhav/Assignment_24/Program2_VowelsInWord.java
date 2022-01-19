/* Assignment 24 : 16th Jan 2022

2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
              technocredits --> 4

*/

package vaibhav.Assignment_24;

public class Program2_VowelsInWord {

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
		Program2_VowelsInWord vowelsInWord = new Program2_VowelsInWord();
		String inputString = "aashvi technocredits";
		vowelsInWord.vowelsInWords(inputString);
	}

}
