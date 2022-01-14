package vaibhav.Practice.ScannerClass;

import java.util.Scanner;

public class ScannerInConstructor {

	int num1, num2;

	ScannerInConstructor() {
		System.out.println("Please enter the new numbers :");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		scanner.close();
	}

	public static void main(String[] args) {
		ScannerInConstructor ScannerInConstructor = new ScannerInConstructor();

	}

}
