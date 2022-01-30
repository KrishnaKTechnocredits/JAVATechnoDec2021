/*1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5*/


package vrushali;

public class A24_TotalWordsInGivenString {

	void totalWordsInString(String input) {
		int count =0; 
		String[] name = input.split(" ");
		System.out.println("Total Words in given string: " + name.length);
		for(int index = 0; index < name.length; index++) {
			int lengthOfWord = name[index].length();
			System.out.println(name[index] + " --> "+ lengthOfWord );
		}		
	}

	public static void main(String[] args) {
		A24_TotalWordsInGivenString totalWordsInGivenString = new A24_TotalWordsInGivenString();
		totalWordsInGivenString.totalWordsInString("Hi Hello");
	}
}
