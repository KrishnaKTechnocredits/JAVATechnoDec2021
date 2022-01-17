package yogeshNimbalkar;

import java.util.Scanner;

//find out total vowels in each word in given string
public class A24_CountVowelsInWord {

	int findVowelsInWord(String str) {
		str.toLowerCase();
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}
	
	void findVowels(String str) {
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			System.out.println(arr[index] + " --> " + findVowelsInWord(arr[index]));
		}
	}
	
	public static void main(String[] args) {
		A24_CountVowelsInWord countVowelsInWord = new A24_CountVowelsInWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.nextLine();
		countVowelsInWord.findVowels(input);
		scanner.close();
	}
}
