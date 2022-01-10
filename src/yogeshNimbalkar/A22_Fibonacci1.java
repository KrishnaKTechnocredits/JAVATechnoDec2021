package yogeshNimbalkar;

import java.util.Scanner;

// print first N numbers of fibbonacci series
public class A22_Fibonacci1 {

	void displayFibonacci(int num) {
		int num1 = 0;
		int num2 = 1;
		if(num >= 2) {
			System.out.print(num1 + " " + num2 + " ");
		}else if(num == 1) {
			System.out.print(num1 + " ");
		}
		
		for (int i=1; i<=num-2; i++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.print(num2+ " ");
		}
	}
	
	public static void main(String[] args) {
		A22_Fibonacci1 fibonacci1 = new A22_Fibonacci1();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter how many number to display from series : ");
		int input = scanner.nextInt();
		fibonacci1.displayFibonacci(input);
		scanner.close();
	}
}
