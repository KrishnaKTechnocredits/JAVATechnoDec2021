package krishna;

import java.util.Scanner;

public class Assignment_12_MaxPrimeNumrange {
	 
	int count;
	int pNum;
		
	boolean primeNum(int num1) {
		for(int i=2; i<=num1/2; i++) {
			if(num1 % i == 0) {
				return false; 
			}
		}
		return true;
	}
		
	void findMax(int fNum, int lNum) { 
		int max = 0;
		for(int index =fNum; index<=lNum; index++) {
			if(primeNum(index) == true) {
		        	 max=index;
		    }
		}
		System.out.println("The Largest prime number in given range is :"+max);
	}
		
	public static void main(String[] args) {
		Assignment_12_MaxPrimeNumrange maxPrimeNum = new Assignment_12_MaxPrimeNumrange();
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter start range");
		int start = scanner.nextInt();
		
		System.out.println("Enter end range number ");
		int end = scanner.nextInt();
		maxPrimeNum.findMax(start, end);
		scanner.close();
	}
}