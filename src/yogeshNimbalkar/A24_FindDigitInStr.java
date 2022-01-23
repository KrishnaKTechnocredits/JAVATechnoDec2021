package yogeshNimbalkar;

import java.util.Arrays;
import java.util.Scanner;

public class A24_FindDigitInStr {

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
		A24_FindDigitInStr findDigitInStr = new A24_FindDigitInStr();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scanner.nextLine();
		String[] result = findDigitInStr.getArrayOfDigit(input);
		System.out.println(Arrays.toString(result));
		scanner.close();
	}
}