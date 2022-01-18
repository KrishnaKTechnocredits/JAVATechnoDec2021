/*Assignment 24- 16th Jan 2022   
	Program 1. WAP to find out total words in a given string & print each word with its length 
	Input   
	: Hi Hello 
	Output : 
		Total 2 words               
		Hi --> 2               
		Hello --> 5*/
package deepak;

public class A24_P1_WordCountInString {

	void getStringlength(String input) {
		System.out.println(input + " --> " + input.length());
	}

	void printStringDesc(String input) {
		String[] arr = input.split(" ");
		System.out.println("Total " + arr.length + " words");
		for (int index = 0; index < arr.length; index++) {
			getStringlength(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P1_WordCountInString wordCount = new A24_P1_WordCountInString();
		wordCount.printStringDesc("Hi Hello");

	}

}
