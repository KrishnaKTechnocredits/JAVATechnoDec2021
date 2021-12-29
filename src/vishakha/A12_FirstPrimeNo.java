package vishakha;

import java.util.Scanner;

public class A12_FirstPrimeNo {
	static int Previousprimeno;
	static int count;

	static void primeNo(int num) {
		boolean isPrime = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			Previousprimeno = num;
		}
	}

	static void AllprimeNo(int startNo, int endNo) {
		for (int index = startNo; index <= endNo; index++) {
			primeNo(index);
		}
		System.out.println("Maximum prime No : " + Previousprimeno);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter StartNumber :");
		int startNumber = scan.nextInt();
		System.out.println("Enter endNumber :");
		int EndNumber = scan.nextInt();
		AllprimeNo(startNumber, EndNumber);
		scan.close();
	}
}