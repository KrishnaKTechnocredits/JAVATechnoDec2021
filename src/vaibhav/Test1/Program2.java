/*Test - 1 : 25th Dec'2021

Program 2 : find sum of first 10 prime numbers in given range. 

*/

package vaibhav.Test1;

public class Program2 {

	boolean isNumberPrime(int num) {
		boolean primeFlag = false;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index != 0) {
				primeFlag = true;
			}
		}
		return primeFlag;
	}

	void getSumOfFirstTenPrimeInRange(int startNum, int endNum) {
		int primeCnt = 0;
		int sum = 0;
		int index = startNum;
		while (primeCnt <= 10 && index <= endNum) {
			boolean sumFlag = isNumberPrime(index);
			if (sumFlag == true) {
				primeCnt++;
				sum = sum + index;
			}
		}
		if (primeCnt < 10) {
			System.out.println("In the given range " + startNum + " to " + endNum + " we can only have " + primeCnt
					+ " prime numbers");
			System.out.println("Sum of first " + primeCnt + " prime numbers in the given range is : " + sum);
		} else {
			System.out.println(
					"Sum of first 10 prime numbers in the given range " + startNum + " to " + endNum + " is : " + sum);
		}
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		program2.getSumOfFirstTenPrimeInRange(10, 200);
	}
}
