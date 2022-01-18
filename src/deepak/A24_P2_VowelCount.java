/*Assignment 24- 16th Jan 2022   
	Program 2. WAP to find our total vowels in each word from the given string 
	Input    : aashvi technocredits 
	Output : aashvi --> 3               
	technocredits --> 4 /
*/
package deepak;

public class A24_P2_VowelCount {

	void getVowelCount(String input) {
		int vowelCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println(input + " ---> " + vowelCount);
	}

	void printStringDesc(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			getVowelCount(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P2_VowelCount wordCount = new A24_P2_VowelCount();
		wordCount.printStringDesc("aashvi technocredits");
	}
}
