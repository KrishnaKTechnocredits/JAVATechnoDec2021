package priyankaKamble.assignment_12;

import java.util.Scanner;

/*Assignment - 12 : 26th Dec'2021
Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 
2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3]
6. Reverse number [program - 4]*/
public class ScannerExample {
	int maxPrimeNumber = 0;
	boolean isPrime(int inputNum) {
		boolean flag = false;
		for (int index = 2; index < inputNum / 2; index++) {
			if (inputNum % index == 0)
				 return flag = true;
			//break;
		}
		
		if (flag == false) {
			System.out.println(inputNum + " is a Prime Number");
			maxPrimeNumber = inputNum;
		}
		return flag = false;
	}

	void maxPrimeNumber(int startNum, int lastNum) {
		for (int index = startNum; index <= lastNum; index++) {
			//if( isPrime(index) == false) {
				//maxPrimeNumber = index;
			//}
			isPrime(index);
			}
		
		System.out.println("\nMax prime number in given range = " + maxPrimeNumber + "\n");
	}

	public static void main(String[] args) {
		ScannerExample sc = new ScannerExample();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Number - ");
		int startNum = scanner.nextInt();
		System.out.println("Enter last Number -  ");
		int lastNum = scanner.nextInt();
		sc.maxPrimeNumber(startNum, lastNum);
	}
}
