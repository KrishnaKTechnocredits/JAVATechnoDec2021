/*Program 2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
         technocredits --> 4
 */
package shwetaDharmadhikari.string_assignmment24;

public class DisplayVowelsCountFromString {

	void vowelsInString(String str) {
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
			int wordLength = input[index].length();
			String word = input[index];
			int wordVowel = 0;
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U')
					wordVowel++;
			}
			System.out.println("Vowels in the word " + word + " --> " + wordVowel);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aashvi technocredits";
		DisplayVowelsCountFromString displayVowelsCountFromString = new DisplayVowelsCountFromString();
		displayVowelsCountFromString.vowelsInString(input);
	}

}
