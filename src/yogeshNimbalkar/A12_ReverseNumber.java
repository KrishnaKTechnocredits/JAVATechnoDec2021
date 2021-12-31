package yogeshNimbalkar;

import java.util.Scanner;

public class A12_ReverseNumber {

	int getReverseNumber(int num) {
		int reversenum = 0;
		while(num > 0) {
			reversenum = reversenum * 10 + (num % 10);
			num = num / 10;
		}
		return reversenum;
//		System.out.println("Reverse number - " + reversenum);
	}
	
	public static void main(String[] args) {
		A12_ReverseNumber reverseNumber = new A12_ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();
		int res = reverseNumber.getReverseNumber(input);
		System.out.println("Reverse number - " + res);
		scanner.close();
	}
}
