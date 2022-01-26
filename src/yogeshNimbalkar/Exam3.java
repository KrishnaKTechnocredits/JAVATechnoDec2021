package yogeshNimbalkar;

import java.util.Scanner;

public class Exam3 {

	int getMaxDigit(int num) {
		int maxDigit = 0;
		int rem;
		num = Math.abs(num);
		while(num > 0) {
			rem = num % 10;
			if(maxDigit < rem)
				maxDigit = rem;
			num = num / 10;
		}
		return maxDigit;
	}
	public static void main(String[] args) {
		Exam3 findMaxDigit = new Exam3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int input = sc.nextInt();
		System.out.println("Max digit in given number is :" + findMaxDigit.getMaxDigit(input));
		sc.close();
	}
}
