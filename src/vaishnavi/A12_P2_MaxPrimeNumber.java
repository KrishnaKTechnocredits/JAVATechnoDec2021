package vaishnavi;

import java.util.Scanner;

public class A12_P2_MaxPrimeNumber {
	int primeNumber;
	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2;index<=num/2;index++) {
			if(num%index==0) {
			return flag = false;
			}
		}
			return flag = true;
	}
	void findMaxPrimeNumber(int firstNum, int lastNum) {
		int maxPrimeCount=0;
		for(int index = firstNum; index <= lastNum; index++) {
			if(isPrimeNumber(index)==true) {
				maxPrimeCount=index;
			}
			
		}
		System.out.println("Maximum prime number from given range is :" +maxPrimeCount);
	}

	public static void main(String[] args) {
		A12_P2_MaxPrimeNumber a12_P2_MaxPrimeNumber= new A12_P2_MaxPrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number from range :");
		int startIndex = sc.nextInt();
		System.out.println("Enter end number from range :");
		int endIndex = sc.nextInt();
		a12_P2_MaxPrimeNumber.findMaxPrimeNumber(startIndex,endIndex);
		sc.close();

	}

}
