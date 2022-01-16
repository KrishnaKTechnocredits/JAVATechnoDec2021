package nehaPandey;

import java.util.Scanner;

public class A12_P2_Scanner_Example {
	int maxPrimeNumber ;

	int isPrimeNumberLogic(int num) {
		boolean flag = true;
		
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			maxPrimeNumber = num;

		}
		return maxPrimeNumber;
	}

	void primeNumbersInRange(int firstNum, int secondNum) {

		for (int range = secondNum; range >= firstNum; range--) {
			maxPrimeNumber = isPrimeNumberLogic(range);
			if (maxPrimeNumber != 0)
				break;

		}
		System.out.println("Max Prime Num is: " + maxPrimeNumber);
	}

	public static void main(String[] args) {
		A12_P2_Scanner_Example as = new A12_P2_Scanner_Example();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter start number of range: ");
		int num1 = sc.nextInt();

		System.out.println("Enter End number of range: ");
		int num2 = sc.nextInt();

		as.primeNumbersInRange(num1, num2);
		sc.close();
	}

}
