package naquibalam;

import java.util.Scanner;

public class Test3_MaxNumber {
	
	int getMaxNumber(int input) {
		int max = 0;
		while (input > 0) {
			if ((input % 10) > max) {
				max = input % 10;
			}
			input = input / 10;
		} 
		return max;
	}

	public static void main(String[] args) {
		Test3_MaxNumber test3_MaxNumber = new Test3_MaxNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the Integer from which you want max value : ");
		int input = scanner.nextInt();
		System.out.println("Max number from the given Integer is : " + test3_MaxNumber.getMaxNumber(input));
		scanner.close();
	}
}
