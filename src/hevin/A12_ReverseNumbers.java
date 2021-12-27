package hevin;

import java.util.Scanner;

public class A12_ReverseNumbers {

	void reverseNumber(int num) {
		int rev = 0;
		while(num >0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num =num/10;
		}
		System.out.println("Reversed Number is : " +rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr numbers :");
		int num = sc.nextInt();
		A12_ReverseNumbers A12_ReverseNumbers =new A12_ReverseNumbers();
		A12_ReverseNumbers.reverseNumber(num);
		sc.close();
	}
	
}