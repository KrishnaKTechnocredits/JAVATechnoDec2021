package kalyani;

import java.util.Scanner;

class A12_Rev_Num{

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
		System.out.println("enter numbers :");
		int num = sc.nextInt();
		A12_Rev_Num revnum = new A12_Rev_Num();
		revnum.reverseNumber(num);
		sc.close();
	}
}