package rahulGavali;
/*Assignment 24- 16th Jan 2022   
Program 1. WAP to find out total words in a given string & print each word with its length 
Input   
: Hi Hello 
Output : 
	Total 2 words               
	Hi --> 2               
	Hello --> 5*/

import java.util.Scanner;


	public class A24_CountWordAndCharacters {

	void getWordCount(String str) {
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index] + " --> " + arr[index].length());
		}
	}
	
	public static void main(String[] args) {
		A24_CountWordAndCharacters countWordAndCharacters = new A24_CountWordAndCharacters();
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		countWordAndCharacters.getWordCount(input);
		scanner.close();
	}
}
