package yogeshNimbalkar;

import java.util.Scanner;

//from given string return the sum of digit 
public class A20_SumOfDigitInStr {

	void getSumOfDigit(String str) {
		int sum =0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}	
		System.out.println("Sum = " + sum);
	}
	
	public static void main(String[] args) {
		A20_SumOfDigitInStr sumOfDigitInStr = new A20_SumOfDigitInStr();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = scanner.next();
		sumOfDigitInStr.getSumOfDigit(input);
		scanner.close();
	}
}
