package pradeep;

import java.util.Scanner;

public class A12_Program2 {
	int findPrimeNumber(int primeNum) {
		for(int index=2; index<=primeNum/2; index++) {
			if(primeNum%index == 0) {
				return 0;
			}
		}
	return primeNum;
	}
	
	void findallPrimeNumber(int startNum, int endNum) {
		for(int index=startNum; index<=endNum; index++) {
			int primeNum = findPrimeNumber(index);
			if(primeNum == 0) {
				//don't do anything because its not a prime number
			}else{
				System.out.println(primeNum + " is a Prime Number");
			}			
		}
	}
	
	void findMaxPrimeNumber(int startNum, int endNum) {
		for(int index=endNum; index>=startNum; index--) {
			int primeNum = findPrimeNumber(index);
			if(primeNum == 0) {
				//don't do anything because its not a prime number
			}else{
				System.out.println(primeNum + " is the Maximum Prime Number");
				break;
			}			
		}
	}
	
	public static void main(String[] args) {
		A12_Program2 a12_Program2 =new A12_Program2();
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		a12_Program2.findallPrimeNumber(startNum, endNum);
		a12_Program2.findMaxPrimeNumber(startNum, endNum);
		sc.close();
	}

}
