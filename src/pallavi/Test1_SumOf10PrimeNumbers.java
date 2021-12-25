package pallavi;

public class Test1_SumOf10PrimeNumbers {

	boolean isPrimeNumber(int num) {
		boolean isprime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isprime = false;
				break;
			}
		}

		return isprime;
	}

	void sumOf10Primenum(int startnum, int endnum) {
		int cnt = 0;
		int num = startnum;
		int sum = 0;
		while (cnt < 10 && num <= endnum) {
			if (isPrimeNumber(num) == true) {
				cnt++;
				sum = sum + num;

			}
			num++;
		}
		System.out.print("Sum of first 10 prime numbers in range " + startnum + " to " + endnum + " is:" + sum);
	}

	public static void main(String[] Arr) {
		Test1_SumOf10PrimeNumbers test1_SumOf10PrimeNumbers = new Test1_SumOf10PrimeNumbers();

		test1_SumOf10PrimeNumbers.sumOf10Primenum(10, 100);

	}
}