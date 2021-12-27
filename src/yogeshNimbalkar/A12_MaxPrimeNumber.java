package yogeshNimbalkar;

import java.util.Scanner;

public class A12_MaxPrimeNumber {

	boolean isPrime(int num) {
		boolean flag = true;
		if(num <= 0 || num ==1) {
			flag = false;
		} else {
			for(int index = 2; index <= (num/2); index++) {
				if(num % index == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	void findMaxNumberInRange(int startNum, int endNum) {
		boolean res;
		int maxnumber = -1;
		for(int index = startNum; index <= endNum; index++) {
			res = isPrime(index);
			if(res == true)
				maxnumber = index;
		}
		System.out.println("Max prime number in range " + startNum + " to " + endNum + " is : " + maxnumber);
	}
	
	public static void main(String[] args) {
		A12_MaxPrimeNumber maxPrimeNumber = new A12_MaxPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start number of range : ");
		int startIndex = scanner.nextInt();
		System.out.println("Enter last number of range : ");
		int endIndex = scanner.nextInt();
		maxPrimeNumber.findMaxNumberInRange(startIndex, endIndex);
		scanner.close();
	}
}
