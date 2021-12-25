package sandip;

public class Assignment10 {
	int count;
	int store;
	int average;

	void primeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number");
			count++;
			store = num + store;
		}

	}

	void primeRange(int start, int end) {
		for (int index = start; index <= end; index++) {
			primeNumber(index);
		}
		System.out.println("Number of Prime Number :" + count);
	}

	void averageOfAllPrime() {
		average = (store / count);
		System.out.println("Average of all prime numbers is : " + average);
	}

	void additionPrime() {
		System.out.println("Prime Addition is :" + store);
	}

	public static void main(String[] args) {
		Assignment10 prime_1 = new Assignment10();
		prime_1.primeRange(10, 20);
		prime_1.additionPrime();
		prime_1.averageOfAllPrime();
		prime_1.primeNumber(17);

	}

}
