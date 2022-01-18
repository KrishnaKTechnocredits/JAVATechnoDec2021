package yogeshNimbalkar;

import java.util.Scanner;

//Find out total words in string and print each word with its length
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
