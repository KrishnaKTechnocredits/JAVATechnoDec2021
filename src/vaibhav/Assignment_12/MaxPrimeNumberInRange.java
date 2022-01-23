/* Assignment - 12 : 26th Dec'2021 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class.

2. find max prime number from given range.[range : 2 to 100, ans ; 97] [Program-2]

*/

package vaibhav.Assignment_12;

import java.util.Scanner;

public class MaxPrimeNumberInRange {

	boolean isPrimenumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void maxPrimeNumInRange(int startNum, int endNum) { // 20 15 3
		int maxPrimeNumber = 0;
		if (startNum > endNum) {
			startNum = startNum + endNum; // 35
			endNum = startNum - endNum; // 20
			startNum = startNum - endNum;
		}

		for (int index = startNum; index <= endNum; index++) {

			if (isPrimenumber(index))
				maxPrimeNumber = index;

		}

		System.out.println(
				"Maximum prime number in the given range " + startNum + " to " + endNum + " is : " + maxPrimeNumber);

	}

	public static void main(String[] args) {
		MaxPrimeNumberInRange maxPrimeNumberInRange = new MaxPrimeNumberInRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the range in which we need to find the max prime number :");
		maxPrimeNumberInRange.maxPrimeNumInRange(scanner.nextInt(), scanner.nextInt());
		scanner.close();
	}

}
