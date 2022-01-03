package ashish;

import java.util.Scanner;

public class A12_MaxPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0, end = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter start value : ");
		start = scanner.nextInt();
		System.out.println(" Enter end value : ");
		end = scanner.nextInt();
		A12_MaxPrimeNumber maxPrimeNumber = new A12_MaxPrimeNumber();
		maxPrimeNumber.findMaxPrimeNumberInRange(start, end);
		scanner.close();
	}

	void findMaxPrimeNumberInRange(int start, int end) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int maxPrime = 0;
		for(int i = start; i<= end; i++) {
			isPrime = true;
			for(int j = 2; j<=(i/2); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true && i>maxPrime) {
				maxPrime = i;
			}		
		}
		if(maxPrime == 0)
			System.out.println(" No Prime Number Found in range (" + start + "," + end + ")");
		else
			System.out.println(" Max Prime Number Found in range (" + start + "," + end + ") is : " + maxPrime);
	}
}
