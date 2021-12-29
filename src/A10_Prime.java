
public class A10_Prime {

	int count;
	int sum;

// find prime number

	void findPrime(int num) {
		boolean flag = false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = true;

			}

		}

		if (flag == false) {
			// count++;
			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is not a prime number");

		}

	}

// find prime from range
	void findRange(int start, int end) {

		for (int i = start; i <= end; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				sum = sum + i;
				count++;
				System.out.println(i + " is a prime Number");

			}

		}
		System.out.println(sum);
		System.out.println(count);

	}
// find sum of Prime

	void findSum() {
		System.out.println("Sum of Prime number " + sum);
	}

//find count

	void findCount() {
		System.out.println("Count of Prime number " + count);
	}

	// find avergae

	void findAverage() {
		int avg = 0;
		avg = sum / count;
		System.out.println("Average is " + avg);
	}

	public static void main(String[] args) {
		A10_Prime prime = new A10_Prime();
		prime.findPrime(24);
		prime.findRange(7, 17);
		prime.findSum();
		prime.findCount();
		prime.findAverage();

	}

}
