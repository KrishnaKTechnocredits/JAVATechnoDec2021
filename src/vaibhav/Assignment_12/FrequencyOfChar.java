/* Assignment - 12 : 26th Dec'2021 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class.

1. print freq of each character in given String. [Program-1]

*/

package vaibhav.Assignment_12;

public class FrequencyOfChar {

	int getFreqOfChar(String input, char ch) {
		int charFreq = 0;

		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) == ch) {
				charFreq++;
			}
		}
		return charFreq;
	}

	void printFreqOfEachChar(String input) {
		System.out.println("Frequency of each character in given string \"" + input + "\" is :");
		char ch = ' ';
		for (int index = 0; index <= input.length() - 1; index++) {
			ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				System.out.println(ch + " --> " + getFreqOfChar(input, ch));
			}
		}

	}

	public static void main(String[] args) {
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		frequencyOfChar.printFreqOfEachChar("technocredits");
	}
}
