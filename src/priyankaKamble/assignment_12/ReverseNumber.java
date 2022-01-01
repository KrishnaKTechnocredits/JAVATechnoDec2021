package priyankaKamble.assignment_12;

import java.util.Scanner;

public class ReverseNumber {

	int reverseNumber(int number) {
		int reversenum = 0;
		while (number != 0) {
			int remder = number % 10;
			reversenum = reversenum * 10 + remder;
			number = number / 10;
		}
		return reversenum;
	}

	public static void main(String[] args) {
		ReverseNumber sc = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to reverse - ");
		int number = scanner.nextInt();
		System.out.println("reverse number of " + number + " is - " + sc.reverseNumber(number));
	}
}
