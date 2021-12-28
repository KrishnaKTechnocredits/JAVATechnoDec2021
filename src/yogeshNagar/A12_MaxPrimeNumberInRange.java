package yogeshNagar;

import java.util.Scanner;

public class A12_MaxPrimeNumberInRange {
	int count;
	
	void primeNumberCount(int num) {
		boolean flag=true;
		for(int index = 2;index<num/2;index++) {
			if(num%index==0) {
				flag = false;
			}			
		}
		if(flag==true) {
			count++;
			System.out.println(num + " is prime number");
		}
	}
	
	void getMaxPrimeNumber(int startRange, int endRange) {
		for(int index=endRange;index>=startRange;index--) {
			primeNumberCount(index);
			if(count ==1) {
				System.out.print("and it is greatest");
				break;
			}
		}		
	}
	
	public static void main(String[] args) {
		A12_MaxPrimeNumberInRange maxPrime = new A12_MaxPrimeNumberInRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Range");
		int firstRangeNum = scanner.nextInt();
		System.out.println("Enter End Range");
		int LastRageNum = scanner.nextInt();
		maxPrime.getMaxPrimeNumber(firstRangeNum, LastRageNum);
		scanner.close();
	}
}
