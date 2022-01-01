package pradeep;

import java.util.Scanner;

public class A12_Program4 {
	int reverseNumber(int num) {
		int rev = 0;
		while(num>0) {
			int r =num%10;
			rev =rev*10 + r;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		A12_Program4 a12_Program4 = new A12_Program4();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rev = a12_Program4.reverseNumber(num);
		System.out.println("Reverse number is : "+ rev);
		sc.close();
	}
}
