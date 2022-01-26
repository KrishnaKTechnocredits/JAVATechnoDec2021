package rahulGavali;
/*Assignment 24
IMPORTANT 
Program 4. WAP to reverse each word on the same index 
Input    : "Hi techno hello" 
Output : "iH onhcet olleh" 
*/
import java.util.Scanner;

public class A24_ReverseEachWord {

	String reverseWord(String str) {
		String reverseStr = "";
		for(int index=str.length()-1; index>=0; index--) {
			reverseStr += str.charAt(index);
		}
		return reverseStr;
	}
	
	String reverseString(String str) {
		String[] arr = str.split(" ");
		String temp = "";
		for(int index=0; index<arr.length; index++) {
			temp = temp + reverseWord(arr[index]) + " ";
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_ReverseEachWord reverseEachWord = new A24_ReverseEachWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.nextLine();
		System.out.println("Resultant string : " + reverseEachWord.reverseString(input).trim());
		scanner.close();
	}
}