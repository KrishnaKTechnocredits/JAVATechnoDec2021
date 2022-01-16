package yogeshNimbalkar;

import java.util.Scanner;

//how many numbers required to check sum >= 50 in fibonacci series
public class A22_Fibonacci4 {

	int getCount(int total) {
		int num1 = 0; 
		int num2 = 1;
		int count = 0;
		int sum =0;
		if(total >= 0) {
			count++;
			sum = num1 + num2;
		}
		while(sum <= total) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		A22_Fibonacci4 fibonacci4 = new A22_Fibonacci4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total :");
		int total = scanner.nextInt();
		int count = fibonacci4.getCount(total);
		System.out.println("Total number required to get sum = " + total + " is " + count);
		scanner.close();
	}
}
