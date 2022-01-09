package yogeshNimbalkar;

import java.util.Scanner;

// print the fibonacci number from the given starting and end number. 
public class A22_Fibonacci3 {

	void displayFiboInRange(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;
		if(startNum == 0) {
			System.out.print(num1 + " ");
		}
		while(num2 <= endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if(num2 >= startNum) {
				System.out.print(num1 + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		A22_Fibonacci3 fibonacci3 = new A22_Fibonacci3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start and end number of range :");
		int startNum = scanner.nextInt();
		int endNum = scanner.nextInt();
		fibonacci3.displayFiboInRange(startNum, endNum);
		scanner.close();
	}
}
