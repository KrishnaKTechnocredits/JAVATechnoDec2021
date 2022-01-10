package yogeshNimbalkar;

import java.util.Scanner;

//First N numbers, but consider the start number is given by user e.g. start number = 5 
public class A22_Fibonacci2 {

	void displayFibonnaci(int num, int startNum) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		if(startNum == 0) {
			System.out.print(num1 + " ");
			count++;
		}
		while(count < num) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2 >= startNum) {
				System.out.print(num2 + " ");
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		A22_Fibonacci2 fibnacci2 = new A22_Fibonacci2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many numbers to display :");
		int input = scanner.nextInt();
		System.out.println("Enter the starting number from where the series start :" );
		int startNum = scanner.nextInt();
		fibnacci2.displayFibonnaci(input, startNum);
		scanner.close();
	}
}
