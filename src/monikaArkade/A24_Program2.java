/* WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
         technocredits --> 4
 */
package monikaArkade;

public class A24_Program2 {
	int cnt = 0;

	void findVowelsFromWord(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				count++;
				cnt++;
			}
		}
		System.out.println(word + " : " + count);
	}

	void findVowels(String input) {
		String[] word = input.split(" ");
		{
			for (int i = 0; i < word.length; i++) {
				findVowelsFromWord(word[i]);
			}
			System.out.println("Total vowels: " + cnt);
		}
	}

	public static void main(String[] args) {
		A24_Program2 p2 = new A24_Program2();
		String input = "aashvi technocredits";
		p2.findVowels(input);
	}
}
