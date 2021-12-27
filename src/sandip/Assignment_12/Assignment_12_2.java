package sandip.Assignment_12;

import java.util.Scanner;

public class Assignment_12_2 {
	int count;
	int store;
	int average;

	void primeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number");
			count++;
			store = num;
		}

	}

	void primeRange(int start, int end) {
		for (int index = start; index <= end; index++) {
			primeNumber(index);
		}
		System.out.println("Number of Prime Number :" + count);
		System.out.println("Max. prime number is : " + store);
	}

	public static void main(String[] args) {
		Assignment_12_2 prime = new Assignment_12_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Range for prime number : ");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		prime.primeRange(i1, i2);
		scanner.close();
	}
}
