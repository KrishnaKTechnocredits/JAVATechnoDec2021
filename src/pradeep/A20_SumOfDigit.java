package pradeep;

import java.util.Scanner;

public class A20_SumOfDigit {
	void printSumOfDigitInString(String input) {
		int sum=0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				int num = Character.getNumericValue(input.charAt(index));
				sum=sum+ num;
			}
		}
		System.out.println("Sum of all Digit in given string is " + sum);
	}
	
	public static void main(String[] args) {
		A20_SumOfDigit a20_SumOfDigit =new A20_SumOfDigit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: ");
		String input = sc.next();
		a20_SumOfDigit.printSumOfDigitInString(input);
		sc.close();
	}
}
