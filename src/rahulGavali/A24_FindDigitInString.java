package rahulGavali;
/*Assignment24
Program 3. WAP to return array of words containing only digits. 
Input    : "Te1c2h C94re3" 
Output : "12" "943"*/

import java.util.Arrays;
import java.util.Scanner;

public class A24_FindDigitInString {

	String[] getArrayOfDigit (String str) {
		String[] arr = str.split(" ");
		String[] output = new String[arr.length];
		for(int index=0; index<arr.length; index++) {
			output[index] = filterDigit(arr[index]); 
		}
		return output;
	}
	
	String filterDigit(String str) {
		String temp ="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				temp +=ch;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_FindDigitInString findDigitInStr = new A24_FindDigitInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scanner.nextLine();
		String[] result = findDigitInStr.getArrayOfDigit(input);
		System.out.println(Arrays.toString(result));
		scanner.close();
	}
}