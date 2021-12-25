package naquibalam;

public class Test1_SumOfPrime {

	int findSumOfPrimeInARange(int startNum, int endNum, int countOfPrime) {
		int sumOfPrime = 0;
		int count = 1;
		for (int i = startNum; i <= endNum; i++) {
			boolean flag = true;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if ((flag == true) && (count <= countOfPrime)) {
				count++;
				sumOfPrime = sumOfPrime + i;
			}
		}
		return sumOfPrime;
	}
	
	public static void main(String[] args) {
		Test1_SumOfPrime test1_SumOfPrime = new Test1_SumOfPrime();
		int countToCheck = 10;
		int startNumber = 100;
		int endNumber = 200;
		int sumOfCountPrime = test1_SumOfPrime.findSumOfPrimeInARange(startNumber, endNumber, countToCheck);
		System.out.println("Sum of " + countToCheck + " Prime Numbers in range [" + startNumber + "," + endNumber + "] is " + sumOfCountPrime);

	}
}
