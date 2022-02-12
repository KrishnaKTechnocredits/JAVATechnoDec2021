/*2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits*/

package vrushali;

public class Test6_MaxWordLength {

	void findMaxLengthWord(String input) {

		String[] name = input.split(" ");

		int max = 0;
		String maxLengthWord = " "; 

		for(int index =0; index<name.length; index++) {	
			int wordLength = name[index].length();
			if(wordLength> max) {
				max = wordLength;
				maxLengthWord = name[index];
			}
		}
		System.out.println(maxLengthWord);
	}

	public static void main(String[] args) {
		Test6_MaxWordLength maxWordLength = new Test6_MaxWordLength();
		maxWordLength.findMaxLengthWord("good morning technocredits hi hello");
	}
}
