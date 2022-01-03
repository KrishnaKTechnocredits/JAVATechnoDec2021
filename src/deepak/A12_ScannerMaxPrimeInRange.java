/*Assignment - 12: 26th Dec'2021
Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 
1. print freq of each character in given String. [Program-1]
2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
6. Reverse number [program - 4]
*/
package deepak;

import java.util.Scanner;

public class A12_ScannerMaxPrimeInRange {
	int maxPrime;

	void isPrime(int num) {
		boolean isPrime = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			maxPrime = num;
		}
	}

	void getMaxPrimeNumFromRange(int startNum, int endNum) {
		for (int index = startNum; index <= endNum; index++) {
			isPrime(index);
		}
		System.out.println(maxPrime + " is the maximum prime number in the given range");
		System.out.println();
	}

	void inputFromUser() {
		System.out.println("Program2: Enter the range of numbers to get Max Prime number: ");
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		getMaxPrimeNumFromRange(startNum, endNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_ScannerMaxPrimeInRange scannerClass = new A12_ScannerMaxPrimeInRange();
		scannerClass.inputFromUser();
	}
}
