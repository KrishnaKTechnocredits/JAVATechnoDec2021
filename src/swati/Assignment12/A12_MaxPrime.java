package swati.Assignment12;

import java.util.Scanner;

public class A12_MaxPrime {

	boolean printPrime(int num) {
		int i = 2;
		boolean flag = false;
		while (i < num) {
			if (num % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		return flag;

	}

	void printRange(int start, int end) {
		int max = 0;
		while (start < end) {

			boolean flag = printPrime(start);

			if (flag == true) {
				// System.out.println(start + " is not prime");
			} else {
				System.out.println(start + " is prime");
				max = start;
			}
			start++;
		}
		System.out.println("Maximum Prime number is " + max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_MaxPrime prime = new A12_MaxPrime();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range for prime number");
		int start = scan.nextInt();
		int end = scan.nextInt();
		prime.printRange(start, end);

	}

}
