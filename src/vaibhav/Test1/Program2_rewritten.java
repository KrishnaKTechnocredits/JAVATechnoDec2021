/*Test - 1 : 25th Dec'2021

Program 2 : find sum of first 10 prime numbers in given range. 

*/

package vaibhav.Test1;

public class Program2_rewritten {

	boolean isNumPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		// if (flag)
		// System.out.println(num + " is prime");
		// else
		// System.out.println(num + " is not prime");
		return flag;
	}

	void getSumOfFirstTenPrimeInRange(int startNum, int endNum) {
		int primeCnt = 0;
		int sum = 0;
		int index;

		if (startNum > endNum) {
			int temp = startNum;
			startNum = endNum;
			endNum = temp;
		}

		if (startNum <= 1) {
			index = 2;
		} else {
			index = startNum;
		}

		while (primeCnt <= 10 && index <= endNum) {

			if (isNumPrime(index)) {
				primeCnt++;
				sum = sum + index;
				// System.out.println(index + " -- " + sum);
			}
			if (primeCnt == 10)
				break;
			else
				index++;
		}

		if (primeCnt == 10)
			System.out.println(
					"Sum of first 10 prime numbers in the given range " + startNum + " to " + endNum + " is : " + sum);
		else {
			System.out.println("Sum of first " + primeCnt + " prime numbers in the given range " + startNum + " to "
					+ endNum + " is : " + sum);
		}
	}

	public static void main(String[] args) {
		Program2_rewritten program2_rewritten = new Program2_rewritten();
		program2_rewritten.getSumOfFirstTenPrimeInRange(60, -10);
	}

}
