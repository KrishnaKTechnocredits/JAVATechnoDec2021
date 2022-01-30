package rahulGavali;
/*Assignment24
Program 6. WAP to reverse each word and convert first letter of each word into capital 
Input : "Vrushali Sagar Shital"
Output : "IlahsurV RagaS LatihS" 
*/

import java.util.Scanner;

public class A24_ReverseEachWordWithFirstCap {

	String conFirstLetterCap(String str) {
		String result ="";
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		result = ch + str.substring(1);
		return result;
	}
	
	String reverseWord(String str) {
		String reverseStr = "";
		for(int index=str.length()-1; index>=0; index--) {
			reverseStr += str.charAt(index);
			reverseStr = conFirstLetterCap(reverseStr);
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
		A24_ReverseEachWordWithFirstCap revEachWordWithFirstCap = new A24_ReverseEachWordWithFirstCap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.nextLine();
		System.out.println("Resultant String : " + revEachWordWithFirstCap.reverseString(input).trim());
		scanner.close();
	}
}