package vaishnavi;

import java.util.Scanner;

public class A12_P4_ReverseNumber {

	int reverseNum(int num) {
		int reverseNumber=0;
		while(num > 0) {
			reverseNumber = reverseNumber * 10 + (num % 10);
			num = num / 10;
		}
		return reverseNumber;
	}
	public static void main(String[] args) {
		A12_P4_ReverseNumber a12_P4_ReverseNumber = new A12_P4_ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int revNum = a12_P4_ReverseNumber.reverseNum(num);
		System.out.println("Reverse number is : "+ revNum);
		sc.close();
		
	}

}
