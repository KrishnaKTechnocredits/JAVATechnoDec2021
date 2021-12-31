package ranjeet;

public class A10_PrimeNumber {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number.");
			// totalPrimeNO++;
		}
		return flag;
	}

	void AllPrimeNumber(int fNum, int lNum) {
		int totalPrimeNO = 0;
		int sum = 0;
		int verageOfPrimeNumber = 0;
		for (int startNo = fNum; startNo <= lNum; startNo++) {
			// totalPrimeNO = FindPrimeNumber(startNo, totalPrimeNO);

			if (isPrimeNumber(startNo)) {
				totalPrimeNO++;
				sum = sum + startNo;
			}
		}
		verageOfPrimeNumber = sum / totalPrimeNO;
		System.out.println("Total prime no count " + totalPrimeNO);
		System.out.println("Sum of all prime number in given range " + sum);
		System.out.println("Average of prime number " + verageOfPrimeNumber);
	}

	public static void main(String[] args) {
		A10_PrimeNumber primeNumber = new A10_PrimeNumber();
		// primeNumber.FindPrimeNumber(7);
		primeNumber.AllPrimeNumber(1, 30);
	}
}
