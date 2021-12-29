package technocredits.scannerdemo;

import java.util.Scanner;

public class Example3 {

	void findMaxPrimeInRange(int num1, int num2) {
		
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start range");
		int startNumber = scanner.nextInt();
		
		System.out.println("Enter end range number ");
		int endNumber = scanner.nextInt();
		
		example3.findMaxPrimeInRange(startNumber, endNumber);
		
		scanner.close();
	}
}
